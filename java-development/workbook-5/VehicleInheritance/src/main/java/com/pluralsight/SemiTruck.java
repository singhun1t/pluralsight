package com.pluralsight;

public class SemiTruck extends Vehicle{
    public int getNumberOfTrailers() {
        return numberOfTrailers;
    }

    public void setNumberOfTrailers(int numberOfTrailers) {
        this.numberOfTrailers = numberOfTrailers;
    }

    protected int numberOfTrailers;

    public void loadCargo(){
        System.out.println("loading cargo");
    }
    public void unloadCargo(){
        System.out.println("unloading cargo");
    }
}
