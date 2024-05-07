package com.pluralsight;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private boolean isEmployed;

    public boolean isEmployed() {
        return isEmployed;
    }

    public void setEmployed(boolean employed) {
        isEmployed = employed;
    }

    public Person(){

    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Person(String firstName, int age) {
        this.firstName = firstName;
        this.age = age;
    }
    public String getFullName(){
        return firstName + " " + lastName;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "The person information:" +
                "firstName is:'" + firstName + '\'' +
                ", lastName is: '" + lastName + '\'' +
                ", and age is:" + age ;
    }
}
