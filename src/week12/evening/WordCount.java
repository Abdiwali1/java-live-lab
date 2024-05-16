package week12.evening;

import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> wordCount(String[] strings) {
        Map<String, Integer> counter = new HashMap<>();

        for(String each : strings){
            if(counter.containsKey(each)){ // already counting, add 1

                // int newValue = counter.get(each) + 1;
                // counter.put(each, newValue);

                counter.put(each, counter.get(each) + 1);

            } else { // this element is found for the first time, so lets initalize it
                counter.put(each, 1);
            }
        }

        return counter;

    }
/* [a", "b", "a", "c", "b", "a"]

  counter:{
    a = 3
    b = 2
    c = 1
  }
*/
}
