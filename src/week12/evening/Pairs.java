package week12.evening;

import java.util.HashMap;
import java.util.Map;

public class Pairs {
    public Map<String, String> pairs(String[] strings) {
        Map<String, String> map = new HashMap<>();

        for(String each : strings){
            map.put(each.substring(0,1), each.substring(each.length()-1));

            // String firstChar = each.substring(0,1); // "" + each.charAt(0);
            // String lastChar = each.substring(each.length() - 1); // "" + each.charAt(each.length() - 1)
            // map.put(firstChar, lastChar);
        }

        return map;

    }

}
