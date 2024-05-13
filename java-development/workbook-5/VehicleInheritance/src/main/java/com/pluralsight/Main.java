package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped myMoped = new Moped();
        myMoped.setColor("Blue");
        myMoped.setFuelCapacity(100);
        myMoped.setMaxWeight(1000);
        System.out.println("Moped color: " + myMoped.color);
        System.out.println("Moped max weight: " + myMoped.maxWeight);


        Car myCar = new Car();
        myCar.setColor("Green");
        myCar.setTopSpeed(160);
        myCar.setCargoCapacity(12);
        System.out.println("car cargo capacity: " + myCar.cargoCapacity);
        System.out.println("car top speed: " + myCar.topSpeed);

        SemiTruck mySemi = new SemiTruck();
        mySemi.setColor("Orange");
        mySemi.setNumberOfTrailers(1);
        mySemi.setNumberOfPassengers(3);
        System.out.println("number of trailers for semi : " + mySemi.numberOfTrailers);
        System.out.println("number of passengers in semi: " + mySemi.numberOfPassengers);

        Hovercraft myHover = new Hovercraft();
        myHover.setAirCushionPressure(123);
        myHover.setNumberOfPassengers(2);
        myHover.setFuelCapacity(32);
        System.out.println("Hovercraft air cushion pressure: " + myHover.airCushionPressure);
        System.out.println("Hovercraft number of passengers: " + myHover.numberOfPassengers);
        System.out.println("Hovercraft fuel capacity: " + myHover.fuelCapacity);

        myCar.openTrunk();
        mySemi.loadCargo();
        myHover.hover();
        myMoped.ride();
    }


}
