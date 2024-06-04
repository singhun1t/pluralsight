package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Manvir",27);
    //    human.eat();
     //  feed("human",human);
        System.out.println("-------------------------");

        Caveman caveman = new Caveman("John",45,50,"Hunting");
     //   caveman.eat();
      //  feed("Caveman",caveman);
        System.out.println("-------------------------");

        ModernPerson modernPerson = new ModernPerson("Paul", 67,15,18);
      //  modernPerson.eat();

        System.out.println("-------------------------");
        /*
        Human human1;
        human1 = new Human("Raymond",35);
        human1 = new ModernPerson("Manvir",27, 2,80);
        human1 = new Caveman("Unga",100,50,"Fishing");

         */
        
        ArrayList<Human> people = new ArrayList<>();
        people.add(human);
        people.add(caveman);
        people.add(modernPerson);

        //instance of the check the type of object
        for (Human person : people) {

            if(person instanceof Caveman){
                System.out.println("This is a caveman--->");
            }
            if(person instanceof ModernPerson){
                System.out.println("This is a modern Person--->");
            }else if(person instanceof Human){
                System.out.println("This is a human --->");
            }
        }
        System.out.println("-----------------------------------------------------------");
        for (Human person : people) {
            System.out.println(person.getClass().getSimpleName());
        }

        /*for (Human person : people) {
            person.eat();
        }

         */
        //go throught he array list and apply eat method to eat


    }
    public static void feed(String label, Human human){
        System.out.println(label + "--->");
        human.eat();
    }
}
