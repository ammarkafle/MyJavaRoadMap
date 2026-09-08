package MyLearnedTopics.Java.MLT_08_Oops.Encapsulation;

public class BikeEncapsulation {
    private String bikeName;
    private String bikeModel;
    private int bikeCc;
    private boolean bikeAvailable;

    // Getter methods
    public String getBikeName() {
        return bikeName;
    }

    public String getBikeModel() {
        return bikeModel;
    }

    public int getBikeCc() {
        return bikeCc;
    }

    public boolean isBikeAvailable() {
        return bikeAvailable;
    }

    // Setter methods
    public void setBikeName(String bikeName) {
        this.bikeName = bikeName;
    }

    public void setBikeModel(String bikeModel) {
        this.bikeModel = bikeModel;
    }

    public void setBikeCc(int bikeCc) {
        this.bikeCc = bikeCc;
    }

    public void setBikeAvailable(boolean bikeAvailable) {
        this.bikeAvailable = bikeAvailable;
    }
}
