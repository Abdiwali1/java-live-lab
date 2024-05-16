package week12.evening;

import java.util.HashMap;
import java.util.Map;

public class WordLen {
    public Map<String, Integer> wordLen(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for(String each : strings){
            map.put(each, each.length());
        }
        return map;
    }

}
