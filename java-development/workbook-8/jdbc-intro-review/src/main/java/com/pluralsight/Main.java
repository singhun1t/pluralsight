package com.pluralsight;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws SQLException {

           Connection connection = null;
           PreparedStatement preparedStatement = null;
           ResultSet results = null;
            try{

                if(args.length!=2){
                    System.out.println("This application needs a username and a password to run");
                    System.exit(1);
                }

                String username = args[0];
                String password = args[1];

                Scanner scanner = new Scanner(System.in);
                System.out.println("Please enter the last name of the customers you want to search: ");
                String lastNameToSearch = scanner.nextLine();

                Class.forName("com.mysql.cj.jdbc.Driver");

                connection = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/sakila",
                        username,
                        password
                );

                String query = """
                    SELECT first_name, last_name
                    FROM customer
                    WHERE last_name LIKE ? ORDER BY first_name
                    """;

                preparedStatement = connection.prepareStatement(query);

                preparedStatement.setString(1,lastNameToSearch);

                results = preparedStatement.executeQuery();

                while(results.next()){
                  //  String firstName = results.getString(1);
                   // String lastName = results.getString(0);
                    // can either user column number (position) or column name

                    String firstName = results.getString("first_name");
                    String lastName = results.getString("last_name");

                    System.out.println("FirstName: " + firstName);
                    System.out.println("LastName: " + lastName);
                    System.out.println("=================================");


                }
                //close in this order, reverse order
                // moved to finally block
              //  results.close();
               // preparedStatement.close();
                // connection.close();
            }catch(Exception ex){
                System.out.println("an error as occurred");
                ex.printStackTrace();
            }
            //finally block runs regardless of errors
            //used to close resources if issue with code
        finally {
                System.out.println("An error has oc");
                if(results!=null){
                    results.close();
                }
                if(preparedStatement!=null){
                    preparedStatement.close();
                }
                if(connection!=null){
                    connection.close();
                }
            }


    }
}
