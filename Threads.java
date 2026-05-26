class T1 extends Thread{

    public void run(){
        for(int i=1;i <100; i++)
        System.out.println("In T1");
    }
}
class T2 extends Thread{

    public void run(){
        for(int i=1;i <100; i++)
        System.out.println("In T2");
    }
}
public class Threads {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T2 t2 = new T2();

        t1.start();
        t2.start();
    }
}

// The issue with above is that if we want to extend T1 and T2 class with any other classes, we cannot do that as multiple inheritance is not possible in java
// So now please refer Threads1.java
