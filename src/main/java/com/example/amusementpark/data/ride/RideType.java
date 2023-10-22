package com.example.amusementpark.data.ride;

public enum RideType {
    WATER("water"),
    AIR("air"),
    LAND("land");

    private final String type;

    RideType(String type) {
        this.type = type;
    }
}
