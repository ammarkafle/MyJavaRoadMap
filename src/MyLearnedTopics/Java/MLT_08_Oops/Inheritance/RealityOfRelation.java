package MyLearnedTopics.Java.MLT_08_Oops.Inheritance;

public class RealityOfRelation {

    public static void main(String[] args) {

        // Making Object For Human and Passing The Values
        Human human = new Human(2,2,2,2,1,1);
        System.out.println("This is Human Property.");
        human.humanProperty();

        //Making Object For Father and Passing The Values
        Father father = new Father(human,"Dinesh Kafle",53,"Butwal","980000000",true,"Male");
        System.out.println("This is Father Property.");
        father.fatherProperty();


        //Making Object For Mother and Passing The Values
        Mother mother = new Mother(human,"Tara Kafle",45,"Butwal","9811111111",true,"Female");
        System.out.println("This is Mother Property.");
        mother.motherProperty();


        //Making Object For Son and Passing The Values
        Son son = new Son(father,mother,"Crimson College Of Technology","DalBhat","Football",1);
        System.out.println("This is Son Property.");
        son.sonProperty();
        son.getFather().fatherProperty();
        son.getMother().motherProperty();






    }
}
