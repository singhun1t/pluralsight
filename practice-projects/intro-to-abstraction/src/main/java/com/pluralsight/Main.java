package com.pluralsight;

public class Main {
    public static void main(String[] args) {
      //  Asset asset = new Asset ("Potato",2024,10);
       // System.out.println(asset.getDescription());
        //if you have an abstract class, you can't create an object from it

        House myHouse = new House("Ranch House",2018,435000,"410 Lexie Way",4200,6000);

        System.out.println(myHouse.getAddress());

        System.out.println( myHouse.getValue());


    }
}
