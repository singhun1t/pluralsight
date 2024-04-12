package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner potatoScanner = new Scanner(System.in);

        System.out.println("Enter your full name");
        String name = potatoScanner.nextLine();

        System.out.println("Enter how many hours have you worked?");
        Double hoursWorked = potatoScanner.nextDouble();

        System.out.println("What is your pay rate?");
        Double payRate = potatoScanner.nextDouble();

        Double grossPay = payRate * hoursWorked;
        System.out.println(name + " has gross pay of $" + grossPay);
    }
}
