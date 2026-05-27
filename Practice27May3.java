import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice27May3 {

     public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(10, 20, 30, 20, 40, 10, 50));
        Set<Integer> uniqueSet = new HashSet<>();
        // set.stream().filter(n -> )
      Set<Integer> duplicatesSet = new HashSet<>();

      for(Integer n : list){
        if(!uniqueSet.add(n)){
            duplicatesSet.add(n);
        }
      }
      System.out.println(duplicatesSet);
      System.out.println(uniqueSet);
       

      //Using stream
      Set<Integer> seen = new HashSet<>();
      Set<Integer> duplicates = list.stream().filter(n-> !seen.add(n)).collect(Collectors.toSet());
      System.out.println(duplicates);
     }
}