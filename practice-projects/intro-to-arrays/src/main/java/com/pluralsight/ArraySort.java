package com.pluralsight;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        String[] namelist ={
                "Natalie", "Brittany","Zachary", "Ezra", "Ian"
        };
        Arrays.sort(namelist);
        for(String name:namelist){
            System.out.println(name);
        }
    }
}
