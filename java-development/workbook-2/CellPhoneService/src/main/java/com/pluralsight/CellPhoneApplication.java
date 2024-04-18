package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {

        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the information for CellPhone 1:");

        System.out.print("What is the serial number? ");
        int serialNumber = scanner.nextInt();
        cellPhone1.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model phone? ");
        String model = scanner.nextLine();
        cellPhone1.setModel(model);

        System.out.print("Who is the carrier? ");
        String carrier = scanner.nextLine();
        cellPhone1.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        String phoneNumber = scanner.nextLine();
        cellPhone1.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        String owner = scanner.nextLine();
        cellPhone1.setOwner(owner);

        System.out.println("Enter the information for CellPhone 2:");

        System.out.print("What is the serial number? ");
        serialNumber = scanner.nextInt();
        cellPhone2.setSerialNumber(serialNumber);
        scanner.nextLine();

        System.out.print("What model is the phone? ");
        model = scanner.nextLine();
        cellPhone2.setModel(model);

        System.out.print("Who is the carrier? ");
        carrier = scanner.nextLine();
        cellPhone2.setCarrier(carrier);

        System.out.print("What is the phone number? ");
        phoneNumber = scanner.nextLine();
        cellPhone2.setPhoneNumber(phoneNumber);

        System.out.print("Who is the owner of the phone? ");
        owner = scanner.nextLine();
        cellPhone2.setOwner(owner);

        scanner.close();

        display(cellPhone1);
        display(cellPhone2);

        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
    }

    public static void display(CellPhone phone) {
        System.out.println("\nCellPhone Details:");
        System.out.println("Serial Number: " + phone.getSerialNumber());
        System.out.println("Model: " + phone.getModel());
        System.out.println("Carrier: " + phone.getCarrier());
        System.out.println("Phone Number: " + phone.getPhoneNumber());
        System.out.println("Owner: " + phone.getOwner());
    }
}
