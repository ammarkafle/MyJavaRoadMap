package MyLearnedTopics.Java.MLT_08_Oops.Inheritance;

public class Human {
    private int numberOfHumanLeg;
    private int numberOfHumanHand;
    private int numberOfHumanEye;
    private int numberOfHumanEar;
    private int numberOfHumanNose;
    private int numberOfHumanMouth;

    public Human(){

    }

    public Human(int numberOfHumanLeg, int numberOfHumanHand, int numberOfHumanEye, int numberOfHumanEar, int numberOfHumanNose, int numberOfHumanMouth) {
        this.numberOfHumanLeg = numberOfHumanLeg;
        this.numberOfHumanHand = numberOfHumanHand;
        this.numberOfHumanEye = numberOfHumanEye;
        this.numberOfHumanEar = numberOfHumanEar;
        this.numberOfHumanNose = numberOfHumanNose;
        this.numberOfHumanMouth = numberOfHumanMouth;
    }

    public void humanProperty(){

        System.out.println("Number of Human Leg : " + getNumberOfHumanLeg());
        System.out.println("Number of Human Hand : " + getNumberOfHumanHand());
        System.out.println("Number of Human Eye : " + getNumberOfHumanEye());
        System.out.println("Number of Human Ear : " + getNumberOfHumanEar());
        System.out.println("Number of Human Nose : " + getNumberOfHumanNose());
        System.out.println("Number of Human Mouth : " + getNumberOfHumanMouth());
        System.out.println("");

    }

    public int getNumberOfHumanLeg() {
        return numberOfHumanLeg;
    }

    public int getNumberOfHumanHand() {
        return numberOfHumanHand;
    }

    public int getNumberOfHumanEye() {
        return numberOfHumanEye;
    }

    public int getNumberOfHumanEar() {
        return numberOfHumanEar;
    }

    public int getNumberOfHumanNose() {
        return numberOfHumanNose;
    }

    public int getNumberOfHumanMouth() {
        return numberOfHumanMouth;
    }

}
