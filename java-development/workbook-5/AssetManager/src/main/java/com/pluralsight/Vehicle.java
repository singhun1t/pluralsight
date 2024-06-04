package com.pluralsight;

import java.time.LocalDate;
import java.time.Year;

public class Vehicle extends Asset{
    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
    @Override
    public double getValue(){
        int currentYear = Year.now().getValue();
        int ageYears = currentYear - year;
        double reduceRate = 0.03;

        if(ageYears >=4 && ageYears <=6){
            reduceRate =0.06;
        }
        else if(ageYears >=7 && ageYears <=10){
            reduceRate = 0.08;
        }else if(ageYears > 10){
            return 1000.0;
        }
        double value = getOriginalCost() * (1 - (reduceRate *ageYears));

        if(odometer > 100000 && !(makeModel.equalsIgnoreCase("Honda") || makeModel.equalsIgnoreCase("Toyota"))){
            value *= 0.75;
        }
        return value;
    }




}
