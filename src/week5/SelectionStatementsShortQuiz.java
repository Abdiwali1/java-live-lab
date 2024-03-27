package week5;

public class SelectionStatementsShortQuiz {
    public static void main(String[] args) {

        System.out.println("=============== Question 1 ===============");

        long a = 3_000L;
        double b = (float) a;
        int c = (short) b;
        System.out.println(c % 1000); // 0

        System.out.println("=============== Question 2 ===============");

        int x = 5; // 5 -> 4 -> 5 -> 6
        x = --x + -x++ + ++x - -x;
        //  4  +  -4    + 6   + 6
        //      0       + 6 + 6

        System.out.println(x); // 12

        System.out.println("=============== Question 3 ===============");

        System.out.println(5 * (7 - 2) != 6 * (4 + 1) - 5); // false
        // 5  *   5    != 6  *   5    - 5
        //  25       !=    30     -  5
        //  25      !=      25

        System.out.println("=============== Question 4 ===============");
        int y = 10;
        y *= 2 + 3;
        System.out.println(y); // 50

        System.out.println("=============== Question 5 ===============");
        System.out.println("Q: Which of the following statements cannot be considered as a selection (decision-making) statement?\nA: return");

        System.out.println("=============== Question 6 ===============");
        int x2 = 10;

        if (x2 > 5) {
            System.out.println("x is greater than 5");
        }
        if (x2 == 8) {
            System.out.println("x equals to 8");
        }
        if (x2 < 15) {
            System.out.println("x is less than 15");
        }

        System.out.println("=============== Question 7 ===============");
        System.out.println("Q: Which of the following statements is not correct for two ways if statement (if-else)?\nA: If the condition is true, both the code blocks under if and else are executed together.");

        System.out.println("=============== Question 8 ===============");
        int age = 15;

        if (age >= 16) {
            System.out.println("You can get a driving license.");
        } else {
            System.out.println("You cannot get a driving license.");
        }

        System.out.println("=============== Question 9 ===============");
        System.out.println("Q: Which of the following best describes a nested if statement?\nA: An if statement within another if statement.");

        System.out.println("=============== Question 10 ===============");
        int num = -895;

        if (num > 0) {
            System.out.println("Number is positive.");
            if (num % 2 == 0) {
                System.out.println("Number is even.");
            } else {
                System.out.println("Number is odd.");
            }
        } else if (num < 0) {
            System.out.println("Number is negative.");
            if (num % 2 == 0) {
                System.out.println("Number is even.");
            } else {
                System.out.println("Number is odd.");
            }
        } else {
            System.out.println("Number is zero.");
        }


        System.out.println("=============== Question 11 ===============");
        System.out.println("Q: What is the purpose of a switch statement?\nA: To execute statements based on the value of a variable or expression.");

        System.out.println("=============== Question 12 ===============");
        System.out.println("Q: Which of the following data types can be used in a switch statement?\nA: String");

        System.out.println("=============== Question 13 ===============");
        char grade = 'B';

        switch (grade) {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good");
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Below Average");
                break;
            case 'F':
                System.out.println("Fail");
                break;
            default:
                System.out.println("Invalid grade");
                break;
        }


        System.out.println("=============== Question 14 ===============");
        System.out.println("Q: What is the requirement for case values in a switch statement?\nA: Case values must be unique and not have duplicates.");

        System.out.println("=============== Question 15 ===============");

        String information = "Can I vote in this election? ";
        int yourAge = 18;

        information += yourAge > 18 ? "absolutely YES." : "unfortunately," +
                " you should wait a bit.";

        System.out.println(information); //Can I vote in this election? unfortunately, you should wait a bit.


    }

}
