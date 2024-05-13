package com.pluralsight;

public class Car {
    //instance variables
    private String make;
    private String model;
    private int speed;

    public Main(String make, String model) {
        this.make = make;
        this.model = model;
        this.speed = 0;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    
    public void accelerate(int speedChange){
        //called an instance method, part of car class
        this.speed += speedChange;
    }
}
