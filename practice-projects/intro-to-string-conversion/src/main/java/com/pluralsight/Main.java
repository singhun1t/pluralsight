package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String productNumber = "111-Ray";

        //split into 2 parts, take the number part first and store it
        int dashPosition = productNumber.indexOf('-');
        String numberPart = productNumber.substring(0,dashPosition);

        //takes the part after the dash and stores at namePart
        String namePart = productNumber.substring(dashPosition +1);

        //take the string and convert to an int
        int number = Integer.parseInt(numberPart);

        //convert string to a date
        String userInput = "2002-10-17";
        LocalDate birthdayOne = LocalDate.parse(userInput);

        //if we use a different format have to use formatter
        String userInputTwo = "10/17/2022";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate birthday = LocalDate.parse(userInputTwo, formatter);
    }
}
