package week6.morning;

public class Task02 {

    public static void main(String[] args) {
        System.out.println(isSorted("abcd"));
        System.out.println(isSorted("abzy"));
        System.out.println(isSorted("Zbct"));
    }
    // abcd
    public static boolean isSorted(String str){
        boolean result = true;
        for (int i = 0; i < str.length() - 1; i++) {
            if(str.toLowerCase().charAt(i) > str.toLowerCase().charAt(i + 1)){
                result = false;
            }
        }
        return  result;
    }
}
