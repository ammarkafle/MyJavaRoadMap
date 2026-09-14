package MyJavaTopic.MLT_01_JAVAADVANCE.JA_00_ObjectOrientedProgramming.OOP_02_Constructor.C_03_CopyConstructor;

public class CopyConstructor {
    String name;
    int age;

    CopyConstructor(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    CopyConstructor(CopyConstructor other) {
        this.name = other.name;
        this.age = other.age;
    }

    void display() {
        System.out.println(name + " " + age);
    }

    public static void main(String[] args) {
        CopyConstructor s1 = new CopyConstructor("Ammar", 20);

        // Copy s1 into s2
        CopyConstructor s2 = new CopyConstructor(s1);

        s1.display();
        s2.display();
    }
}
