package MyLearnedTopics.Java.MLT_11_WrapperClass.ExplicitCasting;
public class ExplicitBoxing {
    public static void main(String[] args) {

        // ===== int ↔ Integer =====
        int i = 10;
        Integer intObj = Integer.valueOf(i);   // Explicit Autoboxing
        int i2 = intObj.intValue();            // Explicit unboxing

        // ===== double ↔ Double =====
        double d = 25.5;
        Double doubleObj = Double.valueOf(d); // Explicit Autoboxing
        double d2 = doubleObj.doubleValue();  // Explicit unboxing

        // ===== char ↔ Character =====
        char c = 'A';
        Character charObj = Character.valueOf(c); // Explicit Autoboxing
        char c2 = charObj.charValue();             // Explicit unboxing

        // ===== boolean ↔ Boolean =====
        boolean b = true;
        Boolean boolObj = Boolean.valueOf(b); // Explicit Autoboxing
        boolean b2 = boolObj.booleanValue();  // Explicit unboxing

        // ===== long ↔ Long =====
        long l = 1000L;
        Long longObj = Long.valueOf(l); // Explicit Autoboxing
        long l2 = longObj.longValue();  // Explicit unboxing

        // Printing results
        System.out.println("Integer: " + i2);
        System.out.println("Double: " + d2);
        System.out.println("Character: " + c2);
        System.out.println("Boolean: " + b2);
        System.out.println("Long: " + l2);
    }
}

