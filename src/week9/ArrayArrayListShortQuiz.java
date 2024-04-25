package week9;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayArrayListShortQuiz {
    public static void main(String[] args) {

        System.out.println("=============== Question 1 ===============");
        System.out.println("Q: The index of the first element in an array is always _____?\nA: 0");

        System.out.println("=============== Question 2 ===============");
        System.out.println("Q: The array is an ordered data structure, and the order of the elements is always preserved.\nA: True");

        System.out.println("=============== Question 3 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        int[] numbers = {10, 20, 30, 40, 50};
        System.out.println(numbers.length);
        System.out.println(numbers[numbers.length - 1]);

        System.out.println("=============== Question 4 ===============");
        System.out.println("Q: The array is a special type of variable that can hold multiple values of the same and different types.\nA: False");

        System.out.println("=============== Question 5 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        char[] charArray1 = {'a', 'b', 'c', 'd', 'e'};
        char[] charArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(charArray1 == charArray2);
        System.out.println(Arrays.equals(charArray1, charArray2));

        System.out.println("=============== Question 6 ===============");
        System.out.println("Q: Java is always pass-by-value.\nA: True");

        System.out.println("=============== Question 7 ===============");
        System.out.println("Q: Which of the following is not a valid declaration of the array?\nA: int arr = {10, 20, 30};");

        System.out.println("=============== Question 8 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        int wd = 0; // 0 -1 0 2 4 3
        String[] days = {"Sun", "Mon", "Wed", "Sat"};

        for (int i = 0; i < days.length; i++) {
            switch (days[i]) {
                case "Sat", "Sun":
                    wd -= 1;
                    break;
                case "Mon":
                    wd += 1;
                case "Wed":
                    wd += 2;
            }
        }

        System.out.println(wd);

        System.out.println("=============== Question 9 ===============");
        System.out.println("Q: We can pass an array as a method argument. However, arrays cannot be return types.\nA: False");

        System.out.println("=============== Question 10 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        String[] planets = {"mercury", "Venus", "Earth", "Mars"};
        int x = planets.length;
        int y = planets[1].length();

        System.out.println(x + " : " +y);

        System.out.println("=============== Question 11 ===============");
        System.out.println("Q: Which of the following are valid declarations of ArrayList?\nA: ArrayList<String>  list =  new  ArrayList<String>( );\nArrayList<String>  list =  new  ArrayList<>( );");

        System.out.println("=============== Question 12 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        ArrayList<String> colors = new ArrayList<>(); // green, red, blue, cyan, yellow
        colors.add("green");
        colors.add("red");
        colors.add("blue");
        colors.add("yellow");
        colors.add(3, "cyan");

        System.out.println(colors);

        System.out.println("=============== Question 13 ===============");
        System.out.println("Q: A Collection such as ArrayList is a standard data structure in Java because there are ready methods in ArrayList, and it's faster than the array.\nA: False");

        System.out.println("=============== Question 14 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");

        ArrayList<Character> list = new ArrayList<>();

        for (char i = 'a'; i <= 'z'; i++){
            list.add(i);
        }

        boolean r = list.containsAll(Arrays.asList('a', 'c', 'D'));
        System.out.println(r);

        System.out.println("=============== Question 15 ===============");
        System.out.println("Q: What will be the output of the following code fragment?");
        ArrayList<String> colors2 = new ArrayList<>(); // yellow, blue
        colors2.add("Yellow");
        colors2.add("Red");
        colors2.add("Blue");
        colors2.remove(1);
        System.out.println(colors2.get(1));

    }
}
