package MyJavaTopic.MLT_00_JAVABASIC.JB_06_Operators.O_05_TernaryOperator;

import java.util.Scanner;

public class TO_00_TernaryOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // Ternary operator
        String result = (age >= 18) ? "You are eligible for vote" : "You are not eligible for vote";

        System.out.println("Result: " + result);

        input.close();
    }
}
