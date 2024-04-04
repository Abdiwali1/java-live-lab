package week6.evening;

public class FrequencyOfCharacter {
    public static void main(String[] args) {

        String str = "aabbbcccc";
        String result = ""; // a2b3c4

        for(int i = 0; i < str.length(); i++){

            if(!result.contains("" + str.charAt(i))){ // if this is true the character has NOT been counted
                int count = 0; // every iteration of outer loop the count variable will be set to 0
                for(int j = i; j < str.length(); j++){
                    //System.out.println("DEBUGGING: i: " + str.charAt(i) + " | j:" + str.charAt(j));
                    if(str.charAt(i) == str.charAt(j)){
                        count++;
                    }
                }
                result += str.charAt(i) + "" + count;
            }

        }

        /*

        for(int i = 0; i < str.length(); i++){

            if(result.contains("" + str.charAt(i))){ // if this is true the character has already been counted
                continue;
            }

            int count = 0; // every iteration of outer loop the count variable will be set to 0
            for(int j = i; j < str.length(); j++){
                //System.out.println("DEBUGGING: i: " + str.charAt(i) + " | j:" + str.charAt(j));
                if(str.charAt(i) == str.charAt(j)){
                    count++;
                }
            }
            result += str.charAt(i) + "" + count;
        }
         */

        System.out.println(result);

    }
}

/*
3. Frequency of Characters Task:
    Write a program to display the frequency of each character in a given string.
        Example:
            str = "aabbbcccc"
        Output:
             a2b3c4
 */
