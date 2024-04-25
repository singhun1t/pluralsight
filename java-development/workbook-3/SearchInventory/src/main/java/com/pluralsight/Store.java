package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {
        ArrayList<Product> inventory = getInventory();

        Collections.sort(inventory, Comparator.comparing(Product::getName));

        Scanner scanner = new Scanner(System.in);
        System.out.println("We carry the following inventory: ");
        for (int i = 0; i < inventory.size(); i++) {
            Product p = inventory.get(i);
            System.out.printf("id: %d \n%s - \nPrice: $%.2f \n",
                    p.getId(), p.getName(), p.getPrice());
        }
    }

    public static ArrayList<Product> getInventory() {
        ArrayList<Product> inventory = new ArrayList<>();
        try {

            FileReader fileReader = new FileReader(("inventory.csv"));
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] values = line.split("\\|");
                int id = Integer.parseInt(values[0].trim());
                String name = values[1].trim();
                float price = Float.parseFloat(values[2].trim());

                inventory.add(new Product(id, name, price));
            }
            } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return inventory;
      /* inventory.add(new Product(1, "Hammer", 8.99f));
       inventory.add(new Product(2,"Washer",600.00f));
       inventory.add(new Product(3, "Dryer", 400.00f));
       inventory.add(new Product(4,"Hairgel", 2.99f));
       inventory.add(new Product(5, "Tablet", 399.76f));

       */
// this method loads product objects into inventory
// and its details are not shown


    }
}
