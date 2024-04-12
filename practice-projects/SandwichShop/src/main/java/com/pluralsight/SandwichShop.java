package com.pluralsight;

import java.util.Scanner;

public class SandwichShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sandwich size (1 for Regular, 2 for Large): ");
        int sandwichSize = scanner.nextInt();
        double basePrice;

        if(sandwichSize == 1){
            basePrice = 5.45;
        }else if(sandwichSize ==2){
            basePrice = 8.95;
        }else{
            System.out.println("Invalid Sandwich Size");
            return;
        }

        System.out.println("Enter your age");
        int age = scanner.nextInt();
        double finalPrice= 0.0;
        if (age <= 17){
            finalPrice = basePrice * .9;
        }else if(age >=65){
            finalPrice = basePrice * .8;
        }else{
            finalPrice = basePrice;
        }
        System.out.println("The final price of the sandwich is: "+ finalPrice);
    }

}
