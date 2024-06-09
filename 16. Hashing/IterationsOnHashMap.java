import java.util.*;

public class IterationsOnHashMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<>();
        // insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        hm.put("Pakistan", 6);
        hm.put("Nepal", 5);
        // iterate
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        for (String k : keys) {
            System.out.println("key = "+k+" , value = "+hm.get(k));
        }
    }
}