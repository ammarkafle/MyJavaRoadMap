package MyJavaTopic.MLT_01_JAVAADVANCE.CollectionFramework.Generics;

public class UnboundedGenericMethod {
    // This is a simple method that print STring only
    static void printData(String data){
        System.out.println(data);
    }
    // This is a static generic method that support any type of data. It helps to avoid making different method for different datatype. It avoid method overloading also.
    static<D> void displayData(D data){
        System.out.println(data);
    }
    // This non-static generic method
    <E> void returnData(E data){
        System.out.println(data);
    }
    public static void main(String[] args) {
       /*
        Java Generic Method/ Normal Generic Method/ Unbounded Generic Method : Similar to the generic class, we can also create a method that can be used with any type of data. Such a class is known
                                                                               as Generic Method.
                                                                               eg : public <T> void genericMethod(T data) { }

        Here, the type parameter <T> is inserted after the modifier public and before the return type void. We can call the generics method by placing
        the actual type <String> and <Integer> inside the bracket before the method name.
        eg : demo.<String> genericMethod("Java Programming");
        demo.<Integer> genericMethod(25);
       */

        // Using simple method
        printData("Hello World");

        // Using static generic method
        displayData(12);
        displayData("Ammar");
        displayData(true);
        displayData(1.233);

        // Using non-static unbounded generic method
        UnboundedGenericMethod obj = new UnboundedGenericMethod();
        obj.<Integer>returnData(12);// This is also allowed
        obj.returnData(24);// This is also allowed
        obj.returnData("Ammar");
        obj.returnData(1.234);
    }
}
