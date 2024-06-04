package com.pluralsight;

public class Caveman extends Human{
    private int strength;
    private String skills;

    public Caveman(String name, int age, int strength, String skills) {
        super(name, age);
        this.strength = strength;
        this.skills = skills;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public void eat(){
        System.out.println("Me hunt, me am hungry");
    }
}
