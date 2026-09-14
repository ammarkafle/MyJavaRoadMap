package MyJavaTopic.MLT_00_JAVABASIC.JB_10_Methods.M_00_ParameterMethod;

public class ParameterMethod {

    // name and age are parameters
    static void studentInfo(String name, int age) {

        // Print the received values
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    public static void main(String[] args) {
        // Pass values to the parameters
        studentInfo("Ammar", 20);
    }
}
