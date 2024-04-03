package week6.morning;

public class Task01 {

    /*
    1.1 Create a method to reverse a given string and
    provide the reversed result.
			Example:
			 	reverse("Cydeo");
			Output:
			 	"oedyC"
     */

    public static void main(String[] args) {
        System.out.println(reversedString("Cydeo"));
        System.out.println(reversedString("hello"));
        System.out.println(reversedString("my name is  ......."));
        System.out.println(reversedString("#$%%234abccc"));
        System.out.println(isPalindrome("level"));  // ture
        System.out.println(isPalindrome("home")); // false

    }

    public static String reversedString(String str){
        String result = "";
        for (int i = str.length()-1; i >= 0; i--) {
            result += str.charAt(i);
        }
        return result;
    }

    public static boolean isPalindrome(String str){

        return str.equals(reversedString(str));
    }
}
