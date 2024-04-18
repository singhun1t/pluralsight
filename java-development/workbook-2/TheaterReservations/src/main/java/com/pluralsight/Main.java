package com.pluralsight;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reservation = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = reservation.nextLine().trim();
        int indexOfFirst = name.indexOf(' ');
        String firstname = name.substring(0,indexOfFirst);

        String lastname = name.substring(indexOfFirst+1);

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = reservation.nextLine().trim();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate dateChosen = LocalDate.parse(date, formatter);

        String numberTickets = "How many tickets would you like? ";
        System.out.print(numberTickets);
        int tickets = reservation.nextInt();

        String ticketString = tickets ==1 ? " ticket" :" tickets";
        System.out.println(tickets + ticketString + " reserved for "+  dateChosen + " under " + lastname + ", " + firstname );
        reservation.close();
        /*if (tickets == 1){
            System.out.println(tickets + " ticket reserved for "+ dateChosen + " under " + lastname + ", " + firstname );
        }else {
            System.out.println(tickets + " tickets reserved for "+ dateChosen + " under " + lastname + ", " + firstname );
        }

         */



    }
}
