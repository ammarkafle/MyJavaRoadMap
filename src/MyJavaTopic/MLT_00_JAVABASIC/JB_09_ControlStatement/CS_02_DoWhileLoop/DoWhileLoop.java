package MyJavaTopic.MLT_00_JAVABASIC.JB_09_ControlStatement.CS_02_DoWhileLoop;

public class DoWhileLoop {
    public static void main(String[] args) {
        // Initialize the variable
        int i = 1;

        // Execute this block first
        do {

            // Print the current value
            System.out.println(i);

            // Increase i by 1
            i++;

            // Check the condition after executing the block
        } while (i <= 5);
    }
}
