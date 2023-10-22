package com.example.amusementpark.database;

import com.example.amusementpark.data.ride.Ride;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;

public class RideDataBase {
    private String filePath = "database/ridedatabase.txt";
    private Map<UUID, Ride> mapOfIdToRide;

    public void addRide(Ride ride){
        this.mapOfIdToRide.put(ride.getRideId(),ride);
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public void setMapOfIdToRide(Map<UUID, Ride> mapOfIdToRide) {
        this.mapOfIdToRide = mapOfIdToRide;
    }

    public static void setRideDataBase(RideDataBase rideDataBase) {
        RideDataBase.rideDataBase = rideDataBase;
    }

    public String getFilePath() {
        return filePath;
    }

    public Map<UUID, Ride> getMapOfIdToRide() {
        return mapOfIdToRide;
    }

    public static RideDataBase getRideDataBase() {
        return rideDataBase;
    }

    private static RideDataBase rideDataBase;
    private RideDataBase(){}

    public static RideDataBase getInstance(){
        if(RideDataBase.rideDataBase == null) {
            RideDataBase.rideDataBase = new RideDataBase();
            rideDataBase.setMapOfIdToRide(new LinkedHashMap<>());
        }
        return RideDataBase.rideDataBase;
    }

    public void readDataBase(){

    }

    public void saveDatabase(){
        for(var data: rideDataBase.getMapOfIdToRide().values()){
           // this is your code scope
        }
    }
}
