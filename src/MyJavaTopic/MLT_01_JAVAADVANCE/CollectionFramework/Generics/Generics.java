package MyJavaTopic.MLT_01_JAVAADVANCE.CollectionFramework.Generics;

public class Generics {
    // This class only takes String datatype only it does not support other type of datatypes
     static class Student{
        String id;
        public Student(String id){
            this.id = id;
        }
    }
    /* To over come Student class handling all type of datatypes here we make a Generic class called Customer class or Passanger class that supports any type of datatypes.
       Use any capital letter alphabet instead of datatypes to make generics class
     */
    static class Customer<I>{
        I id;
        public Customer(I id){
            this.id = id;
        }
    }

    static class Passanger<I,N,A>{
        I id;
        N name;
        A address;
        // Creating constructor to hold or store value
        public Passanger(I id, N name, A address){
            this.id = id;
            this.name = name;
            this.address = address;
        }
    }
    public static void main(String[] args) {
        /*
          Generics : Generics means parameterized types. Using Generics, it is possible to create classes that work with different data
                     types. An entity such as class, interface, or method that operates on a parameterized type is a generic entity.
         */

        // Creating Student Class object
        Student s1 = new Student("Ammar");

        // Creating Customer Class object
        Customer<Integer> c1 = new Customer<>(12);// defining integer type of data is going to use inside generic class <>
        Customer<String> c2 = new Customer<>("Ammar");// defining string type of data is going to use inside generic class <>

        // Creating Passanger Class object
        Passanger<Integer,String, String> p1 = new Passanger<>(12, "Ammar","Address");// declaring equal number of parameter of that generic class where Integer, String, String there are 3 types of data is going to use inside generic class <>
    }
}
