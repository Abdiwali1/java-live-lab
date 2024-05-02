package week10.evening;

public class PerfectSquare {

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(35));
    }

    public static boolean isPerfectSquare(int n){
        int square = 1;
        int result = 1;

        while(result < n){
            result = square * square;
            System.out.println("DEBUG: " + square + " x " + square + " = " + result);
            square++;
        }

        return result == n;
    }
}

/*
Perfect Square [IQ - Amazon]

    Check if the given number is a perfect square. A perfect square is a number that is the result of a number being squared. Squaring a number is multiplying the number itself

    2 squared = 2 * 2 = 4
    5 squared = 5 * 5 = 25

    Ex:
        input:
            49
        output:
            true
                7 * 7 gives 49, because the numbers multiplied together are the same 49 is a perfect square

        input:
            85
        output:
            false
                9 * 9 is 81 and 10 * 10 is 100 so 85 is not a perfect square because a number cannot be squared to get that result
 */
