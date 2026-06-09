interface Abc{

    void hello(String str);
}

class Xyz implements Abc{
    @Override
    public void hello(String str){
        System.out.println(str);;
    }
}

public class InterfacesTest {
    static void execute(Abc abc){
        abc.hello("Hi I am Aniket");

    }
    public static void main(String[] args) {
        execute(new Xyz());
    }
}
