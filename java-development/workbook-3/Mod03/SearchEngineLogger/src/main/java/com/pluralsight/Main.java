package com.pluralsight;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;
import java.time.format.DateTimeFormatter;
import java.util.Formatter;
import java.util.Scanner;

public class Main {
    private static final String LOG_FILE_NAME = "logs.txt";
    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    public static void main(String[] args) {
        logAction("launch");

        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Enter a serach term(x to exit):")
            String searchTerm = scanner.nextLine();
            if ("X".equalsIgnoreCase(searchTerm)){
                logAction("exit");
                break;
            }else{
                logAction("search :" +searchTerm);
            }
        }
        scanner.close;


    }
    private static void logAction(String action) {
        try(BufferedWriter writer = new BufferedWriter((new FileWriter(LOG_FILE_NAME, true))){
            writer.write(FORMATTER.format(localDatetime.now()))
        }
        catch(IOException e){
            System.err.println("Error writing to the log file" + e.getMessage());
        }
        //messed up this exercsie
    }


    }





