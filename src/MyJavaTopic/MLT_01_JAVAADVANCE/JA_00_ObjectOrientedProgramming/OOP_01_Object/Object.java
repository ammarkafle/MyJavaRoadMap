package MyJavaTopic.MLT_01_JAVAADVANCE.JA_00_ObjectOrientedProgramming.OOP_01_Object;

public class Object {
    static class Student {

        String name;
        int age;

        void study() {
            System.out.println(name + " is studying");
        }
    }

    public static void main(String[] args) {

        // Creating object
        Student s1 = new Student();

        // Giving values
        s1.name = "Ammar";
        s1.age = 20;

        // Calling method
        s1.study();

    }
}


