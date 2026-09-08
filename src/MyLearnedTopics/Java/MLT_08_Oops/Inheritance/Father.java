package MyLearnedTopics.Java.MLT_08_Oops.Inheritance;

public class Father extends Human{

    private Human human;
    private String name;
    private int age;
    private String address;
    private String phoneNumber;
    private boolean married;
    private String gender;


    public Father(Human human,String name, int age, String address, String phoneNumber, boolean married, String gender) {
        this.human = human;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.married = married;
        this.gender = gender;
    }

    public void fatherProperty(){
        System.out.println("Name : " + getName());
        System.out.println("Age : " + getAge());
        System.out.println("Address : " + getAddress());
        System.out.println("Phone : " + getPhoneNumber());
        System.out.println("Married : " + isMarried());
        System.out.println("Gender : " + getGender());
        System.out.println("");
        human.humanProperty();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public boolean isMarried() {
        return married;
    }

    public String getGender() {
        return gender;
    }
}
