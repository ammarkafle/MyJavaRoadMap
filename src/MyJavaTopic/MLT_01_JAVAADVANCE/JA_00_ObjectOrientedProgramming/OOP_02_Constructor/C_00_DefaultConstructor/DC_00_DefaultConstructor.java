package MyJavaTopic.MLT_01_JAVAADVANCE.JA_00_ObjectOrientedProgramming.OOP_02_Constructor.C_00_DefaultConstructor;

public class DC_00_DefaultConstructor {
    String name;
    int age;

    public static void main(String[] args) {

        // Java provides a default constructor
        DC_00_DefaultConstructor s1 = new DC_00_DefaultConstructor();

        s1.name = "Ammar";
        s1.age = 20;

        System.out.println(s1.name);
        System.out.println(s1.age);
    }
}
