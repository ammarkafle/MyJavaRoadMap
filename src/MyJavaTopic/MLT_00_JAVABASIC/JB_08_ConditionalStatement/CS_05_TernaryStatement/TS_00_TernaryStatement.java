package MyJavaTopic.MLT_00_JAVABASIC.JB_08_ConditionalStatement.CS_05_TernaryStatement;

import java.util.Scanner;

public class TS_00_TernaryStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the your age : ");
        int age = sc.nextInt();

        String result = (age>=18)?"Eligible for vote":"Not Eligible for vote";
        System.out.println(result);

    }
}
