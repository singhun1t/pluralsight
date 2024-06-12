package com.pluralsight;


import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


            if (args.length != 2) {
                System.out.println("Application needs a username and password");
                System.exit(1);
            }
            String username = args[0];
            String password = args[1];

            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter the last name of the customers you want to serach:");
            String lastNameToSearch = scanner.next();

            //data source implementation
            BasicDataSource dataSource = new BasicDataSource();

            dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
            dataSource.setUsername(username);
            dataSource.setPassword(password);

            doSimpleQuery(dataSource, lastNameToSearch);
        System.out.println("===============================");
        doJoin(dataSource,lastNameToSearch);


    }

    public static void doSimpleQuery(BasicDataSource dataSource, String lastNameToSearch) {

        try (Connection connection = dataSource.getConnection();
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

        } catch (Exception ex) {
            System.out.println("An error has occured");
            ex.printStackTrace();
        }
    }
    public static void doJoin(BasicDataSource dataSource, String lastNameToSearch){
        try(Connection connection = dataSource.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement(
                "SELECT customer.first_name, customer.last_name, " +
                        "address.address, city.city, country.country " + "FROM customer " +
                        "LEFT JOIN address " +
                        " ON (customer.address_id = address.address_id) " + "LEFT JOIN city " +
                        " ON (address.city_id = city.city_id) " + "LEFT JOIN country " +
                        " ON (city.country_id = country.country_id) " + "WHERE last_name LIKE ? " +
                        "ORDER BY customer.first_name;")) {
            preparedStatement.setString(1, lastNameToSearch);

            try(ResultSet results = preparedStatement.executeQuery()){
                while(results.next()){
                    System.out.printf(
                            "first_name = %s, last_name = %s, address = %s," +
                                    " city = %s, country = %s\n",
                            results.getString(1),
                            results.getString(2),
                            results.getString(3),
                            results.getString(4),
                            results.getString(5));



                }
            }

    }catch(Exception ex){
            System.out.println("Error has occurred");
            ex.printStackTrace();
    }
    }
}


