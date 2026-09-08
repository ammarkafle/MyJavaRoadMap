package MyLearnedTopics.Java.MLT_08_Oops.Constructor.ConstructorInsideConstructor;

public class ConstructorInsideConstructor {

    private String customerName;
    private String customerAddress;
    private int customerAge;


    public ConstructorInsideConstructor(){
        this("Amrita Kafle",28);
    }

    public ConstructorInsideConstructor(String customerName, int customerAge) {
        this(customerName,"Tilottama",customerAge);
    }

    public ConstructorInsideConstructor(String customerName, String customerAddress, int customerAge) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
        this.customerAge = customerAge;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCustomerAddress() {
        return customerAddress;
    }

    public int getCustomerAge() {
        return customerAge;
    }

    public static void main(String[] args) {

        ConstructorInsideConstructor customer1 = new ConstructorInsideConstructor("Ammar Kafle", "Butwal", 20);
        System.out.println(customer1.getCustomerName());
        System.out.println(customer1.getCustomerAddress());
        System.out.println(customer1.getCustomerAge());

        ConstructorInsideConstructor customer2= new ConstructorInsideConstructor();
        System.out.println(customer2.getCustomerName());
        System.out.println(customer2.getCustomerAddress());
        System.out.println(customer2.getCustomerAge());

        ConstructorInsideConstructor customer3 =new ConstructorInsideConstructor("Aman Kafle",22);
        System.out.println(customer3.getCustomerName());
        System.out.println(customer3.getCustomerAddress());
        System.out.println(customer3.getCustomerAge());
    }
}
