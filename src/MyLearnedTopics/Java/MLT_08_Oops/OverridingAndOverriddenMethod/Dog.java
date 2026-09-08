package MyLearnedTopics.Java.MLT_08_Oops.OverridingAndOverriddenMethod;

public class Dog extends Animal{

    @Override
    public void badHabit(){
        System.out.println("This is Override Method.");
        System.out.println("Dog bites dog.");
    }


    public static void main(String[] args) {
        //This is Animal Object
       Animal animal = new Animal();
       //Overridden Method = Original Method of Parent
       animal.badHabit();

       //This is Line Break
        System.out.println(" ");
        System.out.println(" ");

       //This is Dog Object
        Dog dog = new Dog();
        //Override Method = Updated Method of Parents OR Child Method
        dog.badHabit();

    }
}
