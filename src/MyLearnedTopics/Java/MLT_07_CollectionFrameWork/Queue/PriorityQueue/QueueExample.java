package MyLearnedTopics.Java.MLT_07_CollectionFrameWork.Queue.PriorityQueue;
import java.util.*;

public class QueueExample {

    public void run() {
        System.out.println("----- Queue Example -----");

        Queue<String> queue1 = new LinkedList<>();

        queue1.add("Ammar");
        queue1.add("Bimal");
        queue1.add("Chandra");

        System.out.println("Queue: " + queue1);

        System.out.println("Peek (front): " + queue1.peek());
        System.out.println("Poll (remove front): " + queue1.poll());
        System.out.println("After poll: " + queue1);

        System.out.println("Offer element 'Ammar'");
        queue1.offer("Ammar");
        System.out.println("Queue after offer: " + queue1);


        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(50);
        queue.add(40);


        System.out.println("\n\n");
        Iterator<Integer> queueIterator = queue.iterator();
        while (queueIterator.hasNext()){
            System.out.print(" "+queueIterator.next());
        }

        queue.remove();
        System.out.println("\n peak element: " + queue.peek());

        System.out.println("\n After removing elements");

        for(Integer n : queue){
            System.out.print(" "+ n);
        }

        System.out.println("\n poll element: " + queue.poll());

        for(Integer n : queue){
            System.out.print(" "+ n);
        }


    }
}

