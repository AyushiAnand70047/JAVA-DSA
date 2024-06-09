import java.util.HashMap;
public class HashMapOperations{
    public static void main(String[] args) {
        // create
        HashMap<String,Integer> hm = new HashMap<>();
        // Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("US", 50);
        System.out.println(hm);
        // size
        System.out.println(hm.size());
        // Get
        int population = hm.get("India");
        System.out.println(population);
        // if key not exist
        System.out.println(hm.get("Pakistan"));
        // containsKey
        System.out.println(hm.containsKey("India"));
        // remove
        System.out.println(hm.remove("India"));
        // clear
        hm.clear();
        System.out.println(hm.isEmpty());
    }
}