package com.pluralsight;

public class Animal {
    private String name;

    public Animal() {
        System.out.println("We are in the animal constructor");
    }

    public Animal(String name) {
        System.out.println("We are in the animal constructor with name");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
