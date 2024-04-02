package week5.evening;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int n1 = 120;
        int n2 = 5;

        int count = 0;

        while(n1 >= n2){
            n1 -= n2; // n1 = n1 - n2;
            count++;

            //System.out.println("DEBUG: " + n1);
        }

        System.out.println(count + " with a reminder of " + n1);

    }
}

/*
1. Create a class named DivideTwoNumbers and write a program that can perform division of two numbers without using the division (/) and multiplication (*) operators.


		Example:
			n1 = 100
			n2 = 6

		Output:
			16 with a reminder of 4
 */
