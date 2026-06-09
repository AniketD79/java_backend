// Programs to check duplicates and print the duplicate elements with no. of occurances.

import java.util.HashMap;

public class HashMapDuplicates {

    public boolean containsDuplicate(int arr[] ) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
     
        for(int i= 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
                
                return true;
            }
            else{
                map.put(arr[i], 1);
                // result = false;
            }
        }
     
       
        System.out.println(map);
        return false;

    }

     public void countDuplicate(int arr[] ) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
     
        for(int i= 0; i<arr.length; i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i], map.get(arr[i])+1);
                
                
            }
            else{
                map.put(arr[i], 1);
                // result = false;
            }
        }
     
       
        System.out.println(map);
        // return false;

    }
   
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,1,2,3,5,6,7,9};
        HashMapDuplicates hashMapDuplicates= new HashMapDuplicates();
      boolean res=   hashMapDuplicates.containsDuplicate(arr);
      System.err.println(res);
      hashMapDuplicates.countDuplicate(arr);

        // System.out.println(map);

    }
}
