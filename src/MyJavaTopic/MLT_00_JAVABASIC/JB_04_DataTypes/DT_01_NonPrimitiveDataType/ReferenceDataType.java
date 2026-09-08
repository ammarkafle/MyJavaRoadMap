package MyJavaTopic.MLT_00_JAVABASIC.JB_04_DataTypes.DT_01_NonPrimitiveDataType;

public class ReferenceDataType {
    public static void main() {

        // String
        String name = "Ammar Kafle";
        System.out.println(name);

        // Array
        int[] marks = {80, 88, 90};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        // Class
        class Student {
            String name;
            int age;
        }

        // Creating Object of Class
        Student student = new Student();
        student.name = "Ammar Kafle";
        student.age = 20;
        System.out.println(student.name);
        System.out.println(student.age);

        // Interface
        interface Vehicle {
            void start();
        }
        class Car implements Vehicle {
            public void start() {
                System.out.println("Car is starting");
            }
        }
        Vehicle vehicle = new Car();
        vehicle.start();

        // Enum
        enum Day {
            MONDAY,
            TUESDAY,
            WEDNESDAY
        }
        Day today = Day.MONDAY;
        System.out.println(today);


    }
}
