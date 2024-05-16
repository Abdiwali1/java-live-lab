package week12.evening;

import java.util.Map;

public class MapAB {
    public Map<String, String> mapAB(Map<String, String> map) {
        if(map.containsKey("a") && map.containsKey("b")){
            String values = map.get("a") + map.get("b");
            map.put("ab", values);

            // map.put("ab", map.get("a") + map.get("b"));
        }

        return map;
    }

}
