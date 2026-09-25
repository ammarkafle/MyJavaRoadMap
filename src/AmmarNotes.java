import java.util.Scanner;

public class AmmarNotes {
    public static void main(String[] args) {

        // Java Fundamentals

        /*
        1) JDK (Java Development Kit) = JDK is a set of tools used to create, compile, and run Java programs.
        Eg : Think of JDK like a kitchen for cooking Java programs:
             java programs (.java) -> JDK compiles (javac) -> byte code (.class)



        2) JVM (Java Virtual Machine) = JVM is the part of Java that runs your Java program.
        Eg : If JDK is the kitchen where you prepare the java programs, then JVM is the machine that actually processes the java programs.
             java programs (.java) -> JDK compiles (javac) -> byte code (.class) -> JVM run byte code -> execute code



        3) JRE (Java Runtime Environment) = JRE is the software environment that provides everything needed to run a Java program, but not to develop/compile it.
        Eg : IntelliJ = Write java code  (.java) -> JDK = convert into byte code (.class) -> JRE = provides necessary parts to run java programs -> JVM = runs byte code -> execute code



        4) JAVA Syntax
        public class Main{
        public static void main(String[] args) {
         System.out.println("Hello World!");
            }
        }
        Meaning and Function of each syntax
        public = It means accessible from anywhere
        class  = It means it is the class
        Main   = It means it is the main class
        {}     = It means the main method will run inside of Main class that is main

        public class Main{} -> It means the main class is access from other classes

        public = It means accessible from anywhere
        static = It means the method belongs to the class itself, it does not need object of the class to call it
        void   = It means the method does not return a value
        main   = It means the name of the method or function
        String = It means text
        []     = It means array
        args   = It means variable name that can hold multiple values
        {}     = It means the code will written inside of it in main method

        public static void main(String[] args){} -> It means the main method or function where the JVM starts executing a java programs

        System         = It means it is a java class from java.lang packages
        out            = It means the standard output it gives in console or terminal
        println        = It means print the line
        ()             = It means somethings like text (String, char) or number(int,float,double,short,long,byte) will written inside of small bracket
        "Hello World!" = It means string literal
        ;              = It means mark the end of the java statements

        System.out.println("Hello World!"); -> It means print Hello World! on the console and move to the next line
        */



        /*
        5) Comments = It is a note or heading to written in code to explain what is done and what it is, but the java ignores when executing the programs
           Types of comments
        i) Single line comment -> Eg : // My name is Ammar Kafle
                                       // I am from Butwal Sub-Metropolitan City
                                       // I am a permanent resident of Butwal

        ii) Multi line comment -> Eg : /*
                                        My name is Ammar Kafle
                                        I am from Butwal Sub-Metropolitan City
                                        I am a permanent resident of Butwal
                                       */



        /*
        6) Variables = It is a container or box where the value are stored. The value can be String, integer, float, double, boolean, long, short, byte, char
        Eg : String studentName = "Ammar Kafle"; -> studentName is the variable of datatype String
             int customerId     = 011;           -> customerId is the variable of datatype integer
        */



        /*
        7) Naming Convention
           Types of Naming Convention
        i)   Variables          -> camelCase  -> Eg : studentName, customerFatherName, patientPermanentAddress
        ii)  Function or Method -> camelCase  -> Eg : eligibleForVote(), sumOfTwoNumber(), countNumberOfStudent()
        iii) Class              -> PascalCase -> Eg : Main{}, AmmarNotes{}, StudentDetails{}
        iv)  Constructor        -> PascalCase -> Eg : Main(), AmmarNotes(), StudentDetails()
        v)   Interface          -> PascalCase -> Eg : Dog{}, Car{}, Mobile{}
        */



        /*
        8) DataTypes = It means what kind of value a variable can store, such as an integer, decimal, character, or text.
           Types of DataType
        */
        int     workerId        = 12;            // used for normal integer
        double  priceOfLaptop   = 899.98;        // used for small precise decimal number
        float   priceOfComputer = 9934.0894F;    // used for long decimal number
        boolean existComputer   = true;          // used for either true or false
        char    c               = 'A';           // used for single character
        String  collegeName     = "CCT College"; // used for text

        long    phoneNumber     = 98239843984L;  // used for large integer
        short   birthYear       = 12333;         // used for as integer
        byte    dateOfBirth     = 92;            // used for small integer


        /*
        9) Input = It means different methods to take input from the user.
        Types of Taking Input from user
        */
        // i)  Direct Assigned Input
        int currentYear = 2083;
        // ii) Taking input from user
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Book Name : ");
        String bookName = sc.nextLine();

        System.out.print("Enter the Book Price : ");
        int bookPrice = sc.nextInt();

        sc.close();
        /*
        Meaning and Function of each syntax
        import              ->   Brings a class/package into your program so you can use it
        java.util.Scanner   ->   Specifies the `Scanner` class from Java's utility library
        Scanner             ->   A class used to take input from the user
        sc                  ->   The variable name/reference used to access the Scanner object
        =                   ->   Assigns the value on the right to the variable on the left
        new                 ->   Creates a new object in memory
        Scanner(System.in)  ->   Creates a Scanner that takes input from terminal by the keyboard
        System              ->   Java class that provides system-related features
        in                  ->   Standard input stream, normally connected to the keyboard
        String              ->   Data type used to store text
        bookName            ->   Variable that stores the book's name
        sc.nextLine()       ->   Reads a complete line of text from the user
        int                 ->   Data type used to store whole numbers
        bookPrice           ->   Variable that stores the book's price as an integer
        sc.nextInt()        ->   Reads an integer from the user
        ;                   ->   Marks the end of a Java statement
        sc.close();         ->   Close Scanner to take input from terminal or console when finished

        Scanner sc        = new Scanner(System.in); -> creates a Scanner object to take input from the keyboard
        String  bookName  = sc.nextLine();          -> take text input and stores it in bookName
        int     bookPrice = sc.nextINt();           -> take integer input and stores it in bookPrice
        sc.close();                                 -> closing the scanner to take input from console or terminal when finished
        */


        // 10) Output = It means different method to display the result from the code
        // i)  horizontal space or line break
        System.out.println("");
        System.out.println("");
        // ii) println method output --------> This is the default method to use in java for output
        System.out.println("I am a Computer");
        System.out.println("Hello I am a Robot");
        System.out.println("GoodMorning user");

        System.out.println("");
        System.out.println("");
        // iii) print method output
        System.out.print("I am a Computer");
        System.out.print("Hello I am a Robot");
        System.out.print("GoodMorning user");

        System.out.println("");
        System.out.println("");
        // iv) printf method output
        String userName = "Ammar";
        int    userAge     = 20;
        // before use of %n and \t
        System.out.printf("User Name : %s", userName);
        System.out.printf("User Age  : %d", userAge);

        System.out.println("");
        // after use of %n and \t
        System.out.printf("User Name : %s%n", userName);                         // %n -> It means new line
        System.out.printf("User Age  : %d%n", userAge);                          // %n -> It means new line
        System.out.printf("User Age  : %d\tUser Name : %s", userAge, userName);  // \t -> It means adding horizontal space





    }
}
