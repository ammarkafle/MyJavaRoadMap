package MyLearnedTopics.Java.MLT_08_Oops.Constructor.ImplicitConstructor;

public class Student {
    public static void main(String[] args) {
        // Creating Object
        StudentDetail student = new StudentDetail();

        //Printing default values
        System.out.println("Name : " + student.studentName);
        System.out.println("Age : " + student.studentAge);
    }
}
