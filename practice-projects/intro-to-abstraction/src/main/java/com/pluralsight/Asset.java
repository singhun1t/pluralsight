package com.pluralsight;

public abstract class Asset {
    protected String description;
    protected int yearAcquired;
    protected double originalCost;

    public Asset(String description, int yearAcquired, double originalCost) {
        this.description = description;
        this.yearAcquired = yearAcquired;
        this.originalCost = originalCost;
    }

    public String getDescription() {
        return description;
    }


    public int getYearAcquired() {
        return yearAcquired;
    }

    //abstract method
    public abstract double getValue() ;

    //abstract method does not contain any code. purpose is to force the children to override a specific method


}
