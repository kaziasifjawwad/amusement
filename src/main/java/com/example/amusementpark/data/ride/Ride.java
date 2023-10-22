package com.example.amusementpark.data.ride;

import com.example.amusementpark.database.RideDataBase;

import java.util.UUID;

public class Ride {
    private UUID rideId;
    private String name;

    private RideType rideType;
    private String description;

    public Ride(){
        this.rideId = UUID.randomUUID();
    }

    public RideType getRideType() {
        return rideType;
    }

    public void setRideType(RideType rideType) {
        this.rideType = rideType;
    }


    public UUID getRideId() {
        return rideId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
