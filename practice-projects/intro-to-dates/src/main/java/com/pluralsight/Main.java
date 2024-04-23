package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println("day of the week " + date.getDayOfWeek());//will give day of the week
        System.out.println("day of the month " +date.getDayOfMonth());
        System.out.println("day of the year "+ date.getDayOfYear());

        System.out.println("Month Name: " + date.getMonth());
        System.out.println("Month Value: " + date.getMonthValue());
        System.out.println("Year: " + date.getYear());

        System.out.println("================================================");

        LocalTime time = LocalTime.now();
        System.out.println("Hour " + time.getHour()); //get current hour and so on
        System.out.println("Minutes " + time.getMinute());
        System.out.println("Seconds: " + time.getSecond());
        System.out.println("Nanosecond: " + time.getNano());


        /*LocalTime currentTime = LocalTime.now();
        System.out.println("The current time is: " + currentTime);

        LocalDate today = LocalDate.now(); //will give current date of today
        System.out.println("Today is " + today);

        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("Right now it is: " + rightNow);

         */

    }
}
