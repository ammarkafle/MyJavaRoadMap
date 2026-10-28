package MyJavaTopic.MLT_01_JAVAADVANCE.CollectionFramework.Exception.ExceptionHandling;

public class TryCatch {
    public static void main(String[] args) {
        /*
          try-catch block : The try{}catch{} block in java is used to handle exception and prevent
                            the abnormal termination of the program.

          Syntax :
                  try {
                  // code
                  }
                  catch (exception e) {
                  // code
                  }

         Note : All types of exception classes are extended by Exception class ( Parent class of exception ). We can add multiple catch block but cannot add multiple try block for same flow of code.
                If the exception type is not exist then we cannot write that name of exception. We can write
                multiple exception type by joining with | this and the variable like e must be different for different
                catch block as shown in example 6.
         */


        // Example 1
        int a[] = new int[5];
        System.out.println("Hello World");
        try {
            System.out.println(a[8]); /* The array access is out of bound so it will give exception
                                     to handle this exception keep this code in try-catch block
                                  */
        } catch (Exception e) {
            System.out.println("Exception Handled");
        }

        System.out.println("----------------------------------------------");
        // Example 2
        int b[] = new int[5];
        System.out.println("Hello Ammar");
        try {
            System.out.println(b[8]); /* The array access is out of bound so it will give exception
                                     to handle this exception keep this code in try-catch block
                                  */
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        }

        System.out.println("----------------------------------------------");
        // Example 3
        System.out.println("Hello World");
        try {
            int result1 = 5 / 0;
            System.out.println(result1); /* The result is infinity so the infinity cannot stored in a integer value
                                         so it will give an exception to handle it put in a try catch block
                                        */
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Handled");
        }

        System.out.println("----------------------------------------------");
        // Example 4
        int c[] = new int[5];
        System.out.println("Hello World");
        try {
            System.out.println(b[8]);
            int result2 = 3 / 0;
            System.out.println(result2);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException Handled");
        }


        System.out.println("----------------------------------------------");
        // Example 5
        int d[] = new int[5];
        System.out.println("Hello World");
        try {
            System.out.println(d[8]);
        } catch (Exception e) {
            System.out.println("Exception Handled");
            System.out.println(e);
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            System.out.println(e.getCause());
        }

        System.out.println("----------------------------------------------");
        // Example 6
        int e[] = new int[5];
        System.out.println("Hello World");
        try {
            System.out.println(e[8]);
            int result3 = 7 / 0;
            System.out.println(result3);

        } catch (ArrayIndexOutOfBoundsException | ArithmeticException f) {
            System.out.println("ArrayIndexOutOfBoundsException Handled");
            System.out.println("ArithmeticException Handled");
        }
    }
}

