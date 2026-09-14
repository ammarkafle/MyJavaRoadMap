package MyJavaTopic.MLT_00_JAVABASIC.JB_09_ControlStatement.CS_06_ContinueWithLoop;

public class ContinueWithLoop {
    public static void main(String[] args) {
        // Loop from 1 to 5
        for (int i = 1; i <= 5; i++) {

            // Skip the number 3
            if (i == 3) {
                continue;
            }

            // Print the remaining numbers
            System.out.println(i);
        }
    }
}
