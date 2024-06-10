import java.util.*;

public class UseLinkedHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Delhi");
        cities.add("Jalandhar");
        cities.add("Bhagalpur");
        cities.add("Samastipur");
        // order is same as added in LinkedHashSet
        System.out.println(cities);
        HashSet<String> cities1 = new HashSet<>();
        cities1.add("Delhi");
        cities1.add("Jalandhar");
        cities1.add("Bhagalpur");
        cities1.add("Samastipur");
        // order is not same as added in LinkedHashSet
        System.out.println(cities1);
        // operations on LinkedHashSet
        cities.remove("Jalandhar");
        System.out.println(cities);
    }
}
