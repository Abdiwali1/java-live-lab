package week5.evening;

public class CharacterSet {

    public static void main(String[] args) {
        System.out.println(getCharacterSet('7', 'P'));
        System.out.println(getCharacterSet('7', 'p'));
        System.out.println(getCharacterSet('X', '}'));
        System.out.println(getCharacterSet('Z', 'A'));
        System.out.println(getCharacterSet("lowercase"));
        System.out.println(getCharacterSet("digit"));

        System.out.println(withOneLoop('a', 'z'));
        System.out.println(withOneLoop('z', 'a'));
    }

    public static String getCharacterSet(char start, char end){ // 'A', 'Z'
        String characters = "";

        if(start < end){
            for(char letter = start; letter <= end; letter++){
                characters += letter;
            }
        } else {
            for(char letter = start; letter >= end; letter--){
                characters += letter;
            }
        }

        return characters;
    }

    public static String withOneLoop (char start, char end){
        String characters = "";

        int updateVal;
        int iterations;

        if(start < end){
            updateVal = 1;
            iterations = end - start;
        } else {
            updateVal = -1;
            iterations = start - end;
        }

        for(char letter = start, i = 0; i <= iterations; letter += updateVal, i++){
            characters += letter;
        }

        return  characters;
    }

    public static String getCharacterSet(String group){ // uppercase
        char start;
        char end;

        switch (group){
            case "lowercase":
                start = 'a';
                end = 'z';
                break;
            case "uppercase":
                start = 'A';
                end = 'Z';
                break;
            case "digit":
                start = '1';
                end = '9';
                break;
            case "special":
                start = '!';
                end = '.';
                break;
            default:
                return null; // stops the method
        }

        return getCharacterSet(start, end);
    }

}

/*
3a. CharacterSet part 1 [methods, loops]

	Create a method that will accept two chars and return a String.
	Based on the given chars, output a character sequence where the first char is the starting character and the second char is the ending character for the sequence

	Note: the character sequence will go in order, so the starting char should come before the ending char. Use the ascii table is a reference

    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
 */

/*
3b. CharacterSet part 2 [methods, loops, overloading]

    Create a method (overloading the method from part 1) that has a String parameter and returns a String.
    Based on the given String a different set of characters will be returned
    use these to determine which set of characters is returned:

    uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.

    so if the method is called with the argument "digit" then the method will return the String "123456789"

 */