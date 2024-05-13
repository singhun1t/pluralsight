package com.pluralsight;

public class Hovercraft extends Vehicle{
    public int getAirCushionPressure() {
        return airCushionPressure;
    }

    public void setAirCushionPressure(int airCushionPressure) {
        this.airCushionPressure = airCushionPressure;
    }

    protected int airCushionPressure;

    public void hover(){
        System.out.println("hovering");
    }
}
