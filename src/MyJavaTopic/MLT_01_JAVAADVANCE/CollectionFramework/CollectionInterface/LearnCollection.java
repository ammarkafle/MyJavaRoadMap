package MyJavaTopic.MLT_01_JAVAADVANCE.CollectionFramework.CollectionInterface;


import java.util.ArrayList;
import java.util.Collection;

public class LearnCollection {
    public static void main(String[] args) {
        /*
          Java Collection Framework : The java Collections framework provides a set of interfaces and classes to implement various
                                      data structures and algorithms. These interfaces include several methods to perform different operations on collections.

          Java Collection Interface : The Collection interface is the root interface of the java collections framework.
                                      We cannot make object of the interfaces instead we use classes of that interfaces.

          Table:
                Collection --> 1) List --> i) ArrayList
                                           ii) LinkedList
                                           iii) Stack
                                           iv) Vector
                               2) Set
                               3) Queue

          The Collection interface includes various methods that can be used to perform different operations on objects. Some of the methods are :
          i) int size() : Returns the number of elements in the collections
          ii) boolean isEMpty() : Returns true if the collection contains no elements.
          iii) boolean contains(Object o) : Returns true if the collection contains the specified element.
          iv) boolean add(E e) : Adds the specified
         */

        // Applying some methods comes from Collection Interface
        Collection<Integer> collection1 = new ArrayList<>();

        // Add data
        collection1.add(1);
        collection1.add(4);
        collection1.add(6);
        collection1.add(2);
        System.out.println(collection1);

        // Find size of data
        System.out.println(collection1.size());

        // Check data
        System.out.println(collection1.contains(2));

        // Remove data
        collection1.remove(2);
        collection1.remove(Integer.valueOf(1));
        System.out.println(collection1);

        // Check emptyness
        System.out.println(collection1.isEmpty());

        // Check data available in other collections
        Collection<Integer> collection2 = new ArrayList<>();

        collection2.add(5);
        collection2.add(4);

        System.out.println(collection1.containsAll(collection2));

        // Add all data
        System.out.println(collection1.addAll(collection2));
        System.out.println(collection1);

        // Remove all data from collection that contain in one another
        collection1.removeAll(collection2);
        System.out.println(collection1);

        // Retain all data from collections that are not contain in one another
        collection1.retainAll(collection2);
        System.out.println(collection1);

        // Clear data from collection
        collection1.clear();
        System.out.println(collection1);

    }
}
