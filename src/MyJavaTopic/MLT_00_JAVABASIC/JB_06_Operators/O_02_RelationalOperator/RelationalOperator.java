package MyJavaTopic.MLT_00_JAVABASIC.JB_06_Operators.O_02_RelationalOperator;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter first number: ");
        int num1 = input.nextInt();
        System.out.print("Enter second number: ");
        int num2 = input.nextInt();

        System.out.println("\n--- Relational Operations ---"); // \n is used for line break or jumping to next line

        // == Equal to
        System.out.println("Equal to (==): " + (num1 == num2));

        // != Not equal to
        System.out.println("Not equal to (!=): " + (num1 != num2));

        // > Greater than
        System.out.println("Greater than (>): " + (num1 > num2));

        // < Less than
        System.out.println("Less than (<): " + (num1 < num2));

        // >= Greater than or equal to
        System.out.println("Greater than or equal to (>=): " + (num1 >= num2));

        // <= Less than or equal to
        System.out.println("Less than or equal to (<=): " + (num1 <= num2));

        input.close();
    }
}
