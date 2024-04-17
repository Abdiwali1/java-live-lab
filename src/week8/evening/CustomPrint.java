package week8.evening;

import java.util.Arrays;

public class CustomPrint {

    public static void main(String[] args) {
        int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        System.out.println(Arrays.deepToString(nums));
        System.out.println(multiToString(nums));
    }

    public static String multiToString(int[][] nums){
        StringBuilder result = new StringBuilder();
        for(int i = 0; i < nums.length; i++){
            result.append("index ").append(i).append(" | ");

            for(int each : nums[i]){ // for(int j = 0 etc) nums[i][j] == each
                result.append("(").append(each).append(")"); // += ( + each + )
            }

            result.append("\n");
        }
        return result.toString();
    }
}
/*
2. CustomPrint [multidimensional, loop, String, method]

     Create a method that will accept a 2D int array and return a String format of the array.
     Make your own custom print format for this 2D array instead of using the deepToString() method

     Ex:    this is just an example. You can be creative for how the 2D array will be printed
       int [][] nums = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}
        };

        output:
            index 0 | (3)(4)(5)(6)
            index 1 | (5)(2)(6)
            index 2 | (10)(40)(20)

    // deepToString() -> [[0, 0, 0], [0, 0], [0, 0, 0, 0]]
 */
