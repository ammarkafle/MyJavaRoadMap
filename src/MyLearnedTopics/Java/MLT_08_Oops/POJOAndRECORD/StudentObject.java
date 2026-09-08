package MyLearnedTopics.Java.MLT_08_Oops.POJOAndRECORD;

public class StudentObject {
    public static void main(String[] args) {

        //Old Pojo by using class
        System.out.println("Old Method to Print Pojo by class");
        for (int i = 1; i <= 5; i++) {
            StudentPOJO method1 = new StudentPOJO("S1" + i,
                    switch (i) {
                        case 1 -> "Ammar";
                        case 2 -> "Aman";
                        case 3 -> "Amrita";
                        case 4 -> "Dinesh";
                        case 5 -> "Tara";
                        default -> "Anonymous";
                    },
                    "23/10/2005",
                    "Java");
            System.out.println(method1);
        }

        System.out.println("");
        System.out.println("");

        // New Pojo by using Record
        System.out.println("New Method to print Pojo by record class");
        for (int i = 1; i <= 5; i++) {
            StudentRECORD method2 = new StudentRECORD("S1" + i,
                    switch (i) {
                        case 1 -> "Ammar";
                        case 2 -> "Aman";
                        case 3 -> "Amrita";
                        case 4 -> "Dinesh";
                        case 5 -> "Tara";
                        default -> "Anonymous";
                    },
                    "23/10/2005",
                    "Java");
            System.out.println(method2);
        }
        System.out.println("");
        System.out.println("");
        // Differences Between Old POJO and New POJO
        StudentPOJO oldMethod1= new StudentPOJO("S1","03/02/2009","Amanshu","HTML");
       // Getter and Setter Both works on Pojo old Class
        System.out.println(oldMethod1.getStudentName());
        oldMethod1.setStudentName("Kimanshu");
        StudentRECORD newMethod1= new StudentRECORD("S2","09/11/2000","Himanshu","CSS");
        // Getter and Setter in Here Only Getter works on Pojo New Record
        System.out.println(newMethod1.studentName());
       // newMethod1.setStudentName("Simanshu");
    }
}
