package com.pluralsight;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Main {
    public static void main(String[] args) {
        try {
            if (args.length != 2) {
                System.out.println("This application requires a username and password");
                System.exit(1);
            }
            String username = args[0];
            String password = args[1];

            Class.forName("com.mysql.cj.jdbc.Driver");

            try (


            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/northwind",
                    username,
                    password
            );
                PreparedStatement preparedStatement = connection.prepareStatement("SELECT ProductID, ProductName, UnitPrice,UnitsInStock\n" +
                        "                    FROM products");

                ResultSet results = preparedStatement.executeQuery();
            ){

            while (results.next()) {
                int productId = results.getInt("ProductID");
                String productName = results.getString("ProductName");
                double unitPrice = results.getDouble("UnitPrice");
                int unitsStock = results.getInt("UnitsInStock");

                System.out.println("Product Id: " + productId);
                System.out.println("Product Name: " + productName);
                System.out.println("Unit Price: " + unitPrice);
                System.out.println("Units in Stock: " + unitsStock);
                System.out.println("----------------------------------");
            }
            results.close();
            preparedStatement.close();
            connection.close();
        }
        }catch(Exception ex){
            System.out.println("an error has occurred");
        }
    }
}