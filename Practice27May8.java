
//To Count the frequency of elements in the list 

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice27May8 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,2,2,3,3,3,4,5,5));
        Map<Integer, Integer> map = new HashMap<>();
        for(Integer num : list){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
            // Above if else can be replaced with below
            // If key doesn’t exist:
            // returns:0 Then: +1
            // map.put(num, map.getOrDefault(num, 0) + 1);
        }
 System.out.println(map);
    
       for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" -> " + entry.getValue());
        }
        // System.out.println(map);
    }
}
