package week5;

import java.io.*;

public class DivideTwoNumbers {

    /*
    1. Create a class named DivideTwoNumbers and write a
    program that can perform division of two numbers without using the division
    (/) and multiplication (*) operators.
		Example:
			n1 = 100
			n2 = 6
		Output:
			16 with a reminder of 4
     */

    public static void main(String[] args) {
        /*
        10    / 2 = 5
        10 - 2 = 8
        8 - 2 = 6
        6 - 2 = 4
        4 - 2 = 2
        2 - 2 = 0

        20/5  = 4
         */
        int a = 100;
        int originA = a;
        int b = 6;
        int count = 0;

        while (a >= b){
            a -= b;
            count ++;
        }

        System.out.println(count);
        System.out.println("The result of " + originA + " / " + b + " is  " + count + ", and reminder is: " + a);

        /*
        5 /2 = 2    devision
        5 - 4 = 1   remainder
         */

        int n1 = 100, n2 = 6;
        int result = 0;


        for (int i = n1; i >= n2; i -= n2) {

            n1 -= n2;

            result += 1;

        }

        System.out.println(result + " with a reminder of " + n1);
    }

}
