package MyLearnedTopics.Java.MLT_02_PublicAndPrivateAndProtectedMethod;

public class PublicNonStaticMethod {
    // Creating Public Non-Static Function or Method
    public void publicNonStaticMethod(){
        System.out.println("This is public non-static method.");
    }
    public static void main(String[] args) {
        // Creating Obj for non-static method
        PublicNonStaticMethod obj= new PublicNonStaticMethod();
        obj.publicNonStaticMethod();
    }
}
