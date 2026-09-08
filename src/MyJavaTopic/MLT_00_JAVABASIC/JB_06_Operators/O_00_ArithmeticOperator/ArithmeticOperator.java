package MyJavaTopic.MLT_00_JAVABASIC.JB_06_Operators.O_00_ArithmeticOperator;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main() {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        // Arithmetic operations
        int addition = num1 + num2;
        int subtraction = num1 - num2;
        int multiplication = num1 * num2;
        int division = num1 / num2;
        int modulus = num1 % num2;

        // Display results
        System.out.println("\n--- Arithmetic Operations ---"); // \n is used for line break or jumping to next line

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);

        input.close();
    }
}
