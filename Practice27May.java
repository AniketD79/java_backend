import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Practice27May {
    public static <T> void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        Consumer c = new Consumer<T>() {

            @Override
            public void accept(T n) {
                // TODO Auto-generated method stub
               System.out.println(n);
            }
            
        };
        System.out.println(list);
        System.out.println(list.size());
        list.forEach(n->System.out.println(n));
        list.forEach(c);
    }
}
