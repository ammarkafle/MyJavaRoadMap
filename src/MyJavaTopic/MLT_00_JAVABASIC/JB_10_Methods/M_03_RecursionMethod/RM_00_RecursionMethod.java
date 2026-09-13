package MyJavaTopic.MLT_00_JAVABASIC.JB_10_Methods.M_03_RecursionMethod;

public class RM_00_RecursionMethod {
    // Recursive method
    static void count(int n) {

        // Base condition stops recursion
        if (n > 5) {
            return;
        }

        // Print the current number
        System.out.println(n);

        // Method calls itself
        count(n + 1);
    }

    public static void main(String[] args) {
        // Start counting from 1
        count(1);
    }
}
