package MyLearnedTopics.Java.MLT_08_Oops.Polymorphism;

public class PolymorphismOfAnimal {
    public static void main(String[] args) {

        //Polymorphism = One reference + Different objects + Different behavior

            Animal animal;

            // Animal reference → Dog object
            animal = new Dog();
            animal.sound();

            // Animal reference → Cat object
            animal = new Cat();
            animal.sound();

            // Animal reference → Animal object
            animal = new Animal();
            animal.sound();
        }
    }

