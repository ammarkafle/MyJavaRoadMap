package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_02_StringBuffer;

public class StringBuffer {
   public  static void main(String[] args) {

       /*
       StringBuffer
             ↓
    Change text + thread-safe
        */

       java.lang.StringBuffer text = new java.lang.StringBuffer("Hello");

       text.append(" Java");
       text.insert(6, "Programming ");
       text.reverse();

       System.out.println(text);

    }
}
