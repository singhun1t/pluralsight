package com.pluralsight;

public class Main {
    public static void main(String[] args) {
      /*  String name = "Manvir";
        name = name + "Singh";
        System.out.println(name);

        StringBuilder potatoBuilder = new StringBuilder();

        potatoBuilder.append("Manvir \n");
        potatoBuilder.append("Singh");

       */
        StringBuilder skills = new StringBuilder();
        skills.append("Git ");
        skills.append("HTMl ");

        String mySkills = skills.toString();
        System.out.println(mySkills);

    }
}
