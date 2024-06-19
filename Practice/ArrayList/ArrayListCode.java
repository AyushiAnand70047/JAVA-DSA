import java.util.*;
public class ArrayListCode{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        System.out.println(list.get(1));
        list.remove(1);
        System.out.println(list);
        list.set(1, 2);
        System.out.println(list);
        list.add(1,3);
        System.out.println(list);
        System.out.println(list.contains(2));
        System.out.println(list.contains(3));
    }
}