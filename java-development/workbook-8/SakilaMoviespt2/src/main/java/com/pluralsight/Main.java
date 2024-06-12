package com.pluralsight;

import com.pluralsight.db.DataManager;
import org.apache.commons.dbcp2.BasicDataSource;

public class Main {
    public static void main(String[] args) {
        if(args.length!=2){
            System.out.println("User and password needed to connect to database");
            System.exit(1);
        }

        String username = args[0];
        String password = args[1];


        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/northwind");
        dataSource.setUsername(username);
        dataSource.setPassword(password);

        DataManager dataManager = new DataManager(dataSource);

        
    }
}
