package com.pluralsight;

import java.sql.*;

public class UsingDriverManager {
    public static void main(String[] args) {
        try{

            if(args.length != 2){
                System.out.println("Application needs only 2 arguments");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];

            Class.forName("com.mysql.cj.jdbc.Driver");

            //setup connection using saved password and username that is stored inside configurations

            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sakila",
                    username,
                    password
            );

            String query = """
                    SELECT first_name, last_name
                    FROM customer
                    WHERE last_name LIKE ? ORDER BY first_name
                    """;

            PreparedStatement preparedStatement = connection.prepareStatement(query);

            preparedStatement.setString(1, "Sa%");

            ResultSet results = preparedStatement.executeQuery();
            while(results.next()){
                String firstName = results.getString("first_name");
                String lastName = results.getString("last_name");
                System.out.println("First Name: " + firstName);
                System.out.println("Last Name: " + lastName);
                System.out.println("==============================================");
            }
            results.close();
            preparedStatement.close();
            connection.close();

        }catch (Exception ex){
            System.out.println("an error has occurred");
            ex.printStackTrace();
        }
    }
}
