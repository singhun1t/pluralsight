package com.pluralsight;

public class Dog extends Animal{
    private String breed;

    public Dog(String name, String breed) {
        super(name); //calling constructor of the parent class, has to be first line of
        System.out.println("We are in the dog constructor with name");
        this.breed = breed;
    }

    public Dog(){
        System.out.println("we are in the empty dog constructor");
    }




    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark(){
        System.out.println(getName() + "goes Ruff Ruff");
    }

}
