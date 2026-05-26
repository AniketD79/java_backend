class T1 implements Runnable{

    @Override
    public void run() {
        for(int i=1; i<100; i++){
            System.out.println("In T1");
             try {
                // Added time so that we can get one In T1 and one T2 in op
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
       
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}

class T2 implements Runnable{

    @Override
    public void run() {
        for(int i=1; i<100; i++){
            System.out.println("In T2");
              try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        }
       
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }

}
public class Threads1 {
    public static void main(String[] args) {
        // T1 t1 = new T1();
        // T2 t2 = new T2();
        // t1.start();
        // Now the problem is we dont have start method inside Runnable so we create obj of runnable and
        // pass them to thread type
         Runnable r1 = new T1();
        Runnable r2 = new T2();
      Thread t1 = new Thread(r1);
      Thread t2 = new Thread(r2);

      t1.start();
      t2.start();
    }
}
