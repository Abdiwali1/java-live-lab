package week5;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(generateCharSet('7', 'P'));
        System.out.println(generateCharSet('X', '}'));
        System.out.println(generateCharSet('9', '2'));
        System.out.println(generateCharSet("lowercase"));
        System.out.println(generateCharSet("digit"));
    }

    public static String generateCharSet(char start, char end){
        String result = "";
        if (end >= start){
            for (char i = start; i <= end ; i++) {
                result += i;
            }
        }
        return result;
    }

    public static String generateCharSet(String input){
        String result = "";
        switch (input){
            case "uppercase":
                result = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
                break;
            case"lowercase":
                result = "abcdefghijklmnopqrstuvwxyz";
                break;
            case "digit":
                result = "123456789";
                break;
            case "special":
                result = "!\"#$%&'()*+,-.";
                break;
            default:
                result = "Please enter valid option!!!";
        }
        return result;
    }



}
