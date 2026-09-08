package MyLearnedTopics.Java.MLT_08_Oops.Inheritance;

public class Son{

    private Father father;
    private Mother mother;

    private String schoolName;
    private String favFood;
    private String favSports;
    private int numberOfFriends;

    public Son(Father father, Mother mother, String schoolName, String favFood, String favSports, int numberOfFriends) {

        this.father = father;
        this.mother = mother;
        this.schoolName = schoolName;
        this.favFood = favFood;
        this.favSports = favSports;
        this.numberOfFriends = numberOfFriends;
    }

    public void sonProperty(){
        System.out.println("School Name : " + getSchoolName());
        System.out.println("Fav Food : " + getFavFood());
        System.out.println("Fav Sports : " + getFavSports());
        System.out.println("No. Of Friends : " + getNumberOfFriends());
        System.out.println("");
    }

    public Father getFather() {
        return father;
    }

    public Mother getMother() {
        return mother;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getFavFood() {
        return favFood;
    }

    public String getFavSports() {
        return favSports;
    }

    public int getNumberOfFriends() {
        return numberOfFriends;
    }
}
