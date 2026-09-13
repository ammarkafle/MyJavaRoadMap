package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_04_Character;

public class C_00_Character {
    public static void main(String[] args) {

        /*
           Character
                ↓
     Work with one character
         */

        char ch = 'A';

        System.out.println(Character.isLetter(ch));
        System.out.println(Character.isDigit(ch));
        System.out.println(Character.isUpperCase(ch));
        System.out.println(Character.isLowerCase(ch));
        System.out.println(Character.toLowerCase(ch));
        System.out.println(Character.toUpperCase(ch));
        System.out.println(Character.isWhitespace(ch));

    }
}
