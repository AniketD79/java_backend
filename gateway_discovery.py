"""
Zigbee Gateway UDP Discovery Service
=====================================
Implements UDP broadcast discovery for Zigbee gateways on the local network.

Protocol:
- Port: 9090
- Client sends broadcast: "GETIP\r\n"
- Gateway responds with: "SN:<SNID>"
- Client can discover gateway's SNID and IP address from the response
"""

import socket
import struct
import time
from typing import List, Tuple, Optional


class GatewayDiscovery:
    """UDP-based gateway discovery client"""
    
    DISCOVERY_PORT = 9090
    DISCOVERY_MESSAGE = "GETIP\r\n"
    TIMEOUT = 3  # seconds
    
    def __init__(self, timeout: int = TIMEOUT):
        """
        Initialize the gateway discovery client.
        
        Args:
            timeout: Socket timeout in seconds
        """
        self.timeout = timeout
        self.sock = None
    
    def discover_gateways(self, retries: int = 3) -> List[Tuple[str, str]]:
        """
        Discover all gateways on the local network.
        
        Args:
            retries: Number of discovery attempts
            
        Returns:
            List of tuples containing (gateway_ip, gateway_snid)
        """
        discovered_gateways = []
        
        for attempt in range(retries):
            print(f"Discovery attempt {attempt + 1}/{retries}...")
            gateways = self._send_discovery_broadcast()
            
            for gateway in gateways:
                if gateway not in discovered_gateways:
                    discovered_gateways.append(gateway)
            
            if discovered_gateways and attempt < retries - 1:
                time.sleep(0.5)  # Brief pause between retries
        
        return discovered_gateways
    
    def _send_discovery_broadcast(self) -> List[Tuple[str, str]]:
        """
        Send UDP broadcast and collect responses.
        
        Returns:
            List of tuples containing (gateway_ip, gateway_snid)
        """
        gateways = []
        
        try:
            # Create UDP socket
            self.sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
            self.sock.setsockopt(socket.SOL_SOCKET, socket.SO_BROADCAST, 1)
            self.sock.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
            self.sock.settimeout(self.timeout)
            
            # Bind to any available port
            self.sock.bind(('', 0))
            
            # Get broadcast address
            broadcast_addr = self._get_broadcast_address()
            
            # Send discovery broadcast
            print(f"Sending discovery broadcast to {broadcast_addr}:{self.DISCOVERY_PORT}")
            self.sock.sendto(
                self.DISCOVERY_MESSAGE.encode('utf-8'),
                (broadcast_addr, self.DISCOVERY_PORT)
            )
            
            # Collect responses
            start_time = time.time()
            while time.time() - start_time < self.timeout:
                try:
                    data, addr = self.sock.recvfrom(1024)
                    gateway_ip = addr[0]
                    response = data.decode('utf-8', errors='ignore')
                    
                    # Parse response: "SN:<SNID>"
                    if response.startswith("SN:"):
                        gateway_snid = response[3:].strip()
                        gateways.append((gateway_ip, gateway_snid))
                        print(f"Found gateway: IP={gateway_ip}, SNID={gateway_snid}")
                    else:
                        print(f"Received unexpected response from {gateway_ip}: {response}")
                        
                except socket.timeout:
                    break
                except Exception as e:
                    print(f"Error receiving response: {e}")
                    break
            
        except Exception as e:
            print(f"Discovery error: {e}")
        finally:
            if self.sock:
                self.sock.close()
                self.sock = None
        
        return gateways
    
    def _get_broadcast_address(self) -> str:
        """
        Get the broadcast address for the local network.
        
        Returns:
            Broadcast address as string
        """
        try:
            # Try to get local IP first
            s = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
            s.connect(("8.8.8.8", 80))
            local_ip = s.getsockname()[0]
            s.close()
            
            # Calculate broadcast address (assumes /24 subnet)
            ip_parts = local_ip.split('.')
            broadcast = f"{ip_parts[0]}.{ip_parts[1]}.{ip_parts[2]}.255"
            return broadcast
        except:
            # Fallback to general broadcast
            return "255.255.255.255"


class GatewayDiscoveryServer:
    """UDP-based gateway discovery server (for gateway side)"""
    
    DISCOVERY_PORT = 9090
    DISCOVERY_MESSAGE = "GETIP\r\n"
    
    def __init__(self, gateway_snid: str):
        """
        Initialize the gateway discovery server.
        
        Args:
            gateway_snid: The gateway's SNID (serial number)
        """
        self.gateway_snid = gateway_snid
        self.sock = None
        self.running = False
    
    def start(self):
        """Start the discovery server"""
        try:
            # Create UDP socket
            self.sock = socket.socket(socket.AF_INET, socket.SOCK_DGRAM)
            self.sock.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
            
            # Bind to discovery port
            self.sock.bind(('', self.DISCOVERY_PORT))
            self.running = True
            
            print(f"Gateway discovery server started on port {self.DISCOVERY_PORT}")
            print(f"Gateway SNID: {self.gateway_snid}")
            
            while self.running:
                try:
                    data, addr = self.sock.recvfrom(1024)
                    message = data.decode('utf-8', errors='ignore')
                    
                    # Check if it's a discovery request
                    if message == self.DISCOVERY_MESSAGE:
                        print(f"Discovery request from {addr[0]}:{addr[1]}")
                        
                        # Send response with SNID
                        response = f"SN:{self.gateway_snid}"
                        self.sock.sendto(response.encode('utf-8'), addr)
                        print(f"Sent response: {response}")
                    else:
                        print(f"Received unknown message from {addr}: {message}")
                        
                except socket.timeout:
                    continue
                except Exception as e:
                    if self.running:
                        print(f"Error handling discovery request: {e}")
            
        except Exception as e:
            print(f"Discovery server error: {e}")
        finally:
            self.stop()
    
    def stop(self):
        """Stop the discovery server"""
        self.running = False
        if self.sock:
            self.sock.close()
            self.sock = None
        print("Gateway discovery server stopped")


def main():
    """Main function for testing"""
    import sys
    
    if len(sys.argv) > 1 and sys.argv[1] == 'server':
        # Run as server (gateway side)
        snid = sys.argv[2] if len(sys.argv) > 2 else "TEST-GATEWAY-001"
        server = GatewayDiscoveryServer(snid)
        try:
            server.start()
        except KeyboardInterrupt:
            print("\nShutting down server...")
            server.stop()
    else:
        # Run as client (discovery)
        print("=== Zigbee Gateway Discovery ===")
        discovery = GatewayDiscovery(timeout=3)
        gateways = discovery.discover_gateways(retries=2)
        
        if gateways:
            print(f"\n✓ Found {len(gateways)} gateway(s):")
            for ip, snid in gateways:
                print(f"  - IP: {ip}, SNID: {snid}")
        else:
            print("\n✗ No gateways found on the local network")


if __name__ == "__main__":
    main()
