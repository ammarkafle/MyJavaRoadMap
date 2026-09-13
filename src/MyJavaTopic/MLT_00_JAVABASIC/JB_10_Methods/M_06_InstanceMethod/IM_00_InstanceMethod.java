package MyJavaTopic.MLT_00_JAVABASIC.JB_10_Methods.M_06_InstanceMethod;

import com.sun.tools.javac.Main;

public class IM_00_InstanceMethod {
    // Instance method
    void hello() {

        // Print message
        System.out.println("Hello Java");
    }
    public static void main(String[] args) {
        // Create an object of Main
        IM_00_InstanceMethod obj = new IM_00_InstanceMethod();

        // Call the instance method using the object
        obj.hello();
    }
}
