package MyLearnedTopics.Java.MLT_08_Oops.StaticAndInstanceMethod;


public class StaticAndInstanceMethod {

    // Static method
    static void bankName() {
        System.out.println("Bank Name: ABC Bank");
    }

    // Instance method
    void accountDetails() {
        System.out.println("Account Holder: Ammar");
        System.out.println("Account Balance: Rs. 50,000");
    }

    public static void main(String[] args) {

        // Calling static method
        // No object is required
        StaticAndInstanceMethod.bankName();

        System.out.println();

        // Creating an object
        StaticAndInstanceMethod bank = new StaticAndInstanceMethod();

        // Calling instance method using object
        bank.accountDetails();
    }
}