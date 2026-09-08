package MyJavaTopic.MLT_00_JAVABASIC.JB_06_Operators.O_01_AssignmentOperator;

import java.util.Scanner;

public class AssignmentOperator {
    public static void main() {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a number: ");
        int num1 = input.nextInt();

        // Initializing num2;
        int num2;
        System.out.println("\n--- Assignment Operations ---"); // \n is used for line break or jumping to next line

        // = assign or equal
        num2 = num1;
        System.out.println("=  : " + num2);

        // += Add and assign or equal
        num2 = num1;
        num2 += 5;
        System.out.println("+= : " + num2);

        // -= Subtract and assign or equal
        num2= num1;
        num2 -= 5;
        System.out.println("-= : " + num2);

        // *= Multiply and assign or equal
        num2 = num1;
        num2 *= 5;
        System.out.println("*= : " + num2);

        // /= Divide and assign or equal
        num2 = num1;
        num2 /= 5;
        System.out.println("/= : " + num2);

        // %= Modulus and assign or equal
        num2 = num1;
        num2 %= 6;
        System.out.println("%= : " + num2);

        input.close();
    }
}
