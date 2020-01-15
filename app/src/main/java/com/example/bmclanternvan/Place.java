package com.example.bmclanternvan;

import java.util.HashMap;
import java.util.Map;

public class Place {
    String name;
    Map<Double, Double> coordinates;

    Place(String name, Map<Double, Double> coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    } // Place()

    public Map<Double, Double> getCoordinates() {
        return coordinates;
    } // getCoordinates()

    public String getName() {
        return name;
    } // getName()
} // Place