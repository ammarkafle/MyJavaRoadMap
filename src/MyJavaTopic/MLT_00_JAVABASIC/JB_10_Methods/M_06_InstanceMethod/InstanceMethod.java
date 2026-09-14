package MyJavaTopic.MLT_00_JAVABASIC.JB_10_Methods.M_06_InstanceMethod;

public class InstanceMethod {
    // Instance method
    void hello() {

        // Print message
        System.out.println("Hello Java");
    }
    public static void main(String[] args) {
        // Create an object of Main
        InstanceMethod obj = new InstanceMethod();

        // Call the instance method using the object
        obj.hello();
    }
}
