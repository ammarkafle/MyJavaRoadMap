package MyLearnedTopics.Java.MLT_07_CollectionFrameWork.List.ArrayList;
import java.util.*;
public class ArrayListExample {
    public static void main(String[] args) {

        // ARRAYLIST LIST THE DATA IN DYNAMIC OR RANDOM FORM IN NULL INDEX ITSELF WHERE IT IS FREE

        //LIST 1
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(200);
        list1.add(50);
        list1.add(22);
        System.out.println( "LIST 1 OUTPUT : " + list1);

        //LIST 2
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(4);
        list2.add(30);
        System.out.println( "LIST 2 OUTPUT : " + list2);

        //MERGING BOTH LIST 1 AND LIST 2
        list1.addAll(list2);
        //PRINTING BY USING ITERATOR EXAMPLE
        Iterator<Integer> listIterator = list1.iterator();
        while (listIterator.hasNext()) {
            System.out.println("from iterator: " + listIterator.next());
        }

            System.out.println("----- ArrayList Example -----");

            ArrayList<String> list = new ArrayList<>();
            list.add("Apple");
            list.add("Banana");
            list.add("Orange");

            System.out.println("ArrayList: " + list);
            list.remove("Banana");
            System.out.println("After Removal: " + list);
            System.out.println("Get element: " + list.get(1));
        }
    }

