 class Test {
    
    private int age;
    private String name;


    // Default Constructor
    public Test(){
        age=27;
        name="Aniket";
    }

    // Parameterized Constructor
    public Test(int age, String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}

public class Constructors{
    public static void main(String[] args) {
        
        Test t1= new Test();
Test t2= new Test(12,"Bunny");
        // System.out.println(t1.name+" : "t1.age);
    System.out.println(t1.getName() + " : "+t1.getAge());
     System.out.println(t2.getName() + " : "+t2.getAge());
    }
}
