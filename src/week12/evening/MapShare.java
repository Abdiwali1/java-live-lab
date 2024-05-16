package week12.evening;

import java.util.Map;

public class MapShare {
    public Map<String, String> mapShare(Map<String, String> map) {
        if(map.containsKey("a")){
            map.put("b", map.get("a"));
            // String value = map.get("a");
            // map.put("b", value);
        }
        map.remove("c");
        return map;
    }

}
