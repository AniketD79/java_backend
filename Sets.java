import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set<Integer> nums = new HashSet<Integer>();
        nums.add(5);
        nums.add(3);
        nums.add(5);
        System.out.println(nums);
        // System.out.println();
 nums.add(5);
        List<Integer> list = new ArrayList<Integer>(nums);
        list.add(5);
        System.out.println(list);
    }
}
