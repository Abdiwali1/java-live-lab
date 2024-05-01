package week10;

import java.util.*;

public class PerfectSquare {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number:");
        int num = input.nextInt();
        System.out.println(checkPerfectSquare(num));

    }

    public static boolean checkPerfectSquare(double n){
        int root = (int)Math.sqrt(n);
//        boolean result = false;
//        if(root * root == n){
//            result = true;
//        }
//        return result;
        return root * root == n;
    }
}
