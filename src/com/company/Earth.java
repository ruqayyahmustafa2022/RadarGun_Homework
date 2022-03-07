package com.company;

public class Earth {
    private double temperature;
    private double rotationSpeed;
    private int humanCapacity;

    public double getTemperature() {
        return temperature;
    }

    public double getRotationSpeed() {
        return rotationSpeed;
    }

    public int getHumanCapacity() {
        return humanCapacity;
    }

    public Earth(double temperature,double rotationSpeed, int humanCapacity){
        this.temperature = temperature;
        this.rotationSpeed = rotationSpeed;
        this.humanCapacity = humanCapacity;
    }
}
