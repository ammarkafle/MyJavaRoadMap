package MyLearnedTopics.Java.MLT_08_Oops.Constructor.ConstructorOverloading;

public class ConstructorOverloading {
    private String name;
    private String address;
    private int age;

    // Constructor First
    public ConstructorOverloading(){
        name = "Ammar Kafle";
        address = "Butwal";
        age = 21;
    }

    // Constructor Second
    public ConstructorOverloading(String name){
        this.name = name;
        this.address="Tilottama";
        this.age=25;
    }

    // Constructor Third
    public ConstructorOverloading(String name, String address, int age){
        this.name=name;
        this.address=address;
        this.age=age;
    }

    public static void main(String[] args) {
        // Constructor First Object Created
        ConstructorOverloading detail1= new ConstructorOverloading();
        // Constructure Second Object Created
        ConstructorOverloading detail2= new ConstructorOverloading("Aman Kafle");
        // Constructor Third Object Created
        ConstructorOverloading detail3 = new ConstructorOverloading("Amrita Kafle","Rudrapur",30);

        // Constructure First Is Called
        System.out.println(" First Constructor is Called.");
        System.out.println(detail1.name);
        System.out.println(detail1.address);
        System.out.println(detail1.age);

        // Constructure Second Is Called
        System.out.println(" Second Constructor is Called.");
        System.out.println(detail2.name);
        System.out.println(detail2.address);
        System.out.println(detail2.age);

        // Constructor Third Is Called
        System.out.println(" Third Constructor is Called.");
        System.out.println(detail3.name);
        System.out.println(detail3.address);
        System.out.println(detail3.age);
    }
}
