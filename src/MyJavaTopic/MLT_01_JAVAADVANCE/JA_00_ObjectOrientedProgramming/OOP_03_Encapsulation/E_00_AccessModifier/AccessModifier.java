package MyJavaTopic.MLT_01_JAVAADVANCE.JA_00_ObjectOrientedProgramming.OOP_03_Encapsulation.E_00_AccessModifier;

// Parent Class
public class AccessModifier {
    // PUBLIC: Can be accessed from anywhere
    public String bankName = "ABC Bank";

    // PRIVATE: Can be accessed only inside this class
    private double balance = 50000;

    // PROTECTED: Can be accessed in the same package
    // and by child classes in another package
    protected String accountType = "Savings";

    // DEFAULT: Can be accessed only inside the same package
    String branchName = "Kathmandu Branch";


    // PUBLIC method: Can be called from anywhere
    public void showBankName() {
        System.out.println("Bank Name: " + bankName);
    }

    // PUBLIC method used to safely access private balance
    public void showBalance() {
        System.out.println("Balance: Rs. " + balance);
    }

    // PRIVATE method: Can be called only inside this class
    private void calculateInterest() {
        System.out.println("Interest is being calculated...");
    }

    // Method inside the same class can access private members
    public void bankDetails() {

        System.out.println("Bank: " + bankName);
        System.out.println("Balance: Rs. " + balance);
        System.out.println("Account Type: " + accountType);
        System.out.println("Branch: " + branchName);

        calculateInterest();
    }
}
