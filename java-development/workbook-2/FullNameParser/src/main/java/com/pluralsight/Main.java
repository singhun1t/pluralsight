package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner nameScanner = new Scanner(System.in);

       System.out.print("Please enter your full name with spaces: ");
        String fullName = nameScanner.nextLine().trim();

        String firstName = " ";
        String middleName = " ";
        String lastName = " ";
        int firstSpaceIndex = fullName.indexOf(' ');
        firstName = fullName.substring(0, firstSpaceIndex);

        fullName =  fullName.substring(firstSpaceIndex).trim();

        int lastSpaceIndex = fullName.indexOf(' ');

        if (lastSpaceIndex == -1){
            lastName = fullName;
        }else{
            middleName = fullName.substring(0, lastSpaceIndex);
            lastName = fullName.substring(lastSpaceIndex +1);
        }
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + (middleName.isEmpty() ? "(none)" : middleName));
        System.out.println("Last name: " + lastName);

        }
        /*String firstName = fullName.substring(0,fullName.indexOf(' '));
        int firstNameIndex = fullName.indexOf(' ');

        int lastNameIndex = fullName.indexOf(' ');

        String middleName;
        if(firstNameIndex != lastNameIndex){
            middleName = fullName.substring(firstNameIndex +1, lastNameIndex);
            middleName = middleName.charAt(0);
        }
        else{
            middleName = "none";
        }
        String lastName = fullName.substring(lastNameIndex +1);

        */



    }

