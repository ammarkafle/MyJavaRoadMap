package MyJavaTopic.MLT_00_JAVABASIC.JB_06_Operators.O_04_UnaryOperator;

import java.util.Scanner;

public class UnaryOperator {
    public static void main() {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num = input.nextInt();

        System.out.println("\n--- Unary Operations ---"); // \n is used for line break or jumping to next line

        // Unary plus
        System.out.println("Unary plus (+): " + (+num));

        // Unary minus
        System.out.println("Unary minus (-): " + (-num));

        // Increment
        num++;
        System.out.println("Increment (++): " + num);

        // Decrement
        num--;
        System.out.println("Decrement (--): " + num);

        // Logical NOT
        boolean value = true;
        System.out.println("Logical NOT (!): " + (!value)); // !true  → false and !false → true

        input.close();
    }
}
