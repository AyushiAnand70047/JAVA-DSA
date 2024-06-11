import java.util.*;
public class ItineraryFromTickets {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<>();
        map.put("Chennai", "Bengaluru");
        map.put("Mumbai", "Delhi");
        map.put("Goa", "Chennai");
        map.put("Delhi", "Goa");
        String start = new String();
        for(String key: map.keySet()){
            if(!map.containsValue(key)){
                start = key;
                break;
            }
        }
        while(start != null){
            System.out.print(start+" ");
            start = map.get(start);
        }
    }
}
