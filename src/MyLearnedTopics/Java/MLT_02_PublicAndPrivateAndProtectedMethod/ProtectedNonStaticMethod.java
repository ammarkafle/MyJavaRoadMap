package MyLearnedTopics.Java.MLT_02_PublicAndPrivateAndProtectedMethod;

public class ProtectedNonStaticMethod {

    protected String name = "Ammar Kafle";

    public String getName() {
        return name;
    }

    // Creating Protected Non-Static Function or Method
    private void protectedNonStaticMethod(){
        System.out.println("This is private non-static method.");
        System.out.println("My name is : " + getName());
    }
    public static void main(String[] args) {
// Creating Object For Protected Non-Static Method
        ProtectedNonStaticMethod obj = new ProtectedNonStaticMethod();
        obj.protectedNonStaticMethod();
    }
}

