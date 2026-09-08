package MyLearnedTopics.Java.MLT_03_Operator;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        String result = (age >= 18) ? "Adult" : "Not Adult";

        System.out.println(result);
    }
}
