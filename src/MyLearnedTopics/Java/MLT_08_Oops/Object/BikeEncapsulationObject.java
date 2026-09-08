package MyLearnedTopics.Java.MLT_08_Oops.Object;

import MyLearnedTopics.Java.MLT_08_Oops.Encapsulation.BikeEncapsulation;
import MyLearnedTopics.Java.MLT_08_Oops.Encapsulation.Getter.BikeGetter;
import MyLearnedTopics.Java.MLT_08_Oops.Encapsulation.Setter.BikeSetter;

public class BikeEncapsulationObject {

    public static void main(String[] args) {

        // Create encapsulation object
        BikeEncapsulation bike = new BikeEncapsulation();

        // Create Setter object
        BikeSetter setter = new BikeSetter();

        // Set bike information
        setter.setBikeDetails(bike);

        // Create Getter object
        BikeGetter getter = new BikeGetter();

        // Get bike information
        getter.getBikeDetails(bike);
    }
}
