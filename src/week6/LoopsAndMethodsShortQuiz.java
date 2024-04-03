package week6;

public class LoopsAndMethodsShortQuiz {
    public static void main(String[] args) {
        System.out.println("=============== Question 1 ===============");
        System.out.println("Q: Which statement best describes the purpose of loops in programming?\nA: Loops allow us to execute code again and again without the need for manual repetition as long as a specified condition remains true.");

        System.out.println("=============== Question 2 ===============");

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += i;
        }

        System.out.println(sum);

        System.out.println("=============== Question 3 ===============");
        System.out.println("Q: Which statement is not correct about for-loop?\nA: Variables initialized inside the initialization block are accessible out of the loop.");

        System.out.println("=============== Question 4 ===============");

        System.out.println("Q: What is the scope of the variable i in the following for-loop?\nA: The variable i is accessible only within the entire for-loop?");


        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("=============== Question 5 ===============");

        System.out.println("Q: What is the purpose of a nested loop?\nA: To perform repeated actions within the context of another repeated action.");

        System.out.println("=============== Question 6 ===============");

        System.out.println("Q: How many times will the following loop print Hello World!?\nA: 5");

        for (int i = 0; i < 10; i++) {
            i += 1;
            System.out.println("Hello World!");
        }

        System.out.println("=============== Question 7 ===============");

        System.out.println("Q: The while loop is a pre-test loop, meaning that it checks the loop condition before executing the code inside the loop.\nA: True");


        System.out.println("=============== Question 8 ===============");

        System.out.println("Q: The ______ loop executes a block of code at least once, even if the condition is false.\nA: do-while");


        System.out.println("=============== Question 9 ===============");
        System.out.println("Q: What will be the output of the code fragment?\nA: Hello Cydeo");

        int number = -5;

        do {
            System.out.println("Hello Cydeo");
        } while (number >= 0);


        System.out.println("=============== Question 10 ===============");
        System.out.println("Q: Which option should be put to print Hello Cydeo 5 times?\nA: number <= 5");

        int number2 = 1;

        while (number2 <= 5) {
            System.out.println("Hello Cydeo");
            number2++;
        }

        System.out.println("=============== Question 11 ===============");
        System.out.println("Q: Which of the following statements is not the reason for using a method?\nA: Increased Complexity");


        System.out.println("=============== Question 12 ===============");
        System.out.println("Q:What will be the output of the following code fragment?\nA: Output is 5. The copy of the value of the argument is passed to the parameter num. Even if parameter num is modified inside the method, the original value of x is kept.");

        int x = 5;
        changeValue(x);
        System.out.println(x);

        System.out.println("=============== Question 13 ===============");
        System.out.println("Q: Suppose the output of this code fragment is 30.0. How to fill in the blank?\nA: double");

//        public static ______ addNumbers(int num1, int num2) {
//            return num1 + num2;
//        }

        System.out.println("=============== Question 14 ===============");
        System.out.println("Q: Method overloading enables us to define the methods with the _____ name as long as their parameters are _____. \nA: same / different");


        System.out.println("=============== Question 15 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        printValue("Hello");
        printValue(3.14);
        printValue(10);

    }

    public static void changeValue(int num) {
        num = 10;
    }

    public static double addNumbers(int num1, int num2) {
        return num1 + num2;
    }

    public static void printValue(int x) {
        System.out.println("The int value is: " + x);
    }

    public static void printValue(double x) {
        System.out.println("The double value is: " + x);
    }

    public static void printValue(String x) {
        System.out.println("The String value is: " + x);
    }

}