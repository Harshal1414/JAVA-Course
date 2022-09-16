import java.util.*;
import java.util.*;
public class Hashing {
    public static void main(String[] args) {
        HashMap <String,Integer> map = new HashMap<>();

        // Insertion
        map.put("India", 1234767890);
        map.put("China", 8765890);
        map.put("USA", 87987734);
        map.put("Baheri", 767567565);

        System.out.println(map);
        map.put("China", 987);
        System.out.println(map);

        if (map.containsKey("Baheri")){
            System.out.println("Key is present in the map");
        }
        else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("Baheri"));
        System.out.println(map.get("Russia"));


        for(Map.Entry<String, Integer> e : map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }
        map.remove("Baheri");
        System.out.println(map);
    }
}
