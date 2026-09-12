package MyJavaTopic.MLT_00_JAVABASIC.JB_08_ConditionalStatement.CS_02_IfElseIf;

import java.util.Scanner;

public class IEI_00_IfElseIfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if(age>=18){
            System.out.println("Eligible for vote");
        }
        else if(age==0 || age<0) {
            System.out.println("Invalid Age");
        }
        else {
            System.out.println("Not Eligible for vote");
        }
    }
}
