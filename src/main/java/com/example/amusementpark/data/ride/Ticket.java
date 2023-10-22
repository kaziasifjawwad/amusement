package com.example.amusementpark.data.ride;


import java.util.UUID;

public class Ticket {
    private UUID ticketId;
    private double price;
    private Ride ride;

    public Ticket(){
        this.ticketId = UUID.randomUUID();
    }

    public UUID getTicketId() {
        return ticketId;
    }

    public void setTicketId(UUID ticketId) {
        this.ticketId = ticketId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Ride getRide() {
        return ride;
    }

    public void setRide(Ride ride) {
        this.ride = ride;
    }


}
