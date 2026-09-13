package MyJavaTopic.MLT_00_JAVABASIC.JB_10_Methods.M_01_ReturnValueMethod;

public class RVM_00_ReturnValueMethod {
    // int means this method will return an integer
    static int add(int a, int b) {

        // Calculate the sum
        int result = a + b;

        // Return the result
        return result;
    }
    public static void main(String[] args) {
        // Store the returned value
        int answer = add(10, 20);

        // Print the result
        System.out.println("Sum = " + answer);
    }
}
