import java.util.List;
import java.util.Arrays;
public class TestLambdaExp {
    public static void main(String[] args) {
        
        // for(int i =0; i<10; i++){
        //     System.out.println(i->i);
        // }
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6,7);
        nums.forEach(n->System.out.println(n));
        Integer[] a = {1,2,3,4,5};
        List<Integer> list = Arrays.asList(a);
        list.forEach(n->System.out.println(n));
        
        int[] b = {8,9,0,5,6};
        List<Integer> list1 = Arrays.stream(b).boxed().toList();
        list1.forEach(n->System.out.println(n));
    }
}
