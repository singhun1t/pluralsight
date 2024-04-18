package com.pluralsight;

import java.util.Arrays;

public class CopyingArray {
    public static void main(String[] args) {
        String[] colors = {"red", "white","blue"};
        //create empty array
        String[] copy = new String[3];

        System.out.println(Arrays.toString(colors));
        //prints out array to visibly see array with {}, exactly how its shown above
        System.out.println(Arrays.toString(copy));
       // copy = colors; does not actually make a copy of colors, but references same array
        //to copy elements to a different array do a for loop
        /*
        for (int i = 0; i <colors.length ; i++) {
            copy[i] = colors[i];
        } */
        //copy array simple. requires the array name, starting, position, destination,starting of destination
        //figure out whats wrong later maybe
        System.arraycopy(colors,0,copy,0);

        System.out.println("===============");
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(copy));//not an actual copy, references the same array
        System.out.println("===============");
        //change white to black in array
        colors[1] = "black";//only changed in both, because copy is referencing the same array
        //changed to a for loop and now shows 2 different arrays
        System.out.println(Arrays.toString(colors));
        System.out.println(Arrays.toString(copy));





    }
}
