package MyJavaTopic.MLT_01_JAVAADVANCE.CollectionFramework.Generics;

public class BoundedGenericMethod {
    // Creating bounded generic method
    <E extends Number> void printdata(E data){
        System.out.println(data);
    }
    public static void main(String[] args) {
        /*
          Bounded Generic Types : In general, the type parameter can accept any data types ( except primitive types ). However, if we want to use generics for some  specific types ( such as
                                  accept data of number types ) only, then we can use bounded types. In the case of bound types, we use the extends keyword.

          Here, GenericsClass is created with bounded type. This means GenericsClass can only work with data types that are children of Number ( Integer, Double, and so on ).
        */

        BoundedGenericMethod obj = new BoundedGenericMethod();
        obj.printdata(12);
        obj.printdata(12.44);
       // obj.printdata("ammar"); this is not supported by bounded generic method because we extends Number in the method that the data will be number only
    }
}
