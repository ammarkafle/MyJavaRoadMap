package MyLearnedTopics.Java.MLT_02_PublicAndPrivateAndProtectedMethod;

public class PrivateNonStaticMethod {
    // Creating Private Non-Static Function or Method
    private void privateNonStaticMethod(){
        System.out.println("This is private non-static method.");
    }
    public static void main(String[] args) {
// Creating Object For Private Non-Static Method
        PrivateNonStaticMethod obj = new PrivateNonStaticMethod();
        obj.privateNonStaticMethod();
    }
}
