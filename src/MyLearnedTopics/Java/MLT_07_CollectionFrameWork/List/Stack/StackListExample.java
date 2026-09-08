package MyLearnedTopics.Java.MLT_07_CollectionFrameWork.List.Stack;
import java.util.*;
public class StackListExample {
    public static void main(String[] args) {

        //  LIFO → Last In, First Out

        // Create a new stack
        Stack<Integer> s = new Stack<>();

        // Push elements onto the stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // Pop elements from the stack
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }

        // Default initialization of Stack
        Stack stack1 = new Stack();

        // Initialization of Stack using Generics
        Stack<String> stack2 = new Stack<String>();

        // pushing the elements
        stack1.push("4");
        stack1.push("All");
        stack1.push("Geeks");

        stack2.push("Geeks");
        stack2.push("For");
        stack2.push("Geeks");

        // Printing the Stack Elements
        System.out.println(stack1);
        System.out.println(stack2);


                System.out.println("----- Stack Example -----");

                Stack<Integer> stack = new Stack<>();
                stack.push(100);
                stack.push(200);
                stack.push(300);

                System.out.println("Stack: " + stack);
                System.out.println("Peek: " + stack.peek());
                System.out.println("Pop: " + stack.pop());
                System.out.println("After pop: " + stack);
                System.out.println();
            }
        }