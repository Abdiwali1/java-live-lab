package week6.morning;

public class Task03 {

    public static void main(String[] args) {
        System.out.println(countCharacters("aabbbcccc"));
        System.out.println(countCharacters("aabbbccccaaaabbbbyyyyy"));
    }
    //  aabbbcccca
    public static String countCharacters(String str){
        String result = "";

        for (int i = 0; i < str.length() ; i++) {   //a
            int count = 0;
            if(!result.contains("" +  str.charAt(i))){
                for (int j = i; j <= str.length() - 1; j++) { //a
                   if (str.charAt(i) == str.charAt(j)){
                       count ++;
                   }
                }
                result += str.charAt(i) + "" + count;
            }
        }
        return result;

    }
}
