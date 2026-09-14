package MyJavaTopic.MLT_01_JAVAADVANCE.JA_00_ObjectOrientedProgramming.OOP_02_Constructor.C_01_NoArgumentConstructor;

public class NoArgumentConstructor {
    String name;
    int age;

    // No-argument constructor
    NoArgumentConstructor() {
        name = "Ammar";
        age = 20;
    }

    public static void main(String[] args) {
        // Create an object
        NoArgumentConstructor obj = new NoArgumentConstructor();

        // Print the values
        System.out.println("Name: " + obj.name);
        System.out.println("Age: " + obj.age);
    }
}
