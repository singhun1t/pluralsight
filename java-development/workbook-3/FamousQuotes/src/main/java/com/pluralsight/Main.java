package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            String[] quotes = {"Worries go down better with soup than without.", "Humor is also a way of saying something serious.",
                    "Cockroaches and socialites are the only things that can stay up all night and eat anything."
                    , "I want freedom for the full expression of my personality.", "Whoever ceases to be a student has never been a student.",
                    "Silence is the virtue of fools.", "Out of the strain of the Doing,Into the peace of the Done.", "What is done, is done",
                    "To look backwards is to lose track of one's self", "Pineapples don't belong on pizza"

            };
            System.out.println("Welcome to my favorite quotes");
            System.out.println("Choose your favorite quote by entering a number between 1 and 10 to select your favorite");

            Scanner quoteSelection = new Scanner(System.in);
            int choice = quoteSelection.nextInt();
            System.out.println(quotes[choice -1]);
            quoteSelection.close();
        } catch (Exception ex) {
            System.out.println("Your selection was out of range!");
        }


    }
}
