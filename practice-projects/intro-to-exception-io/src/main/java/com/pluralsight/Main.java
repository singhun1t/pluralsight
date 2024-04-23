package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        try {
            FileInputStream fis = new FileInputStream("poem.txt");
            Scanner scanner = new Scanner(fis);

            String input;
            while(scanner.hasNextLine()){
                input = scanner.nextLine();
                System.out.println(input);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("The file requested was not found");;
        }

         */

        try {
            FileReader fileReader = new FileReader("poem.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null){
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (Exception e) {
            System.out.println("An error has occured");

        }
    }
}
