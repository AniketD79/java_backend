import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Practice27May6 {
public static void main(String[] args) {

    // List can contain duplicates
    List<Integer> list = new ArrayList<>(List.of(1,2,3,4,1,2,3,5,6,7,8));

    // A Set cannot contain duplicates

    Set<Integer> uniques = new HashSet<>();

    Set<Integer> duplicates = new HashSet<>();

    for(Integer num : list){

        if(!uniques.add(num)){
            duplicates.add(num);
        }
    }
    System.out.println(duplicates);

    Set<Integer> nums= new HashSet<>();
    Set<Integer> duplicate = list.stream().filter(num->!nums.add(num)).collect(Collectors.toSet())
;
System.out.println(duplicate);
}    
}
