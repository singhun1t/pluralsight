package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        //Date time formatting
        LocalDateTime today = LocalDateTime.now();
        System.out.println("today is: " + today);
        //format into something more readable
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("E, MMM dd, yyyy HH:mm:ss");
        //convert from date to a string
        String formattedDate = today.format(fmt);
        System.out.println("Formatted Date is: " + formattedDate);

         */
    //Converting String to Date
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a date: ");
        String userInput = scanner.nextLine();

        //optional converting to a certain pattern/format
        DateTimeFormatter potatoFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate transformedDate = LocalDate.parse(userInput,potatoFormatter);
        System.out.println(transformedDate);


    }
}
