package com.pluralsight;

public class Car extends Vehicle{
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    protected int numberOfDoors;

    public void openTrunk(){
        System.out.println("opening trunk");
    }
    public void closeTrunk(){
        System.out.println("trunk closed");
    }

}
