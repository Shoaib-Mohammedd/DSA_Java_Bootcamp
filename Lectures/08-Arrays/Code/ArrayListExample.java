import java.util.ArrayList;
import java.util.Arrays;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList < Integer> list = new ArrayList<>(12);
        list.add(244);
        list.add(244);
        list.add(244);
        list.add(244);
        list.add(244);
        list.add(244);
        list.add(244);
        list.set(5, 100);
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list);
        System.out.println(list.add(1));
    }
}
