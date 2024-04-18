package com.pluralsight;

public class Person {
    //these are attributes
    private String name;
    private int age;
    private int energy;

    public Person(int age) {
        this.age = age;
    }

    public Person(String name) {
        this.name = name;
    }

    public Person() {//overloaded constructor, is different from Person down below

    }

    //this is the constructor
    public Person(String name, int age){ //Person_String_int is the signature
        //this.name refers to the name outside, =name is name inside the parameter
        this.name = name;
        this.age = age;
        this.energy = 100;
    }

    //setting getter
    public String getName(){
        return this.name;
    }

    //make sure to match variable type (int) in getter
    public int getAge(){
        return this.age;
    }

    //setting up setter, void b/c doesn't return anything
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getEnergy() {
        return energy;
    }

    public void work(int hours){
        this.energy -= (hours *10); //this.energy = this.energy - (hours *10)';
    }
    public void sleep(int hours){
        this.energy += (hours*10); //this.energy = this.energy + (hours *10)';
    }
    public void eat(){
        this.energy += 20; //this.energy = this.energy +20;
    }
    //example of overloading below, 2 methods, same name, different signatures. Use parameters to differentiate
    public void greet(){
        System.out.println("Hello There");
    }
    public void greet(String name){
        System.out.println("Hello" + name);
    }
}
