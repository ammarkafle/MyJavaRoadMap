package MyLearnedTopics.Java.MLT_04_BODMAS.AdditionMethod;

import java.util.Scanner;

public class InputTakenFromConsoleAddition {
    public static void main(String[] args) {

        //Making Object For Taking Input From Console
        Scanner sc = new Scanner(System.in);

        //Taking First Input From Console
        System.out.print("Enter the first number : ");
        int a = sc.nextInt();

        //Taking Second Input From Console
        System.out.print("Enter the second number : ");
        int b = sc.nextInt();

        //Taking Third Input From Console
        System.out.print("Enter the Third number : ");
        int c = sc.nextInt();

        //Now Adding All Three Input Which We Get From Console
        int sum = a+b+c;

        //Printing The Sum Of Three Number
        System.out.println("The sum of three number is : " + sum);
    }
}
