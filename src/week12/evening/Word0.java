package week12.evening;

import java.util.HashMap;
import java.util.Map;

public class Word0 {
    public Map<String, Integer> word0(String[] strings) {

        Map<String, Integer> map = new HashMap<>();

        for(String each : strings){
            map.put(each, 0);
        }

        return map;

    }


}
