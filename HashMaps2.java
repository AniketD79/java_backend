import java.util.HashMap;

public class HashMaps2 {
    public static void main(String[] args) {
        
        String s1= "Aniket Nandkishor Darje";

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();

        for(int i=0; i<s1.length(); i++){
               char ch = s1.charAt(i);
// This continue if blockk to ignore spaces
            if (ch == ' ') {
                continue;
            }
           if(map.containsKey(ch)){
            map.put(ch, map.get(ch)+1);
           }
           else{
            map.put(ch, 1);
           }

        }
        System.out.println(map);
    }
}
