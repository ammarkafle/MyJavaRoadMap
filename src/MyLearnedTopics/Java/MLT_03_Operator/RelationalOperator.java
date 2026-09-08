package MyLearnedTopics.Java.MLT_03_Operator;

import java.util.Scanner;

public class RelationalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        System.out.println("Is a is greater then b : " + (a > b));
        System.out.println("Is a is less then b : " + (a < b));
        System.out.println("Is a is equal to b : " + (a == b));
        System.out.println("Is a is not equal to b : " + (a != b));
    }
}
