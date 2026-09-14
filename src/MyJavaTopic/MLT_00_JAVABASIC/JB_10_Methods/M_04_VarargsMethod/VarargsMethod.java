package MyJavaTopic.MLT_00_JAVABASIC.JB_10_Methods.M_04_VarargsMethod;

public class VarargsMethod {
    // numbers can receive any number of integers
    static void add(int... numbers) {

        // Store the total
        int sum = 0;

        // Go through each number
        for (int number : numbers) {

            // Add the number to sum
            sum = sum + number;
        }

        // Print the total
        System.out.println("Sum = " + sum);
    }
    public static void main(String[] args) {

        // Pass two numbers
        add(10, 20);

        // Pass three numbers
        add(10, 20, 30);

        // Pass five numbers
        add(10, 20, 30, 40, 50);
    }
}
