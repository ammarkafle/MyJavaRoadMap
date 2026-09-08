package MyLearnedTopics.Java.MLT_08_Oops.POJOAndRECORD;

public class StudentPOJO {
    private String studentId;
    private String studentName;
    private String studentDob;
    private String studentClassList;

    public StudentPOJO(String studentId, String studentDob, String studentName, String studentClassList) {
        this.studentId = studentId;
        this.studentDob = studentDob;
        this.studentName = studentName;
        this.studentClassList = studentClassList;
    }

    @Override
    public String toString() {
        return "StudentDetail{" +
                "studentId='" + studentId + '\'' +
                ", studentName='" + studentName + '\'' +
                ", studentDob='" + studentDob + '\'' +
                ", studentClassList='" + studentClassList + '\'' +
                '}';
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentDob() {
        return studentDob;
    }

    public void setStudentDob(String studentDob) {
        this.studentDob = studentDob;
    }

    public String getStudentClassList() {
        return studentClassList;
    }

    public void setStudentClassList(String studentClassList) {
        this.studentClassList = studentClassList;
    }
}
