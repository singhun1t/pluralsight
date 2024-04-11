package com.pluralsight;

import java.sql.SQLOutput;

public class MathApp {
    public static void main(String[] args) {
        //find the highest salary between two people
        int bobSalary=1283;
        int garySalary=1873;
        int highestSalary= Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is " + highestSalary);

        //find the lowest vehicle price and display it
        double carPrice = 18234.98;
        double truckPrice = 78923.78;
        double lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("Lowest cost of vehicles is "+lowestPrice);

        //find and display area of circle
        double circleRadius = 7.25;
        double circleArea = Math.PI * Math.pow(circleRadius, 2);
        System.out.println("Area of circle is " + circleArea);

        //find and display sqrt of 5.0
        double randomNumber = 5.0;
        double sqrdRoot= Math.sqrt(randomNumber);
        System.out.println("The square root of 5.0 is " +sqrdRoot);

        //find distance between 2 points
        int x1 = 5, y1 = 10, x2 = 85, y2 = 50;
        double distance = Math.sqrt(Math.pow(x2-x1,2)+ Math.pow(y2-y1,2));
        System.out.println("The distance between the 2 points is " + distance);
        //find abs value of -3.8
        double num2 = -3.8;
        double num2Absolute = Math.abs(num2);
        System.out.println("the absolute value of " + num2 + " is " + num2Absolute);

        //generate random number between 0 and 1
        double randomNum = Math.random();
        System.out.println("The random number is "+randomNum);

    }
}
