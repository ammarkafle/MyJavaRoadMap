package MyLearnedTopics.Java.MLT_08_Oops.Class;

public class CarClass {
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    public void describeCar(){
        System.out.println(doors + "-Door" +
                color + "-Color" +
                make + "-Make" +
                model + "-Model" +
                (convertible?"Convertible":"Not Convertible"));
    }
}
