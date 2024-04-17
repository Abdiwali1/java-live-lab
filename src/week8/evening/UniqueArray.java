package week8.evening;

import java.util.Arrays;

public class UniqueArray {
    public static void main(String[] args) {
        String[] arr = {"Java", "Python", "Python", "Ruby", "Ruby", "C#"};

        for (String each : arr) {
            int count = 0;

            for (String other : arr) {
                if (each.equals(other)) {
                    count++;
                }
            }

            if (count == 1) {
                System.out.println(each);
            }
        }

        System.out.println("===============================");

        for (String each : arr) {
            String str = Arrays.toString(arr);
            System.out.println("DEBUG: original length " + str.length());
            String replaced = str.replace(each, "");
            System.out.println(replaced);
            System.out.println("DEBUG: replaced length " + replaced.length());
            System.out.println(replaced.length() + each.length());

            if (replaced.length() + each.length() == str.length()) {
                System.out.println(each);
            }
        }


    }
}
/*
1. Write a program that identifies the unique elements in an array of Strings.
		   Example:
		      Input array: {"Java", "Python", "Python", "Ruby", "Ruby", "C#"}

		   Output:
		      Java
		      C#
 */