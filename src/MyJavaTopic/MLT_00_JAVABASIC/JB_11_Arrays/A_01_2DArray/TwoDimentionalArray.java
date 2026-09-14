package MyJavaTopic.MLT_00_JAVABASIC.JB_11_Arrays.A_01_2DArray;

public class TwoDimentionalArray {
    public static void main(String[] args) {
        int[][] numbers = {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}};

        /*
                     Column
             0   1   2
           ┌────────────
Row 0      │ 10  20  30
Row 1      │ 40  50  60
Row 2      │ 70  80  90
         */


        System.out.println(numbers[0][0]);
        System.out.println(numbers[1][1]);
        System.out.println(numbers[2][2]);
    }
}
