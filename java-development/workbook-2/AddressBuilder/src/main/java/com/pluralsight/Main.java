package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner address = new Scanner(System.in);
        System.out.println("Please provide the following information: ");
        System.out.print("Full name:");
        String name = address.nextLine();
        System.out.print("\nBilling Street:");
        String street = address.nextLine();
        System.out.print("Billing City:");
        String city = address.nextLine();
        System.out.print("Billing State:");
        String state = address.nextLine();
        System.out.print("Billing Zip:");
        String billingZip = address.nextLine();

        System.out.print("\nShipping Street:");
        String shippingStreet = address.nextLine();
        System.out.print("Shipping City:");
        String shippingCity = address.nextLine();
        System.out.print("Shipping State");
        String shippingState = address.nextLine();
        System.out.print("Shipping zip:");
        String shippingZip = address.nextLine();

        StringBuilder addresses = new StringBuilder();
        addresses.append(name + " \n"+"Billing Address: \n");
        addresses.append(street + "\n");
        addresses.append(city + "\n");
        addresses.append(state + " ");
        addresses.append(billingZip);

        addresses.append("\n \n"+ "Shipping Address:" +"\n");
        addresses.append(shippingStreet + "\n");
        addresses.append(shippingCity + ", " + shippingCity + shippingZip);
        String shippingInformation = addresses.toString();
        System.out.println(shippingInformation);
        //System.out.println(addresses.toString());
        //can call it this way as well ^

    }
}
