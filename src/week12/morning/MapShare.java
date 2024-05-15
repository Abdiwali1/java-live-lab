package week12.morning;

import java.util.*;

public class MapShare {

    public static void main(String[] args) {
        Map<String,String> example = new HashMap<>();
        example.put("a","aaa");
        example.put("b","bbb");
        example.put("c","ccc");
        System.out.println(example);
        System.out.println(mapShare(example));

    }

    public static Map<String,String> mapShare(Map<String, String> map){
        if(map.containsKey("a")){
            map.put("b",map.get("a"));
        }
        map.remove("c");
        return map;
    }
}
