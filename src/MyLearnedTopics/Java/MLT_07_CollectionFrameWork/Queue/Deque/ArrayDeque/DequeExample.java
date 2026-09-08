package MyLearnedTopics.Java.MLT_07_CollectionFrameWork.Queue.Deque.ArrayDeque;
import java.util.*;
public class DequeExample {
    public static void main(String[] args) {

        Deque<Integer> deque1 = new ArrayDeque<>();

        deque1.add(10);
        deque1.add(20);
        deque1.add(50);
        deque1.add(40);

        System.out.println("Elements in Dqueue");
        Iterator<Integer> dqueIterator = deque1.iterator();
        while (dqueIterator.hasNext()){
            System.out.print(" "+dqueIterator.next());
        }

        deque1.addFirst(30);
        deque1.addLast(90);

        System.out.println("\n After add in first and last in Dqueue \n ");
        for( Integer i : deque1){
            System.out.print(" " + i);
        }

        System.out.println("----- Deque Example -----");

        Deque<Integer> deque2 = new ArrayDeque<>();

        // Adding elements
        deque2.addFirst(10);
        deque2.addLast(20);
        deque2.addLast(30);
        deque2.addFirst(5);

        System.out.println("Deque: " + deque2);

        // Removing
        System.out.println("Removed First: " + deque2.removeFirst());
        System.out.println("Removed Last: " + deque2.removeLast());

        System.out.println("Deque after removals: " + deque2);

        // Peek
        System.out.println("Peek First: " + deque2.peekFirst());
        System.out.println("Peek Last: " + deque2.peekLast());
    }
}
