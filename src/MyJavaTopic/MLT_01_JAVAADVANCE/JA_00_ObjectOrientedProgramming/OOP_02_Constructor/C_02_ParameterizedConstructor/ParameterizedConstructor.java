package MyJavaTopic.MLT_01_JAVAADVANCE.JA_00_ObjectOrientedProgramming.OOP_02_Constructor.C_02_ParameterizedConstructor;

public class ParameterizedConstructor {
    String name;
    int age;

    // Parameterized constructor
    ParameterizedConstructor(String name, int age) {

        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name);
        System.out.println(age);
    }

    public static void main(String[] args) {

        ParameterizedConstructor p1= new ParameterizedConstructor("Ammar",20);
        ParameterizedConstructor p2 = new ParameterizedConstructor("Kushal",21);

        p1.display();
        p2.display();
    }
}
