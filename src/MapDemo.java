package src;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        // Map<String, String> map = new HashMap<>(); // Thread safe
        Map<String, String> map = new Hashtable<>(); 


        map.put("name", "anurag");
        map.put("lastName", "arwalkar");


        // System.out.println(map);

        // System.out.println(map.get("name"));

        Set<String> keys = map.keySet();

        for (String key : keys) {
            System.out.println(map.get(key));
        }

    }
}
