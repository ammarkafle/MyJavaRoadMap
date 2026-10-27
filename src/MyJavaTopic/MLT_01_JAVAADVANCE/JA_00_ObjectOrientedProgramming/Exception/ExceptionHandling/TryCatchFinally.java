package MyJavaTopic.MLT_01_JAVAADVANCE.JA_00_ObjectOrientedProgramming.Exception.ExceptionHandling;

public class TryCatchFinally {
    public static void main(String[] args) {
        /*
           try-catch-finally block : The try{}catch(type of exception variable){}finally{} block in java is used to handle exception and prevent
                            the abnormal termination of the program. In java, we can also use the finally block after the try-catch block. In this case,
                            the finally block is always executed whether there is an exception inside the try block or not. It is good practice to use finally
                            block to include important cleanup code like closing a file or connection.

          Syntax :
                  try {
                  // code
                  }
                  catch (exception e) {
                  // code
                  }
                  finally{
                  // code
                  }

           Note : There are some cases when a finally block does not execute :
                 i) Use of System.exit() method
                 ii) An exception occurs in the finally block
                 iii) The death of a thread
         */

        int a[ ] = new int[5];
        System.out.println("Hellow World");

        try {
            System.out.println(a[8]);
        }catch(Exception e){
            System.out.println("Exception Handled");
        }finally{
            System.out.println("I will run anyway what ever be the exception");
        }

        System.out.println("Bye World");
    }
}
