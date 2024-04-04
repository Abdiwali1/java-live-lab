package week6.evening;

public class StringReverse {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("12345"); // mutable String
        System.out.println(sb.reverse());

        System.out.println(reverse("abcdef"));
        System.out.println(reverse2("abcdef"));

        System.out.println(isPalindrome("racecar")); // racecar
        System.out.println(isPalindrome("hello")); // olleh
    }

    public static String reverse(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i); // reverse = reverse + str.charAt(i)
        }
        return reverse;
    }

    //  more optimized
    public static String reverse2(String str){
        StringBuilder reverse = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            reverse.append(str.charAt(i)); // reverse = reverse + str.charAt(i)
        }
        return reverse.toString();
    }

    public static boolean isPalindrome(String str){
        return reverse2(str).equalsIgnoreCase(str);
    }

   // a b c ....... c d a
    // anna

    /*
        i is the index in the forward direction ( i++ )
        y is the index in the backwards direction ( y-- )

         if(str.charAt(i) != str.charAt(y)){ -> when the character are NOT the same, they are not palindrome, so I don't need to check anything else. I will return false

         if the characters ALL match the if statement will never be true, so the method will never return false, which means by default the line 54 will run and return true
     */
    public static boolean isPalindrome2(String str){
        for(int i = 0, y = str.length() - 1; i < str.length()/2; i++, y--){
            if(str.charAt(i) != str.charAt(y)){
                return false;
            }
        }

        return true;
    }

    public static boolean isPalindrome3(String str){
        int lastIndex = str.length() - 1;
        for(int i = 0; i < str.length()/2; i++){
            if(str.charAt(i) != str.charAt(lastIndex - i)){
                return false;
            }
        }

        return true;
    }

}

/*
	1.1 Create a method to reverse a given string and provide the reversed result.
			Example:
			 	reverse("Cydeo");
			Output:
			 	"oedyC"

	1.2 Create a method named isPalindrome to check if a given string is a palindrome.
	    A string is palindrome if the characters are the same being read from the beginning or the end
			Example:
			 	isPalindrome("Level");
			Output:
			 	true
 */