import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Collections1 {
    public static void main(String[] args) {
        
        Collection<String> names= new ArrayList<String>(); 
        names.add("Aniket");
        names.add("Bunny");
        names.add("Abc");
        names.add("And");

        for(String name : names){
           if(name.startsWith("A")){
            System.out.println(name);
           }
        }
    }
}
