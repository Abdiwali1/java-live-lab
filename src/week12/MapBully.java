package week12;

import java.util.*;

public class MapBully {

    public static void main(String[] args) {
        Map<String, String> mapBully = new HashMap<>();
        mapBully.put("a", "sugar");
        mapBully.put("b", "ice cream");
        System.out.println(mapBully);
        mapBully(mapBully);

    }

    public static void mapBully(Map<String, String> map) {
        if (map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        System.out.println(map);
    }
}
