package MyLearnedTopics.Java.MLT_07_CollectionFrameWork.List.Vector;
import java.util.*;

public class VectorListExample {
    public static void main(String[] args) {

        // Size of the Vector
        int n = 5;

        // Declaring the Vector with
        // initial size n
        Vector<Integer> v = new Vector<Integer>(n);

        // Appending new elements at
        // the end of the vector
        for (int i = 1; i <= n; i++)
            v.add(i);

        // Printing elements
        System.out.println(v);

        // Remove element at index 3
        v.remove(3);

        // Displaying the vector
        // after deletion
        System.out.println(v);

        // iterating over vector elements
        // using old for loop
        for (int i = 0; i < v.size(); i++)
            // Printing elements one by one
            System.out.print(v.get(i) + " ");

        // using enhanced for loop
        for (Integer integer : v)
            // Printing elements one by one
            System.out.print(integer + " ");

                System.out.println("----- Vector Example -----");

                Vector<String> vector = new Vector<>();
                vector.add("Red");
                vector.add("Green");
                vector.add("Blue");

                System.out.println("Vector: " + vector);
                System.out.println("Element at index 1: " + vector.get(1));
                vector.remove("Green");
                System.out.println("After Removal: " + vector);
                System.out.println("Vector Capacity: " + vector.capacity());
                System.out.println();
            }
        }