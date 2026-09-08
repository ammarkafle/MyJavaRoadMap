package MyLearnedTopics.Java.MLT_02_PublicAndPrivateAndProtectedMethod;

public class ProtectedStaticMethod {

    protected static String name= "Ammar Kafle";
    // Creating Protected Static Function Method
    private static void protectedStaticMethod(){
        System.out.println("This is protected static method.");
        System.out.println("My name is : " + name);
    }
    public static void main(String[] args) {
        protectedStaticMethod();
    }
}


