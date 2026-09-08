package MyLearnedTopics.Java.MLT_07_CollectionFrameWork.List.LinkedList;
import java.util.*;
public class LinkedListExample {
    public static void main(String[] args) {

        // LINKEDLIST LIST THE DATA BY CONNECTION EACH OTHER NODE SERIALLY

       LinkedList<Integer> list = new LinkedList<>();

        list.add(12);
        list.add(21);
        list.add(33);
        list.add(67);
        System.out.println(" ADDED LIST ARE : " + list);

        System.out.println("----- LinkedList Example -----");

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.addFirst(5);
        numbers.addLast(30);

        System.out.println("LinkedList: " + numbers);
        numbers.removeFirst();
        System.out.println("After removeFirst(): " + numbers);
        System.out.println("Get First: " + numbers.getFirst());
        System.out.println();
    }
}
