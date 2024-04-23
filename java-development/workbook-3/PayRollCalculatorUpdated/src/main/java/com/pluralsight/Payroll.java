package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
       // String fileName = fileOpen;

        try {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the name of the file employee file to process:");
            String fileOpen = scanner.nextLine();
            System.out.println("Enter the name of the payroll file to create:");
            String fileCreated = scanner.nextLine();
            scanner.close();

            BufferedReader reader = new BufferedReader(new FileReader(fileOpen));
            FileWriter payRollWriter = new FileWriter(fileCreated,true);
            BufferedWriter bufferedWriter = new BufferedWriter(payRollWriter);



            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(id, name, hoursWorked, payRate);



                String formattedLine = String.format("Employee ID: %d, Name: %s, Gross Pay: $%.2f%n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
                bufferedWriter.write(formattedLine);


            }

            bufferedWriter.close();

        } catch (IOException e) {
            System.err.println("Error reading file: " );
        }
    }
}

