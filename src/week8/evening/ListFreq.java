package week8.evening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ListFreq {
    public static void main(String[] args) {

        ArrayList<String> items = new ArrayList<>(Arrays.asList("Apple", "Banana", "Apple", "Cherry", "Cherry", "Apple"));
        String result = "";

        for(String each : items){
            if(!result.contains(each)){ // when the item has not been counted yet, which means it hasn't been added to the result yet
                result += each + " = " + Collections.frequency(items, each) + "\n";
            }
        }

        /*
        for(String each : items){
            if(result.contains(each)){
                continue;
            }
            result += each + " = " + Collections.frequency(items, each) + "\n";
        }
         */

        System.out.println(result);

    }
}
/*
3. Given an ArrayList of Strings named 'items', write a program that returns the frequency of each element.
	   Example:
	      Input list: {"Apple", "Banana", "Apple", "Cherry"}

	   Output:
	      Apple = 2
	      Banana = 1
	      Cherry = 1
 */