package MyJavaTopic.MLT_01_JAVAADVANCE.CollectionFramework.Exception.TypesOfException;

public class CompiletimeException {
    public static void main(String[] args) {
        /*
         There are two types of exception. They are :
         2. Java Compile-time Exception : An IOException/Compile-time exception is also known as a checked exception. They
                                         are checked by the compiler at the compile-time and the programmer is prompted to handle
                                         these exceptions.

                                         Some of the examples of checked exception are :
                                         i) FileNotFoundException : Trying to open a file that doesn't exist
                                         ii) Trying to read past the end of a file
         */

        // This is an example of Run-Time Exception

        int a[] = new int[5]; // Array index start from 0 to n

        System.out.println(a[4]); // By default the array value is zero
        System.out.println(a[0]); /* If the semicolon or other any syntax is not in a format then
                                     it gives compile-time exception abnormally
                                  */


    }
}
