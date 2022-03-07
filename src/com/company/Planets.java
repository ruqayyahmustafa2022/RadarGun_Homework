package com.company;
import java.util.*;

public class Planets {
    //this is a superclass of Planets
    private String planetName;
    private double distanceFromSun;
    private List<String> allPlanets;

    public String getPlanetName() {
        return planetName;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public List<String> getAllPlanets() {
        return allPlanets;
    }

    public Planets(String planetName, double distanceFromSun, List<String> allPlanets){
        this.planetName = planetName;
        this.distanceFromSun = distanceFromSun;
        this.allPlanets = allPlanets;
    }
}//end class Planets
