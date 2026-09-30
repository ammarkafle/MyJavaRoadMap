import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Ammar");



        /* Todays Topic
         1. Input Taken Method
         Method 1 : Direct Assigned Input */

        int customerAge = 29;
        String customerName = "Ammar Kafle";

        // Method 2 : (Terminal or Console) Taken Input

        Scanner sc = new Scanner (System.in); // Object creation of Scanner

        // For String Input
        System.out.println(" Enter your Name : "); // Taking name from Terminal
        String myName = sc.nextLine(); // Terminal Input is stored in myName variable
        System.out.println(myName); // Printing the myName

        // For Other Datatype
        System.out.println("Enter your Age: "); // Displaying what is going to taken Input
        int myAge = sc.nextInt();
        System.out.println(myAge);














    }
}