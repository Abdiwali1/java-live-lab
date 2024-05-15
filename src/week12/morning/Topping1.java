package week12.morning;

import java.util.*;

public class Topping1 {

    public static void main(String[] args) {
        Map<String,String> topping1 = new HashMap<>();
        topping1.put("ice cream","peanut");
        System.out.println("topping1 = " + topping1);
        System.out.println(topping(topping1));

        Map<String,String> topping2 = new HashMap<>();
        topping2.put("","");
        System.out.println("topping2 = " + topping2);
        System.out.println(topping(topping2));

        Map<String,String> topping3 = new HashMap<>();
        topping3.put("bread","syrup");
        System.out.println("topping3 = " + topping3);
        System.out.println(topping(topping3));
    }

    public static Map<String,String> topping(Map<String,String> map){
        if(map.containsKey("ice cream")){
            map.put("ice cream","cherry");
        }
        map.put("bread","butter");
        return map;
    }
}
