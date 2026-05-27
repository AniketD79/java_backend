import java.util.ArrayList;
import java.util.List;


// Sorting List of elements odd and even and storing them in respective lists.
public class Practice27May7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17));
        List<Integer> even = list.stream().filter(n-> n%2==0).toList();
        System.out.println(even); 
        List<Integer> odd = list.stream().filter(n-> n%2!=0).toList();
        System.out.println(odd);
    }
}
