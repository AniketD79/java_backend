class Counter{

    int a = 0;
    public synchronized void increment(){
         a++;
    }
}

class T1 implements Runnable {
Counter c;
T1(Counter c){
    this.c= c;
}
    @Override
    public void run() {
        for(int i= 1; i<=100; i++){
            c.increment();
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}

class T2  implements Runnable{
    Counter c;
T2(Counter c){
    this.c = c;
}
    @Override
    public void run() {
         for(int i= 1; i<=100; i++){
            c.increment();
        }
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'run'");
    }
    
}


public class Threads2 {
    public static void main(String[] args) throws InterruptedException {
        Counter c= new Counter();
        // Runnable r1= new T1(c);
        // Runnable r2= new T2(c);

        Runnable r1 = ()->{
for(int i=1; i<=1000; i++){
    c.increment();
}
        };
        Runnable r2 = ()->{
            for(int i=1; i<=1000; i++){
                c.increment();
            }
        };

        Thread t1= new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
          t1.join();
        t2.join();
        System.out.println(c.a);
    }
}
// Rember the synchronized keyword used inside the counter class, it is there that's why our output
// is always 2000 or else it will be chnaging continuously