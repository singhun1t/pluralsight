package com.pluralsight;

import org.apache.commons.dbcp2.BasicDataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLOutput;
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
        System.out.println(" Enter the last name of an actor you like");
        String lastNameToSearch = scanner.nextLine();

        BasicDataSource dataSource = new BasicDataSource();

        dataSource.setUrl("jdbc:mysql://localhost:3306/sakila");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        lastNameQuery(dataSource, lastNameToSearch);

        System.out.println("Now enter the first name of the actor for which you want to see the movies of");
        String firstNameSearch = scanner.nextLine();
        System.out.println("Now enetter the last name of the actor for which you want to see the movies of");
        String lastNameMovieSearch = scanner.nextLine();
        movieSearch(dataSource, firstNameSearch,lastNameMovieSearch);
    }

    public static void lastNameQuery(BasicDataSource dataSource, String lastNameToSearch) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     """
                             SELECT first_name, last_name
                             FROM actor
                             WHERE last_name like ?
                             ORDER by first_name
                             """
             )) {
            preparedStatement.setString(1, lastNameToSearch);
            try (ResultSet results = preparedStatement.executeQuery()) {
                    while(results.next()){
                        String first_name = results.getString("first_name");
                        String last_name = results.getString("last_name");

                        System.out.println("FirstName: " + first_name);
                        System.out.println("LastName: " + last_name);
                        System.out.println("===========================");
                    }
            }
        } catch (Exception ex) {
            System.out.println("An error has occurred");
            ex.printStackTrace();
        }
    }

    public static void movieSearch(BasicDataSource dataSource, String firstNameSearch, String lastNameMovieSearch ){
        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     """
                             SELECT actor.first_name, actor.last_name,film.title
                             FROM actor
                             INNER JOIN film_actor ON actor.actor_id = film_actor.actor_id
                             INNER JOIN film ON film.film_id = film_actor.film_id
                             WHERE first_name like ? AND last_name like ?
                             """
             )) {
            preparedStatement.setString(1, firstNameSearch);
            preparedStatement.setString(2,lastNameMovieSearch);
            try (ResultSet results = preparedStatement.executeQuery()) {
                if(results.next()){
                    System.out.println("You're matches are: ");
                    do {
                        String first_name = results.getString("first_name");
                        String last_name = results.getString("last_name");
                        String movie = results.getString("film.title");

                        System.out.println("FirstName: " + first_name);
                        System.out.println("LastName: " + last_name);
                        System.out.println("movie: " + movie);
                        System.out.println("===========================");
                    }while(results.next());
                }else{
                    System.out.println("No matches");
                }
            }
        } catch (Exception ex) {
            System.out.println("An error has occurred");
            ex.printStackTrace();
        }

    }
}
