package MyLearnedTopics.Java.MLT_03_Operator;

import java.util.Scanner;

public class LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the age : ");
        int age = sc.nextInt();

        System.out.println(age > 18 && age < 30);
        System.out.println(age > 18 || age < 10);
        System.out.println(!(age > 18));
    }
}
