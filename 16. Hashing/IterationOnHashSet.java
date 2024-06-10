import java.util.*;
public class IterationOnHashSet {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Janaldhar");
        cities.add("Samastipur");
        cities.add("Bhagalpur");
        // iterators
        Iterator it = cities.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        // enhanced for loop
        for(String city: cities){
            System.out.println(city);
        }
    }
}
