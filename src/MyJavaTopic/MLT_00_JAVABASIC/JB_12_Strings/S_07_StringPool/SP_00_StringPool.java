package MyJavaTopic.MLT_00_JAVABASIC.JB_12_Strings.S_07_StringPool;

public class SP_00_StringPool {
   public  static void main(String[] args) {

       // Example 1
       String a = "Hello";
       String b = "Hello";
       System.out.println(a == b);

       // Example 2
       String c = "World";
       String d = "World";
       String e = new String("World");// It creates new string object
       System.out.println(c == d);
       System.out.println(c == e);
       System.out.println(c.equals(e));

    }
}
