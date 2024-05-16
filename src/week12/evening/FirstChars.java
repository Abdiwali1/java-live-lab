package week12.evening;

import java.util.HashMap;
import java.util.Map;

public class FirstChars {
    public Map<String, String> firstChar(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for(String each : strings){
            String key = each.substring(0,1);
            if(!map.containsKey(key)){
                map.put(key, "");
            }
            String oldValue = map.get(key);
            map.put(key, oldValue + each);
        }
        return map;
    }
/*
"salt", "tea", "soda", "toast"]

map{
  s = saltsoda
  t = teatoast
}

*/
}
