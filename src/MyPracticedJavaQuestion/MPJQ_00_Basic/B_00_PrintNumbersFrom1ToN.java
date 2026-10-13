package MyPracticedJavaQuestion.MPJQ_00_Basic;
import java.util.Scanner;
public class B_00_PrintNumbersFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter the N numbers To Print : ");
        int enteredNumber = sc.nextInt();

        for ( int i=1 ; i <=enteredNumber; i++){
            System.out.println(i);
        }
    }
}
