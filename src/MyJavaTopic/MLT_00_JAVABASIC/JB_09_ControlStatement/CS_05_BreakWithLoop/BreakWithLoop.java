package MyJavaTopic.MLT_00_JAVABASIC.JB_09_ControlStatement.CS_05_BreakWithLoop;

public class BreakWithLoop {
    public static void main(String[] args) {
        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {

            // Stop the loop when i becomes 5
            if (i == 5) {
                break;
            }

            // Print i
            System.out.println(i);
        }
    }
}
