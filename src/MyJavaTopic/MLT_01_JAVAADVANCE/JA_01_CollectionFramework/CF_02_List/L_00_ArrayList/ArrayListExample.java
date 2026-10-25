package MyJavaTopic.MLT_01_JAVAADVANCE.JA_01_CollectionFramework.CF_02_List.L_00_ArrayList;

import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Display all listed elements
        System.out.println("List Element : " + numbers);

        // Adding element by index without removing existing element on that index
        numbers.add(0,5);
        System.out.println("New Added Element List : " + numbers);

        // Adding additionl group of elements on last
        numbers.addAll(Arrays.asList(60,70,80));
        System.out.println("New Added Group of Element List : " + numbers);

        // Adding additional group of element by index without removing existing element
        numbers.addAll(0, Arrays.asList(1,2,3));
        System.out.println("New Added Group of Element List by Index  : " + numbers);

        // Display element by index based
        System.out.println("Print Element List by Index: " + numbers.get(6));

        // Update existing element by index
        numbers.set(6,4);
        System.out.println("Update Existing Element List By Index: " + numbers);

        // Counting the elements
        System.out.println("Count Existing Element List: " + numbers.size());

        // Check whether the list is empty
        System.out.println("Checking Emptyness of Existing Element List : " + numbers.isEmpty());

        // Check whether a value exist in that list
        System.out.println("Checking the Value Exist in that Element List : " + numbers.contains(4));

        // Finding the index of that element
        System.out.println("Finding Index by Element : " + numbers.indexOf(4));

        // Finding the last index of that element
        System.out.println("Tenth After List : " + numbers.lastIndexOf(80));

        // Remove elements by index
        numbers.remove(6);
        System.out.println("Eleventh After List : " + numbers);

        // Remove elements by elements
        numbers.remove(Integer.valueOf(80));
        System.out.println("Twelveth After List : " + numbers);

        // Remove elements by group of elements
        numbers.removeAll(Arrays.asList(60,70));
        System.out.println("Thirtenth After List : " + numbers);

        // Remove elements by using conditions
        numbers.removeIf(n -> n%2!=0 );
        System.out.println("Fourtenth After List : " + numbers);

        // Clear all list elements
        numbers.clear();
        System.out.println("Fiftenth After List : " + numbers);

        // Adding new list for other operations
        numbers.addAll(Arrays.asList(1,3,2,5,4,6));
        System.out.println("Sixtenth After List : " + numbers);

        // Making in Ascending order method first
        numbers.sort(null);
        System.out.println("Sevententh After List : " + numbers);

        // Making in Ascending order method second
        Collections.sort(numbers);
        System.out.println("Eigntenth After List : " + numbers);

        // Reversing the elements
        Collections.reverse(numbers);
        System.out.println("Ninetenth After List : " + numbers);

        // Swap two elements by index
        Collections.swap(numbers,0,5);
        System.out.println("Twentyth After List : " + numbers);

        // Finding maximum and minimum of that list
        System.out.println("Maximum: " + Collections.max(numbers));
        System.out.println("Minimum: " + Collections.min(numbers));
            }
    }

