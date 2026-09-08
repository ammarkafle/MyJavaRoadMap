package MyLearnedTopics.Java.MLT_08_Oops.Encapsulation.Getter;

import MyLearnedTopics.Java.MLT_08_Oops.Encapsulation.BikeEncapsulation;

public class BikeGetter {
    public void getBikeDetails(BikeEncapsulation bike) {

        System.out.println("Bike Name: " + bike.getBikeName());
        System.out.println("Bike Model: " + bike.getBikeModel());
        System.out.println("Bike CC: " + bike.getBikeCc());
        System.out.println("Bike Available: " + bike.isBikeAvailable());
    }
}
