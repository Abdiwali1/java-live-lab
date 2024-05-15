package week12.morning;

import java.util.*;

public class MapAB {

    public static void main(String[] args) {
        Map<String,String> example = new HashMap<>();
        example.put("a","Hi");
        example.put("b","there");
        System.out.println(example);
        System.out.println(mapAB(example));
    }

    public static Map<String,String> mapAB(Map<String,String> map){
        if (map.containsKey("a") && map.containsKey("b")){
            String a = map.get("a");
            String b = map.get("b");
            map.put("ab",a+b);
            //map.put("ab",map.get("a") + map.get("b"));
        }

        return map;
    }
}
