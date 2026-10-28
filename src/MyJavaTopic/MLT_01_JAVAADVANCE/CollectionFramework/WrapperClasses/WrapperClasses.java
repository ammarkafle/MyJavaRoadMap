package MyJavaTopic.MLT_01_JAVAADVANCE.CollectionFramework.WrapperClasses;

public class WrapperClasses {
    public static void main(String[] args) {
        /*
          Wrapper Classes : A wrapper class in java is a class whose object wraps or contains primitive data types.
                            When we create an object to a wrapper class, it contains a field and in thisfield, we
                            can store primitive data types.

          Here is the wrapper classes in java :

          Primitive Datatypes           Wrapper Class
          i) int               =        Integer
          ii) double           =        Double
          iii) float           =        Float
          iv) boolean          =        Boolean
          v) long              =        Long
          vi) short            =        Short
          vii) byte            =        Byte
          viii) char           =        Character

          Need of Wrapper Classes :
          1. The classes in java.util.package handles only objects and hence wrapper classes help in this case also.
          2. Data structures in the Collection framework, such as ArrayList and Vector, store only objects ( reference types ) and not primitive types.
          3. An object is needed to support synchronization in multithreading.

          Autoboxing : The automatic conversion of primitive types to the object of their corresponding wrapper classes is known as autoboxing.
                       For example : conversion of int to Integer, long to Long, double to Double, etc.

          Unboxing : It is just the reverse process of autoboxing. Automatically converting an object of a wrapper class to its corresponding primitive type is known
                     as unboxing.
                     For example : conversion of Integer to int, Long to long, Double to double, etc.
         */

        Integer obj1 = new Integer(20);
        Integer obj2 = Integer.valueOf(21); // This is java recommendation of making wrapper class

        // valueOf is also used for converting String to other data types
        Long phoneNumber = Long.valueOf("9898989898");
        System.out.println(phoneNumber*3);

        Integer obj3 = 18; // This is Autoboxing
        System.out.println(obj3);

        int obj4 = obj3; // This is Unboxing
        System.out.println(obj4);



    }
}
