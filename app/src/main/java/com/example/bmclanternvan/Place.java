package com.example.bmclanternvan;

import java.util.HashMap;
import java.util.Map;

public class Place {
    private String name;
    private double[] coordinates = new double[2];

    Place(String name, double[] coordinates) {
        this.name = name;
        this.coordinates = coordinates;
    } // Place()

    public double getLatitude() { return coordinates[0]; } // getLatitude()
    public double getLongitude() { return coordinates[1]; } // getLongitude()
    public String getName() { return name; } // getName()
} // Place