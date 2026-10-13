package MyPracticedJavaQuestion.MPJQ_00_Basic;

import java.util.Scanner;

public class B_01_CheckWhetherANumberIsEvenOrOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number to Check : ");
        int checkNumber = sc.nextInt();

        if(checkNumber%2==0){
            System.out.println("The Entered Number Is Even");
        }
        else{
            System.out.println("The Entered Number Is Odd");
        }
    }
}
