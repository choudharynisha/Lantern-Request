package com.example.bmclanternvan;

public class Ride {
    private int passengers;
    private Place pickup;
    private Place dropoff;

    Ride(int passengers, Place pickup, Place dropoff) {
        this.passengers = passengers;
        this.pickup = pickup;
        this.dropoff = dropoff;
    } // Ride()

    public Place getDropoff() { return dropoff; } // getDropoff()
    public int getPassengers() { return passengers; } // getPassengers()
    public Place getPickup() { return pickup; } // getPickup()
} // Ride