package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_02_StringBuffer;

public class SBf_00_StringBuffer {
   public  static void main(String[] args) {

       /*
       StringBuffer
             ↓
    Change text + thread-safe
        */

       StringBuffer text = new StringBuffer("Hello");

       text.append(" Java");
       text.insert(6, "Programming ");
       text.reverse();

       System.out.println(text);

    }
}
