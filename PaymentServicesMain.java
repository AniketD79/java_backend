interface PaymentService{
    public boolean makePayment(double amount);
}

class UPIPayment implements PaymentService{

@Override
public boolean makePayment(double amount) {
    System.out.println("Processing UP Payment of $: "+amount);
    return true;

}
}

class CardPayment implements PaymentService{

    @Override
    public boolean makePayment(double amount) {
        // TODO Auto-generated method stub
       System.out.println("Processing Card Payment of $: " + amount);
       return false;
    }
    
}

class Orders{
    public void placeOrder(PaymentService paymentService, double amount){

        System.out.println("Creating order...");

        boolean success = paymentService.makePayment(amount);

        if(success){
            System.out.println("Order placed successfully!");
        }
        else{
            System.out.println("Payment Failed!");
        }
    }
}

public class PaymentServicesMain {
    
    public static void main(String[] args) {
        System.out.println();
        Orders orders = new Orders();
PaymentService upi = new UPIPayment();
        orders.placeOrder(upi   , 200);
        System.out.println();
        PaymentService card = new CardPayment();
        orders.placeOrder(card, 300);
        System.out.println();
    }
}
