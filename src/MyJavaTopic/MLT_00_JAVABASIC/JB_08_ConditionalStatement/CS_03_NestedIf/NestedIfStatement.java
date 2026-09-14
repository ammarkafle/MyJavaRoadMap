package MyJavaTopic.MLT_00_JAVABASIC.JB_08_ConditionalStatement.CS_03_NestedIf;

import java.util.Scanner;

public class NestedIfStatement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age : ");
        int age = sc.nextInt();

        if (age >= 18) {
            boolean hasLicense = true;

            if (hasLicense) {
                System.out.println("You can drive");
            }

        }else{
            System.out.println("You are not adult");
        }
    }
}
