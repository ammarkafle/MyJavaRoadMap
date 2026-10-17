
package MyJavaTopic.MLT_01_JAVAADVANCE.JA_01_CollectionFramework.CF_01_ListIterator;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {
    public static void main(String[] args) {

        // Create a list of students
        List<String> students = new ArrayList<>();

        students.add("Ammar");
        students.add("Ram");
        students.add("Sita");

        // Create a ListIterator
        ListIterator<String> iterator = students.listIterator();

        // 1. hasNext() and 2. next()
        while (iterator.hasNext()) {
            System.out.println("Next: " + iterator.next());
        }

        // 3. hasPrevious() and 4. previous()
        while (iterator.hasPrevious()) {
            System.out.println("Previous: " + iterator.previous());
        }

        // 5. nextIndex() and 6. previousIndex()
        System.out.println("Next index: " + iterator.nextIndex());
        System.out.println("Previous index: " + iterator.previousIndex());

        // Move to the first student
        String name = iterator.next();

        // 7. set() replaces the last returned student
        iterator.set("Ammar Updated");

        // 8. add() inserts a new student
        iterator.add("New Student");

        // Move to the next student so remove() becomes legal
        iterator.next();

        // 9. remove() removes the element returned by next()
        iterator.remove();

        // Display the updated list
        System.out.println("Updated list: " + students);
    }
}
