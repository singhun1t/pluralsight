package com.pluralsight.classes;

import com.pluralsight.interfaces.ICleaner;
import com.pluralsight.interfaces.IMovable;

import java.awt.*;

public class RobotVacuum implements IMovable, ICleaner {
    private Point currentLocation;
    private int power;

    public RobotVacuum(String name) {
     //   this.currentLocation = currentLocation;
      //  this.power = power;
       name = " ";
    }

    public Point getCurrentLocation() {
        return currentLocation;
    }

    public void setCurrentLocation(Point currentLocation) {
        this.currentLocation = currentLocation;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public void clean() {
        System.out.println("The robot vacuum is cleaning.");
    }

    @Override
    public Point move(int xUnits, int yUnits) {
        int biggestUnit = Math.max(xUnits,yUnits);
        if(power >= biggestUnit){
            currentLocation = new Point (currentLocation.x + xUnits, currentLocation.y+ yUnits);
            power -= biggestUnit;
        }
        else{
            System.out.println("Not enough power to move");
        }
        return currentLocation;
    }

    @Override
    public void goHome() {
        this.currentLocation = new Point(0,0);
        System.out.println("The robot vaccum has returned home");
    }
}
