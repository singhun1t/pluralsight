package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {
    // the key is the product id, the value is a product object
    public static HashMap<String, Product> inventory =
            new HashMap<>();

    public static void main(String[] args) {
        // this method loads product objects into inventory
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        boolean continueSearch = true;
        while(continueSearch) {
            System.out.print("What item  are you interested in? (enter x to quit search)");
            String id = scanner.nextLine();
            if(id.equalsIgnoreCase("x")){
                continueSearch = false;
                System.out.println("search ended");
            } else {

                try {
                    Product matchedProduct = inventory.get(id);
                    if (matchedProduct == null) {
                        System.out.println("We don't carry that product");
                        return;
                    }
                    System.out.printf("We carry %s and the price is $%.2f\n",
                            matchedProduct.getName(), matchedProduct.getPrice());
                } catch (Exception e) {
                   throw new RuntimeException(e);
                }
            }
        }
    }

    public static void loadInventory(){
        try {
            BufferedReader bufferedReader = new BufferedReader((new FileReader("inventory.csv")));
            String line;
            while((line = bufferedReader.readLine())!=null){
                String[] values = line.split("\\|");

                    int id = Integer.parseInt(values[0]);
                    String name = values[1];
                    double price = Double.parseDouble(values[2]);
                    inventory.put(name, new Product(id,name,price));

                //System.out.println(inventoryHash);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}