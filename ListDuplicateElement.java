import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ListDuplicateElement {
    public static void main(String[] args) {
        ArrayList<Integer> list =new ArrayList<Integer>(List.of(1,2,5,6,7,4,7,5,2,3));

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num : list){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
        }
         System.out.println("Duplicate Elements:");

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

            if (entry.getValue() > 1) {

                System.out.println(entry.getKey());
            }
        }


// USING SETS
        Set<Integer> unique = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : list) {
// If number fails to add in unique or is already present in unique
            if (!unique.add(num)) {

                duplicates.add(num);
            }
        }

        System.out.println(duplicates);
    

}
}
