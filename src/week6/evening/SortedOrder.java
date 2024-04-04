package week6.evening;

import java.nio.file.Paths;

public class SortedOrder {
    public static void main(String[] args) {
        System.out.println(isSorted("abcdef"));
        System.out.println(isSorted("abzdef"));
    }

    public static boolean isSorted(String str){
        for(int i = 0; i < str.length() - 1; i++) {
            if(str.charAt(i) > str.charAt(i + 1)){ // i = z | i + 1 = c
                return false;
            }
        }
        return true; // if the loop runs all the way and false is never returned the character are all in sorted order
    }

}
/*
2. SortedOrder
    Create a method that accepts a String and returns a boolean.
        return true if the given String is sorted meaning the characters are in alphabetical order
        return false if the given String is not sorted

        Example:
            input: "abcd"
            output: true

            input: "abzy"
            output: false
 */
