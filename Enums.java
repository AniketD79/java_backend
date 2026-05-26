

enum Status{
    Running, Stopped, Failed, Starting, Stopping, Pending
}
public class Enums {
    public static void main(String[] args) {
        Status s = Status.Starting;

        switch (s) {
            case Running:
                System.out.println("App is running");
                break;
            case Starting:
                System.out.println("App is starting");
                break;
            case Failed:
                System.out.println("App has failed");
                break;
            case Stopped:
                System.out.println("App has stopped");
                break;
            case Stopping:
                System.out.println("App is stopping");
                break;
            case Pending:
                System.out.println("App is pending");
                break;
        
            default:
                System.out.println("Waiting");
                break;
        }
    }
}
