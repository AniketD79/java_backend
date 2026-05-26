import java.util.HashMap;
import java.util.Map;

public class HashMaps1 {
    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5,2,4,7,5,8,7};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num, map.get(num)+1);
            }
            else{
                map.put(num, 1);
            }
            // System.out.println(map);
        }
        // System.out.println(map);
        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() +" -> " + entry.getValue());
        }

    }
}
