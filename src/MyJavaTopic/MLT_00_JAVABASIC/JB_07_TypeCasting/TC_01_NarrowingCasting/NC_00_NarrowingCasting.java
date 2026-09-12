package MyJavaTopic.MLT_00_JAVABASIC.JB_07_TypeCasting.TC_01_NarrowingCasting;

public class NC_00_NarrowingCasting {
    public static void main(String[] args) {

        /* Note :
        Function: Converts a larger data type into a smaller data type.
        double → float → long → int → short → byte
         */


        // byte to short
        byte byteValue = 10;
        short shortValue = byteValue;

        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);


        // short to int
        short shortNumber = 100;
        int intValue = shortNumber;

        System.out.println("Short value: " + shortNumber);
        System.out.println("Int value: " + intValue);


        // int to long
        int intNumber = 1000;
        long longValue = intNumber;

        System.out.println("Int value: " + intNumber);
        System.out.println("Long value: " + longValue);


        // long to float
        long longNumber = 50000L;
        float floatValue = longNumber;

        System.out.println("Long value: " + longNumber);
        System.out.println("Float value: " + floatValue);


        // float to double
        float floatNumber = 25.5f;
        double doubleValue = floatNumber;

        System.out.println("Float value: " + floatNumber);
        System.out.println("Double value: " + doubleValue);


        // int directly to double
        int number = 50;
        double result = number;

        System.out.println("Int value: " + number);
        System.out.println("Double value: " + result);


        /* Note for Type Casting :

        There are again two type of casting i.e.
        i) Implicit Casting --> Java converts automatically --> usually widening
        ii) Explicit Casting --> You manually convert using (type) --> usually narrowing

        Also additional Note
        i) Widening Casting --> Smaller type to larger type --> Usually Implicit
        ii) Narrowing Castiing --> Larger TYpe to Smaller TYpe --> Usually Explicit


         */
    }
}
