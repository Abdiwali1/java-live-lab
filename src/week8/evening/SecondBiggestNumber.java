package week8.evening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class SecondBiggestNumber {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(4,3,1,4,5,2,4,8,4,8));
        System.out.println(secondBiggest(nums));
        ArrayList<Integer> nums2 = new ArrayList<>(Arrays.asList(7,4,3,1,4,5,2,4,8,4,8));
        System.out.println(secondBiggest2(nums2));
    }

    public static int secondBiggest(ArrayList<Integer> nums){
        Collections.sort(nums);
        System.out.println("DEBUGGING: " + nums);
        System.out.println("DEBUGGING: max: " + nums.get(nums.size() - 1)); // Collections.max()
        nums.removeIf(p -> p == nums.get(nums.size() - 1));
        System.out.println("DEBUGGING: " + nums);
        System.out.println("DEBUGGING: 2nd max: " + nums.get(nums.size() - 1));
        return nums.get(nums.size() - 1);
    }

    public static int secondBiggest2(ArrayList<Integer> nums){ // 1, 2, 5, 4, 10, 8
        int max = nums.get(0);  // 10
        int secondMax = Integer.MIN_VALUE;

        for(int each : nums){ // each = 8
            if(each > max){
                secondMax = max;
                max = each;
            } else if (each < max && each > secondMax){
                secondMax = each;
            }
        }

        return secondMax;
    }



}
/*
4. [IQ] Second Biggest Number [ArrayList, loop, conditional]

    Create a program that will have an ArrayList of Integers. Find the second biggest number in the list.
    Note: the 2nd biggest should be unique meaning it should be different from the max number

Example:
    Input:
        [4,3,1,4,5,2,4,8,4,8]
    Output:
        5
 */