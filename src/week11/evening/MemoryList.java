package week11.evening;

import java.util.ArrayList;
import java.util.Arrays;

public class MemoryList {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3, 5, 6, 8, 23, 6, 2)); // made an ArrayList object
        ArrayList<Integer> other = nums; // new reference pointing to the same object from line 10

        System.out.println(nums);
        System.out.println(other);

        nums.remove(0);

        System.out.println(nums);
        System.out.println(other);

        System.out.println("-------------");
        ArrayList<Integer> more = new ArrayList<>(nums); // creating a new object with the same value from the nums ArrayList

        nums.remove(0);

        System.out.println(nums);
        System.out.println(other);
        System.out.println(more);

        System.out.println("-------------");
        System.out.println("return: " + invalid(nums));
        System.out.println("argument: " + nums);

        System.out.println("-------------");
        System.out.println("return: " + valid(nums));
        System.out.println("argument: " + nums);

    }

    public static ArrayList<Integer> invalid(ArrayList<Integer> list){
        ArrayList<Integer> nums = list;
        nums.add(100);
        return nums;
    }

    public static ArrayList<Integer> valid(ArrayList<Integer> list){
        ArrayList<Integer> nums = new ArrayList<>(list);
        nums.add(200);
        return nums;
    }

}
