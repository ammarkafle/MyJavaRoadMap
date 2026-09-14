package MyJavaTopic.MLT_00_JAVABASIC.JB_09_ControlStatement.CS_04_NestedForLoop;

public class NestedForLoop {
    public static void main(String[] args) {
        // Outer loop controls the rows
        for (int row = 1; row <= 3; row++) {

            // Inner loop controls the columns
            for (int column = 1; column <= 3; column++) {

                // Print * for each column
                System.out.print("* ");
            }

            // Move to the next line after each row
            System.out.println();
        }
    }
}
