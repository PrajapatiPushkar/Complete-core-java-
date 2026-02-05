package src.maps;

import java.util.HashMap;
import java.util.Map;

public class TestingMaps {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("Pushkar", 34);
        map.put("Rahul", 10);
        map.put("Ram", 102);
        map.put("Sohan", 35);
        System.out.println(map.size());
        System.out.println(map.get("Pushkar"));
        System.out.println(map.containsKey("Ram"));
        System.out.println(map.containsKey("Geeta"));
        System.out.println(map.remove("Sohan"));
        System.out.println(map.size());

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n", key, map.get(key));
        }
    }
}
