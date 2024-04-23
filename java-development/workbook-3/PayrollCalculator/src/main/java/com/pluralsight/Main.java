package com.pluralsight;

import java.io.BufferedReader;

import java.io.FileReader;

public class Main {
    public static void main(String[] args) {
        String fileName = "employees.csv";

        try {
            // FileReader fileReader = new FileReader(fileName);
            // BufferedReader bufferedReader = new BufferedReader(fileReader);
            //Can do both of these using the one line written below
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] tokens = line.split("\\|");

                int employeeId = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);

                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                System.out.printf("Employee ID: %d, Name: %s, Gross Pay: $%.2f\n",
                        employee.getEmployeeId(), employee.getName(), employee.getGrossPay());
            }
        } catch (Exception e) {
            System.out.println("You ran into an error");
        }

    }
}
