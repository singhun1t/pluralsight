package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Person firstPerson = new Person("Manvir","Singh",26);
        Person secondPerson = new Person("John","Dee");
        Person thirdPerson = new Person("Jane", 43);
        Person fourthPerson;
        fourthPerson = new Person("Ray ","Ramona");

        //how we can use the empty constructor Person()
        Person fifthPerson = new Person();
        fifthPerson.setFirstName("John");
        fifthPerson.setLastName("Doe");
        fifthPerson.setAge(31);

        System.out.println(firstPerson);
        System.out.println(secondPerson);
        System.out.println(thirdPerson);

        //System.out.println(firstPerson.getFirstName() + " " + firstPerson.getLastName());
        // can replace this by using getFullName() method (derive getter)
        System.out.println(firstPerson.getFullName());
        System.out.println(secondPerson.getFullName());

       // System.out.println(firstPerson.firstName);
    }
}
