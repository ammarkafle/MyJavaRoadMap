package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_06_StringImmutability;

public class STA_00_StringImmutability {
   public  static void main(String[] args) {

       // Example 1
       String name = "Ammar";
       System.out.println(name);
       // Trying to change the String
       name = name.concat(" Kafle");
       System.out.println(name);


       // Example 2
       String str = "Hello";
       System.out.println("Before: " + str);
       // concat() creates a new String
       str.concat(" World");
       // Original String is still unchanged
       System.out.println("After: " + str);

    }
}
