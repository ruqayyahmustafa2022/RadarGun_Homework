package com.company;

public class Transportation{

    //this is a superclass of Train
    String medium; //this is the mode: air, land, sea
    double averageCost; //average cost of the vehicle
    int maxDistance; //how far can this transport mode go in it's lifetime .... 12yrs for a car, 75,0000 pressurisation cycles; 4.8M


    // miles for train


    public String getMedium() {
        return medium;
    }

    public double getAverageCost() {
        return averageCost;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public Transportation(String medium, double averageCost, int maxDistance)
    {
        this.medium = medium;
        this.averageCost = averageCost;
        this.maxDistance = maxDistance;
    }
}
