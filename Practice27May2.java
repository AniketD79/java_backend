import java.util.ArrayList;
import java.util.List;

public class Practice27May2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of( 1,2,3,4,5,6,7,8,9,10));
         List<Integer> list1 = new ArrayList<>();
        
        System.out.println("Even:");
        list.forEach(n->{
            if(n%2==0){
                System.out.println(n);
               list1.add(n);
            }
        } );
       System.out.println(list1);
System.out.println("Odd:");
        list.forEach(n->{
            if(n%2 != 0){
                System.out.println(n);
            }
        });
        List<Integer> even = list.stream().filter(n->n%2==0).toList();
        System.out.println(even);
    }


}
