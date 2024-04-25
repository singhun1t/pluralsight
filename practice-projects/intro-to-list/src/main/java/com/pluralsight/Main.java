package com.pluralsight;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
      //  String[] arr = new String[5]; //Creating an array, need to define size
        ArrayList<String> kids = new ArrayList<>(); //how to create an array list of strings
        kids.add("Raymond");
        kids.add("Manvir");
        kids.add("Jake");

       // kids.set(2, "Zach"); //update an element from the array list

        kids.remove(1); //how to remove an element from an arraylist
        System.out.println("After element with index 1 is remove: ");
        for (int i = 0; i <kids.size() ; i++) {
            System.out.println((i+1) + " : " + kids.get(i) + "with index" + i);

        Collections.sort(kids);
            System.out.println();

        String secondElement = kids.get(1);
       // System.out.println(secondElement);

       /* //use kids.size() to get array length, .length will not work
        for (int i = 0; i <kids.size() ; i++) {
            System.out.println((i+1) + " : " + kids.get(i));

        */

            ArrayList<Integer> numbers =
        }
    }
}
