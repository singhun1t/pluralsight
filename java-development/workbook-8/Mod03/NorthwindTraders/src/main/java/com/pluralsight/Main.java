package com.pluralsight;

import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/northwind",
                "root",
                "Bears@123"
        );

        Statement statement = connection.createStatement();

        String query = """ 
                        SELECT ProductName 
                        FROM products
                        ORDER by ProductName
                       """;
        ResultSet results = statement.executeQuery(query);

        while(results.next()){
            String productName = results.getString("ProductName");
            System.out.println(productName);
        }

        connection.close();
    }
}
