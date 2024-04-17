package week8.morning;

import java.util.*;

public class Task03 {

    public static void main(String[] args) {

        List<String> input = Arrays.asList("Apple", "Banana", "Apple", "Cherry");

        for (int i = 0; i < input.size(); i++) {
            String current = input.get(i);
            int count = 0;
            for (int j = 0; j < input.size(); j++) {
                if (input.get(j).equals(current)){
                    count ++;
                }
            }

            if (firstOccurrence(input,current,i)){
                System.out.println(current + " = " + count);
            }

        }
    }

    public static boolean firstOccurrence(List<String> items, String item, int endIndex) {
        for (int i = 0; i < endIndex; i++) {
            if (items.get(i).equals(item)) {
                return false;
            }
        }
        return true;
}
}
