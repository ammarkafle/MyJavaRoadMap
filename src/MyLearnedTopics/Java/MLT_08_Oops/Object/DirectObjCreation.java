package MyLearnedTopics.Java.MLT_08_Oops.Object;

public class DirectObjCreation {

    public static class Student{
        private String fullName;
        private int  Age;
        private String Address;

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }

        public int getAge() {
            return Age;
        }

        public void setAge(int age) {
            Age = age;
        }

        public String getAddress() {
            return Address;
        }

        public void setAddress(String address) {
            Address = address;
        }
    }

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.setFullName("Ammar Kafle");
        s1.setAddress("Butwal - 11 , Rupandehi");
        s1.setAge(21);

       String Name = s1.getFullName();
       String Address = s1.getAddress();
       Integer Age = s1.getAge();

        System.out.println("Name : " + Name + "\n"+ "Address : " + Address +"\n" + "Age : " + Age +"\n");
    }
}
