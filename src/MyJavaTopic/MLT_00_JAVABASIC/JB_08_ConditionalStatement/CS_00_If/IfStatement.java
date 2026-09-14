package MyJavaTopic.MLT_00_JAVABASIC.JB_08_ConditionalStatement.CS_00_If;

import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Eligible for vote");
        }
    }
}
