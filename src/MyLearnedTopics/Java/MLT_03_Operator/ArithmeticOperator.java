package MyLearnedTopics.Java.MLT_03_Operator;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
    int b = sc.nextInt();

        System.out.println("The Add of a and b is : " + (a + b)); // Addition
        System.out.println("The Sub of a and b is : " + (a - b)); // Subtraction
        System.out.println("The Mul of a and b is : " + (a * b)); // Multiplication
        System.out.println("The Div of a and b is : " + (a / b)); // Division
        System.out.println("The Rem of a and b is : " + (a % b)); // Remainder
    }
}
