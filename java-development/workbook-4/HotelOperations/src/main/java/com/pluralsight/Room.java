package com.pluralsight;

public class Room {
    private int NumberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;


    public Room(int numberOfBeds, double price) {
        NumberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return NumberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }
}
