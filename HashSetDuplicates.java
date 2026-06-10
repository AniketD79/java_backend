import java.util.HashSet;

public class HashSetDuplicates {
    
    public boolean containsDuplicate(int arr[]){

        HashSet<Integer> set = new HashSet<>();

        for(int num : arr){
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }

        return false;
    }

    public static void main(String[] args) {
        
        HashSetDuplicates hashSetDuplicates = new HashSetDuplicates();
int arr[]= {1,2,3,4,5,6};
        boolean res= hashSetDuplicates.containsDuplicate(arr);
        System.out.println(res);
    }
}
