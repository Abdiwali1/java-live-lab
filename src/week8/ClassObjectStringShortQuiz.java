package week8;

import java.util.Scanner;

public class ClassObjectStringShortQuiz {
    public static void main(String[] args) {

        System.out.println("=============== Question 1 ===============");
        System.out.println("Q: Classes are considered as non-primitive data types. ?\nA: True");

        System.out.println("=============== Question 2 ===============");
        System.out.println("Q: Which of the following statements is not correct for instance variable\nA: Not belong to the object");

        System.out.println("=============== Question 3 ===============");
        System.out.println("Q: ________ is created by developers based on the needs of a program. It adds flexibility to the standard mechanism provided by Java designer.?\nA: Custom Classes");

        System.out.println("=============== Question 4 ===============");
        System.out.println("Q: A class can exist without an object, but an object cannot exist without a class.?\nA: true");

        System.out.println("=============== Question 5 ===============");
        System.out.println("Q: Which option properly provides the object from the Cydeo class?\nA: Cydeo cydeo = new Cydeo();");

        System.out.println("=============== Question 6 ===============");
        System.out.println("Q: Which of the following statements is not correct?\nA: The process is predictable and fully user-controlled when garbage collection will occur.");

        System.out.println("=============== Question 7 ===============");
        System.out.println("Q: Which of the following is the correct definition of String?\nA: String is a class that provides immutable representations of sequences of characters.");

        System.out.println("=============== Question 8 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        String str1 = "Hello Cydeo";
        String str2 = new String(str1);
        System.out.println(str1 == str2);

        System.out.println("=============== Question 9 ===============");
        System.out.println("Q: Which of the following statements about the String Pool is true?\nA: The String Pool is used to store only string literals.");

        System.out.println("=============== Question 10 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        Scanner scanner = new Scanner(System.in);
        String secretWord = "cydeo";

        System.out.print("Enter a secret word: ");
        String userGuess = "Cydeo";//scanner.nextLine();
        scanner.close();

        boolean isCorrect = secretWord.equalsIgnoreCase(userGuess);

        if (isCorrect) {
            System.out.println("Congratulations! You guessed it.");
        } else {
            System.out.println("Sorry, your guess is incorrect.");
        }

        System.out.println("=============== Question 11 ===============");
        System.out.println("Q: The String class is presented in java.lang package, and must be imported explicitly to use it.\nA: false");

        System.out.println("=============== Question 12 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        String str = "Hello";
        StringBuilder sb = new StringBuilder(str);
        sb.append(" Cydeo");
        str.concat(" Cydeo");

        System.out.println(sb);
        System.out.println(str);

        System.out.println("=============== Question 13 ===============");
        System.out.println("Q: Which method is used to check whether a string includes a specific substring? .\nA: contains()");

        System.out.println("=============== Question 14 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        String a = "Wooden Spoon";
        String b = a.substring(0, a.indexOf(" "));
        System.out.println(b);

        System.out.println("=============== Question 15 ===============");
        String s1 = "abc";
        String s2 = "abc";

        System.out.println("s1 == s2 is: " + s1 == s2);


    }
}
