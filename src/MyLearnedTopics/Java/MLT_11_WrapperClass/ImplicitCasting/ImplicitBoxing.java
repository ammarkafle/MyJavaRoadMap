package MyLearnedTopics.Java.MLT_11_WrapperClass.ImplicitCasting;
public class ImplicitBoxing {
    public static void main(String[] args) {

        // ===== int ↔ Integer =====
        int i = 10;
        Integer intObj = i;        // Autoboxing
        int i2 = intObj;           // Unboxing

        // ===== double ↔ Double =====
        double d = 25.5;
        Double doubleObj = d;      // Autoboxing
        double d2 = doubleObj;     // Unboxing

        // ===== char ↔ Character =====
        char c = 'A';
        Character charObj = c;     // Autoboxing
        char c2 = charObj;         // Unboxing

        // ===== boolean ↔ Boolean =====
        boolean b = true;
        Boolean boolObj = b;       // Autoboxing
        boolean b2 = boolObj;      // Unboxing

        // ===== long ↔ Long =====
        long l = 1000L;
        Long longObj = l;          // Autoboxing
        long l2 = longObj;         // Unboxing

        // Printing results
        System.out.println("Integer: " + i2);
        System.out.println("Double: " + d2);
        System.out.println("Character: " + c2);
        System.out.println("Boolean: " + b2);
        System.out.println("Long: " + l2);
    }
}
