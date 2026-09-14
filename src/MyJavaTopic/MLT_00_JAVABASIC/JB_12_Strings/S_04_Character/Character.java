package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_04_Character;

public class Character {
    public static void main(String[] args) {

        /*
           Character
                ↓
     Work with one character
         */

        char ch = 'A';

        System.out.println(java.lang.Character.isLetter(ch));
        System.out.println(java.lang.Character.isDigit(ch));
        System.out.println(java.lang.Character.isUpperCase(ch));
        System.out.println(java.lang.Character.isLowerCase(ch));
        System.out.println(java.lang.Character.toLowerCase(ch));
        System.out.println(java.lang.Character.toUpperCase(ch));
        System.out.println(java.lang.Character.isWhitespace(ch));

    }
}
