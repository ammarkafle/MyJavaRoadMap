package MyJavaTopic.MLT_00_JAVABASIC.JB_06_Operators.O_03_LogicalOperator;

import java.util.Scanner;

public class LO_00_LogicalOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("\n--- Logical Operations ---"); // \n is used for line break or jumping to next line

        // Logical AND (&&)
        System.out.println("(num1 > 10 && num2 > 10): " + (num1 > 10 && num2 > 10));

        // Logical OR (||)
        System.out.println("(num1 > 10 || num2 > 10): " + (num1 > 10 || num2 > 10));

        // Logical NOT (!)
        System.out.println("!(num1 > 10): " + !(num1 > 10));

        input.close();
    }
}
