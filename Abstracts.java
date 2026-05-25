abstract class A{
    public abstract void myMethod();
    public abstract void myMethod2();
}


public class Abstracts extends A {

    @Override
    public void myMethod() {
        System.out.println("My Method");
    }

    @Override
    public void myMethod2() {
        System.out.println("My Method2");
    }
    public static void main(String[] args){
Abstracts a= new Abstracts();
a.myMethod();
a.myMethod2();
A a1 = new Abstracts();
a1.myMethod();
a1.myMethod2();        
    }
}
