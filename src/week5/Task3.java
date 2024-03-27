package week5;

public class Task3 {

    public static void main(String[] args) {
        System.out.println(generateCharSet('7', 'P'));
        System.out.println(generateCharSet('X', '}'));
        System.out.println(generateCharSet('9', '2'));
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
}
