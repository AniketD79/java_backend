 interface PaymentService {

    boolean processPayment(double amount);
    
}

class CreditCardPaymentService implements PaymentService{

    @Override
    public boolean processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Processing Credit Card payment of $ "+amount);
        return false;
    }
}

class UpiPaymentService implements PaymentService{

    @Override
    public boolean processPayment(double amount) {
        // TODO Auto-generated method stub
        System.out.println("Processing UPI payment of $ "+amount);
        return true;
    }
}



class OrderService{
    public void placeOrder(PaymentService pService , double amount){
        System.out.println("Creating order...");

        boolean success = pService.processPayment(amount);

        if(success)
            System.out.println("Order placed successfully"); 
        else
            System.out.println("Payment failed");
    }
}
public class InterfacesTest1 {
    public static void main(String[] args) {

        OrderService orderService = new OrderService();

        PaymentService creditCard = new CreditCardPaymentService();
        PaymentService upi = new UpiPaymentService();

        orderService.placeOrder(upi, 100);
        System.out.println();
        orderService.placeOrder(creditCard, 200);
        
    }
}
