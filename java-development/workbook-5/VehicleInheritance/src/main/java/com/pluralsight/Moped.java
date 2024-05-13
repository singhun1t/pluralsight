package com.pluralsight;

public class Moped extends Vehicle {
    public int getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    protected int maxWeight;

    public void ride(){
        System.out.println("riding");
    }

}
