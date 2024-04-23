package com.pluralsight;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner (System.in);
            System.out.println("Enter the name of the story:");
            String fileName = scanner.nextLine();

            FileInputStream fis = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(fis);

            int lineNumber =1;


            while(fileScanner.hasNextLine()){
                String line = fileScanner.nextLine();
                System.out.println(lineNumber +". "+ line);
                lineNumber++;
            }
            scanner.close();
            fileScanner.close();
        } catch (Exception e) {
            System.out.println("File not found");
        }

        /*
        try {
            FileInputStream gold = new FileInputStream("goldilocks.txt");
            FileInputStream han = new FileInputStream("hansel_and_gretel.txt");
            FileInputStream mary = new FileInputStream("mary_had_a_litte_lamb.txt");

            String input;
            System.out.println("Select A children's storie to read from:");
            Scanner selection = new Scanner(System.in);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Scanner choice = new Scanner();

         */

    }
}
