package MyLearnedTopics.Java.MLT_07_CollectionFrameWork.Set.LinkedHashSet;
import java.util.*;
public class SetExample {
    public static void main(String[] args) {

        System.out.println("----- Set Example -----");

        Set<String> set = new HashSet<>();

        set.add("Apple");
        set.add("Banana");
        set.add("Orange");
        set.add("Banana");   // duplicate ignored

        System.out.println("Set: " + set);

        set.remove("Orange");
        System.out.println("After remove Orange: " + set);

        System.out.println("Contains Apple? " + set.contains("Apple"));
        System.out.println("Size: " + set.size());


        // HashSet Example
        Set<Integer> mySet = new HashSet<>();
        mySet.add(4);
        mySet.add(11);
        mySet.add(4);  // Duplicate (ignored)

        // Get size
        int len = mySet.size();
        System.out.println("Size of Set: " + len);

        // Print using iterator
        Iterator<Integer> setIterator = mySet.iterator();
        System.out.println("HashSet Elements:");
        while (setIterator.hasNext()) {
            System.out.println(setIterator.next());
        }

        // Check if present
        boolean isPresent = mySet.contains(4);
        System.out.println("Is 4 present? " + isPresent);

        // Add another Set
        Set<Integer> anotherSet = new HashSet<>();
        anotherSet.add(5);
        anotherSet.add(100);
        mySet.addAll(anotherSet);

        // Remove an element
        mySet.remove(100);
        System.out.println("After removal: " + mySet);

        // LinkedHashSet Example
        LinkedHashSet<String> hashSet = new LinkedHashSet<>();
        hashSet.add("rectangle");
        hashSet.add("circle");
        hashSet.add("square");

        /* Java 21 feature: getFirst(), getLast()
        String ele = hashSet.getFirst();
        System.out.println("First Element: " + ele);

        String lastEle = hashSet.getLast();
        System.out.println("Last Element: " + lastEle);

        // Java 21 feature: reversed() returns SequencedSet
        SequencedSet<String> reversedSet = hashSet.reversed();

        Iterator<String> reverseIterator = reversedSet.iterator();
        System.out.println("Reversed Set:");
        while (reverseIterator.hasNext()) {
            System.out.println(reverseIterator.next());
        }*/
    }
}
