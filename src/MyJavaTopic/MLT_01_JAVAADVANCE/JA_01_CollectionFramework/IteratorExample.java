package MyJavaTopic.MLT_01_JAVAADVANCE.JA_01_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

public class IteratorExample {
    public static void main(String[] args) {

        // Create a list of student names
        List<String> students = new ArrayList<>();

        students.add("Ammar");
        students.add("Ram");
        students.add("Sita");
        students.add("Hari");
        students.add("Gita");

        // Create an Iterator from the student list
        Iterator<String> iterator = students.iterator();

        System.out.println("Students:");

        // hasNext() checks whether another element is available
        while (iterator.hasNext()) {

            // next() gets the next element
            String student = iterator.next();

            System.out.println(student);
        }

        // Create a new Iterator because the previous
        // Iterator has already reached the end
        iterator = students.iterator();

        // Rem ove through the list
        while (iterator.hasNext()) {

            // Get the current student
            String student = iterator.next();

            // Check the student name
            if (student.equals("Ram")) {

                // remove() removes the current element
                iterator.remove();
            }
        }

        System.out.println("\nAfter removing Ram:");
        System.out.println(students);

        // Create another Iterator
        iterator = students.iterator();

        System.out.println("\nUsing forEachRemaining():");
        // forEachRemaining() processes all remaining elements
        iterator.forEachRemaining(new Consumer<String>() {
            @Override
            public void accept(String student) {
                // Print each remaining student
                System.out.println(student);
               }
            }
        );
    }
}