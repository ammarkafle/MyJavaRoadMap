package MyJavaTopic.MLT_01_JAVAADVANCE.JA_00_ObjectOrientedProgramming.Exception;

public class Exception {
    public static void main(String[] args) {
        /*
        Exception : An exception is an unexpected event that occurs
                    during program execution. It affects the flow of the program
                    instructions which can cause the program to terminate abnormally.

                    An exception can occur for many reasons. Some of them are :
                    1. Invalid user input
                    2. Device failure
                    3. Loss of network connection
                    4. Physical limitation ( out of disk memory )
                    5. Code errors
                    6. Opening an unavailable file
         */

        int a[] = new int[5]; // Array index start from 0 to n

        System.out.println(a[4]); // By default the array value is zero
        System.out.println(a[8]); // The size of array is out of the access so it gives exception abnormally

    }
}
