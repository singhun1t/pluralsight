package com.pluralsight;



public class Car {
    //static variable, shared by all methods within class
    private static String name = "Manvir";

    public static void main(String[] args) {
        System.out.println(name);
    }

    //static method, not global but accessible from different classes w/o need to creat object
    public static void printMessage(){
        System.out.println(name);
    }

}
