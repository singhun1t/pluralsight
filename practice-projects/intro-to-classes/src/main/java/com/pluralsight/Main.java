package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        String name = "Ryamond";
        int age = 55;
        //use object when referencing other classes
      // Person person1 = new Person("Raymond", 55); //input parameters (person.java)
        // can instead create variables within this class and then pass as parameters
        Person person1 = new Person(name, age);

        //can not do this because private variables can't be referenced
       // System.out.println(person1.name);
      //  System.out.println(person1.getName());
      //  System.out.println(person1.getAge()); //getters
        // so we set up a getter in person.java to return the name
       /*
        Person p1,p2,p3; //can also declare objects in bulk like this
        p1 = new Person("Dana",63);
        p2 = new Person("Natalie",45);
        p3 = new Person("zach",43);

       */
       // person1.name = "Ray"; //can't do this b/c name is private, so use setter
       /* person1.setName("Ray");
        System.out.println(person1.getName());

        System.out.println(person1.getEnergy());
        person1.work(5);
        System.out.println(person1.getEnergy());
        person1.eat();
        System.out.println(person1.getEnergy());

        */

        Car rayCar = new Car("Black", "Dodge HellCat", 2024);
        System.out.println(rayCar.getSpeed());

        rayCar.accelerate(50);
        System.out.println(rayCar.getSpeed());

        rayCar.brake(20);
        System.out.println(rayCar.getSpeed());

        //printing out an overloaded method, one has been provided a parameter
        person1.greet();
        person1.greet("Pratik");

        Person person2 = new Person();
        person2.setAge(15);
        person2.setName("Ray");
        

    }
}
