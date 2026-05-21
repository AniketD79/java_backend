public class SwitchJava {
    public static void main(String[] args) {
        int n=10;
        switch (n) {
            case 1:
                System.err.println("Hello 1");
                
                break;
            case 2 : 
                System.err.println("Hello 2");
                break;
            default:
                System.err.println("Hello " +n);
                break;
        }
    }
}
