package MyJavaTopic.MLT_01_JAVAADVANCE.JA_00_ObjectOrientedProgramming.OOP_03_Encapsulation;

public class Encapsulation {

    private String studentName;
    private int studentAge;
    private String collegeName;

    // Setter method is used to set the value
    public void setStudentName(String studentName){
        this.studentName=studentName;
    }
    public void setStudentAge(int studentAge){
        this.studentAge =studentAge;
    }
    public void setCollegeName(String collegeName){
        this.collegeName=collegeName;
    }

    // Getter method is used to get the value
    public String getStudentName(){
        return studentName;
    }
    public int getStudentAge(){
        return studentAge;
    }
    public String getCollegeName(){
        return collegeName;
    }

    public static void main(String[] args) {
        // Making object of Encapsulation
        Encapsulation encap = new Encapsulation();
        encap.setStudentName("Ammar Kafle");
        encap.setStudentAge(21);
        encap.setCollegeName("Crimson College of Technology");

        System.out.println(encap.getStudentName());
        System.out.println(encap.getStudentAge());
        System.out.println(encap.getCollegeName());
    }
}
