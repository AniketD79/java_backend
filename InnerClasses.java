class As{
    public void show(){
        System.out.println("Inside A");
    }
    class Bs {
public void show(){
        System.out.println("Inside B");
    }
    }
}

// Anonymous Inner Class
class C{
    public void show(){
        System.out.println("Hi C");
    }
}


public class InnerClasses {
public static void main(String[] args) {
    As a = new As();
    a.show();
    As.Bs b = a.new Bs();
    //or if Bs is static class
    // As.Bs b = new As.Bs()
    b.show();
    C c= new C(){
        public void show(){
            System.out.println("Anonymous Inner Class");
        }
    };
    c.show();
}   
}
