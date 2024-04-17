package week8.morning;

import java.util.*;

public class Task01 {

    /*
    java 1
    python 2
    ruby 2
    c# 1
     */

    public static void main(String[] args) {

        String[] inputArray = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            int count = 0;
            for (int j = 0; j < inputArray.length; j++) {
                if(inputArray[i].equals(inputArray[j])){
                    count ++;
                }
            }
            if (count == 1){
               result.add(inputArray[i]);
               System.out.println(inputArray[i]);
            }

        }
        System.out.println(result);


    }
}
