package com.company;

public class Train {
    private String trainCategory; // type of train rail, bullet, etc
    private int capacity; //how many individuals can be transported
    private int totalMiles; //number of miles traveled

    public String getTrainCategory() {
        return trainCategory;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getTotalMiles() {
        return totalMiles;
    }

    public Train(String trainCategory, int capacity, int totalMiles){
        this.trainCategory = trainCategory;
        this.capacity = capacity;
        this.totalMiles = totalMiles;
    }
}

