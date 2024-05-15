package week12.morning;

import java.util.*;

public class MapAB2 {

    public static void main(String[] args) {
        Map<String,String> example = new HashMap<>();
        example.put("a","aaa");
        example.put("b","bbb");
        System.out.println(example);
        System.out.println(mapAB(example));

    }

    public static Map<String,String> mapAB(Map<String,String> map){
        if (map.containsKey("a") && map.containsKey("b")){
            String valueA = map.get("a");
            String valueB = map.get("b");

            if(valueB.length() == valueA.length()){
                map.put("a","");
                map.put("b","");
            }else{
                if(valueB.length() > valueA.length()){
                    map.put("c",valueB);
                }else{
                    map.put("c",valueA);
                }
            }
        }
        return map; // ctrl + d    or cmd + d
    }
}
