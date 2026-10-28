package MyJavaTopic.MLT_01_JAVAADVANCE.CollectionFramework.Exception.CustomException;

import java.util.Scanner;

public class ThrowsAndThrowException {
    // This method gives an exception so using throws
    static int getValueFromArray(int a[]) throws Exception {
        return a[8];
    }

    // Creating a custom exception to use throw
    static class MyException extends Exception {
        public MyException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        /*
          throws : We use the throws keyboard in the method declaration
                   to declare the type of exceptions that might occur within it.

          throw : The throw keyboard is used to explicitly throw a single exception.
         */

        // Example of throws
        int a[] = new int[5];

        // After using throws in the method if we call exception occur method than cover the code by try-catch / try-catch-finally block
        try {
            getValueFromArray(a);
        } catch (Exception e) {
            System.out.println("Exception Handled " + e.getMessage());
        }

        System.out.println("--------------------------------------------");
        // Example of throw
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age : ");
        try {
            int age = sc.nextInt();

            if (age > 100) {
                throw new MyException("My Error is found");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
