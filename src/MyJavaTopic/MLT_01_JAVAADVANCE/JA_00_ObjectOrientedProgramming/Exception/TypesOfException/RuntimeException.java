package MyJavaTopic.MLT_01_JAVAADVANCE.JA_00_ObjectOrientedProgramming.Exception.TypesOfException;

public class RuntimeException {
    public static void main(String[] args) {
           /*
         There are two types of exception. They are :
         1. Java Run-time Exception : A runtime exception happens due to a programming error.
                                     They are also known as unchecked exception. These exception
                                     are not checked at compile-time but in run-time.

                                     Some of the common runtime exception are ;
                                     i) NullPointerException : Null pointer access ( missing the initialization of a vaiable )
                                     ii) ArrayIndexOutOfBoundsException : Out of bounds array access
                                     iii) ArithmeticException : Dividing a number by 0

        Note : You can think about it in this way. "If it is a runtime exception, it is your fault."
        */

        // This is an example of Run-Time Exception
        int a[] = new int[5]; // Array index start from 0 to n

        System.out.println(a[4]); // By default the array value is zero
        System.out.println(a[8]); // The size of array is out of the access so it gives run-time exception abnormally

    }
}