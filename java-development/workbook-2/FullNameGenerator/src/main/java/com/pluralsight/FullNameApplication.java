package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);
        System.out.println("Enter your name:");

        System.out.print("Enter first Name:");
        String firstName = nameScanner.nextLine().trim();

        System.out.print("Enter last Name:");
        String lastName = nameScanner.nextLine().trim();

        System.out.print("Enter middle name if applicable:");
        String middleName = nameScanner.nextLine().trim();

        System.out.print("Enter suffix if applicable:");
        String suffix = nameScanner.nextLine().trim();

        String fullName = firstName;
        //messed up practice here
        /*if (!middleName.isEmpty()){
            fullName += " " + middleName + " " + lastName;

        }if (!suffix.isEmpty()){
            fullName += " "+ lastName + ", " + suffix;
        }
        if(middleName.isEmpty()){
            fullName = firstName + " " + lastName;
        }
        if(suffix.isEmpty()){
            fullName = firstName + " " + lastName;
        }
        System.out.println(fullName);

         */
        if (!middleName.isEmpty()){
            fullName += " " + middleName;
        }
        fullName += " " + lastName;
        if(!suffix.isEmpty()){
            fullName += ", " + suffix;
        }
        System.out.println("\nFull name: " + fullName);
    }
}
