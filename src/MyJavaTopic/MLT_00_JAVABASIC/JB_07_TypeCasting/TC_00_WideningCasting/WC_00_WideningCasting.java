package MyJavaTopic.MLT_00_JAVABASIC.JB_07_TypeCasting.TC_00_WideningCasting;

public class WC_00_WideningCasting {
    public static void main(String[] args) {

        /* Note :
        Function: Converts a smaller data type into a larger data type.
        byte → short → int → long → float → double
         */


        int number = 100;

        long longNumber = number;
        float floatNumber = longNumber;
        double doubleNumber = floatNumber;

        System.out.println("int: " + number);
        System.out.println("long: " + longNumber);
        System.out.println("float: " + floatNumber);
        System.out.println("double: " + doubleNumber);
    }
}
