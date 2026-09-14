package MyJavaTopic.MLT_00_JAVABASIC.JB_05_InputAndOutput;

import java.util.Scanner;

public class InputAndOutput {
   public static void main(String[] args) {

       // This is the creation of object to take input from use or console
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter your Name: ");
       String name = sc.nextLine();
       System.out.print("Enter your Address:");
       String address= sc.nextLine();
       System.out.print("ENter your age: ");
       int age = sc.nextInt();

       // Space or Line Break print
       System.out.println(" ");
       System.out.println(" ");

       // println method output
       System.out.println("Using println method for output");
       System.out.println("Name : " + name);
       System.out.println("Address : " + address);
       System.out.println("Age : " + age);

       // Space or Line Break print
       System.out.println(" ");
       System.out.println(" ");

       // print method output
       System.out.println("Using print method for output");
       System.out.print("Name : " + name);
       System.out.print("Address : " + address);
       System.out.print("Age : " + age);

       // Space or Line Break print
       System.out.println(" ");
       System.out.println(" ");

       // printf method output
       System.out.println("Using printf method for output");
       System.out.printf("Name : %s%n", name); // %n = new line
       System.out.printf("Address : %s%n", address); // %n = new line
       System.out.printf("Age : %d%n", age); // %n = new line

       // This is for closing the scanner input taken from use
       sc.close();
    }
}
