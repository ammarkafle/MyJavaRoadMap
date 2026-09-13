package MyJavaTopic.MLT_00_JAVABASIC.JB_09_ControlStatement.CS_01_WhileLoop;

public class WL_00_WhileLoop {
    public static void main(String[] args) {
        // Initialize the variable before the loop
        int i = 1;

        // Check whether i is less than or equal to 5
        while (i <= 5) {

            // Print the current value of i
            System.out.println(i);

            // Increase i by 1
            // This prevents the loop from running forever
            i++;
        }

    }
}
