package MyJavaTopic.MLT_00_JAVABASIC.JB_10_Methods.M_02_MethodOverloading;

public class MethodOverloading {
    // Method with two int parameters
    static int add(int a, int b) {
        return a + b;
    }

    // Same method name but three int parameters
    static int add(int a, int b, int c) {
        return a + b + c;
    }

    // Same method name but double parameters
    static double add(double a, double b) {
        return a + b;
    }
    public static void main(String[] args) {
        // Calls add(int, int)
        System.out.println(add(10, 20));

        // Calls add(int, int, int)
        System.out.println(add(10, 20, 30));

        // Calls add(double, double)
        System.out.println(add(10.5, 20.5));
    }
}
