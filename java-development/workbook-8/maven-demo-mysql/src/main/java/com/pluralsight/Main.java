package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        /*
            //Step one Load the Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Step 2 - Create the connection
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/world",
                    "root",
                    "Bears@123"
            );
            //Step 3 - Create the statement
            Statement statement = connection.createStatement();

            //Step 4 - Create the query
            String query = "SELECT Name FROM city WHERE countryCode = 'USA'";

            //Step 5 - Execute query
            ResultSet results = statement.executeQuery(query);

            //Step 6 - Go through the results
            while(results.next()){
                String city = results.getString("Name");
                System.out.println(city);

        }
            //Step 7  - close the connection
                 connection.close();

         */
    // ============================================================================================================
        /*

        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "Bears@123"
        );

        Statement statement = connection.createStatement();

        // use """ for multiline string
        String query = """ 
                SELECT EmployeeID, FirstName, LastName,Title 
                FROM employees 
                WHERE Country = 'USA'
                """;

        ResultSet results = statement.executeQuery(query);

        while(results.next()) {
            String employeeID = results.getString("EmployeeID");
            String firstName = results.getString("FirstName");
            String lastName = results.getString("LastName");
            String title = results.getString("Title");

            System.out.println("Employee ID " + employeeID);
            System.out.println("FirstName: " + firstName);
            System.out.println("LastName: " + lastName);
            System.out.println("Title: " + title);
            System.out.println("==================================");
        }

        connection.close();

         */
        // =========================================================================================================

        // using scanner input to search through an sql table
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the country code to search for the city: ");
        String countryCode = scanner.next();
        //Step one Load the Driver
        Class.forName("com.mysql.cj.jdbc.Driver");
        //Step 2 - Create the connection
        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/world",
                "root",
                "Bears@123"
        );
        //Step 3 - Create the statement
       // Statement statement = connection.createStatement();
        // **** Use prepared statement

        //Step 4 - Create the query
        //no concatenation in prepared statement, do line 96 instead
       // String query = "SELECT Name FROM city WHERE countryCode = '" + countryCode + "'";

        String query = "SELECT Name, District FROM city WHERE countryCode = ?";

        //prepared statement, safer to do

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        // take countryCode and put it in place of question mark, 1 represents the first ?
        preparedStatement.setString(1, countryCode);
        //Step 5 - Execute query
        ResultSet results = preparedStatement.executeQuery();

        //Step 6 - Go through the results
        while(results.next()){
            String city = results.getString(1);
            System.out.println(city);

        }
        //Step 7  - close the connection
        results.close();
        preparedStatement.close();
        connection.close();

        // =========================================================================================================


    }
}