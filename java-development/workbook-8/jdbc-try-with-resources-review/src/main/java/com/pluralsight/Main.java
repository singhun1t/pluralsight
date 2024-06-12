package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        try {
            if (args.length != 2) {
                System.out.println("invalid, need username and password");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the last name of the customers you want to serach:");
            String lastNameToSearch = scanner.next();

            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila",
                    username,
                    password
            );
                 PreparedStatement preparedStatement = connection.prepareStatement(
                         """
                                 SELECT first_name, last_name
                                 FROM customer
                                 WHERE last_name LIKE ? 
                                 ORDER BY first_name
                                 """
                 )) {
                preparedStatement.setString(1, lastNameToSearch);

                try (ResultSet results = preparedStatement.executeQuery()) {
                    while (results.next()) {
                        String firstName = results.getString("first_name");

                        String lastName = results.getString("last_name");


                        System.out.println("FirstName: " + firstName);
                        System.out.println("LastName: " + lastName);
                        System.out.println("==========================");
                    }
                }

            }

        } catch (Exception ex) {
            System.out.println("An error has occured!");
            ex.printStackTrace();
        }
    }
}
