package week8.morning;

public class Task02 {

    public static void main(String[] args) {
        int[][] array = {
                {3, 4, 5, 6},
                {5, 2, 6},
                {10, 40, 20}};
        printMultiDiArray(array);
    }


    public static void printMultiDiArray(int[][] array){

        String result = "";
        /*
            index 0 | (3)(4)(5)(6)
            index 1 | (5)(2)(6)
            index 2 | (10)(40)(20)
         */

        // iterate through 2d array
        for (int i = 0; i < array.length; i++) {
            result += "index " + i + "| (";

            for (int j = 0; j < array[i].length; j++) {
                result += array[i][j];  // 3    4
                if (j < array[i].length - 1){
                    result += ")(";
                }
            }
            result += ")\n";
        }
        System.out.println(result);
    }
}
