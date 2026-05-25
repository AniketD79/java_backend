class A{
    public void show(){
        System.out.println("In A");
    }
}

class B extends A{
    public void show(){
        System.out.println("In B");
    }
}

public class Castings {
 public static void main(String[] args) {

    A obj = new A();
    obj.show();

    // UPCASTING
    // // Child object -> Parent reference
    // A obj1 = new B();
    // obj1.show();

    // This is NOT downcasting
    // obj is already of type A and obj1 is also A reference
    // So this is just normal assignment / unnecessary casting
    // obj1 = (A) obj;
    // obj1.show();
    A obj1 = new B();   // upcasting

B obj2 = (B) obj1; // downcasting
obj2.show();
 }   

}