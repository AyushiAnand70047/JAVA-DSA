import java.util.TreeMap;

public class UseTreeMap {
    public static void main(String[] args) {
        TreeMap<String,Integer> tm = new TreeMap<>();
        tm.put("India", 100);
        tm.put("China", 100);
        tm.put("US", 100);
        System.out.println(tm);
    }
}
