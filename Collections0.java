import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Iterator;
public class Collections0 {
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(7);
        list.add(6);
        list.add(4);
        list.add(5);
        list.add(4);
          list.add(7);

        System.out.println(list.size());
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);

        for(int i :list){
            System.out.println(i);
        }


Iterator<Integer> it = list.iterator();

while(it.hasNext()) {

    System.out.println(it.next());
}

list.sort(null);
System.out.println(list);

Collections.sort(list);
System.out.println(list);

//Convert list to set
Set<Integer> set = new HashSet<Integer>(list);

System.out.println(set);
    }


}
