package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        assets.add(new House("House", "2021-12-15", 80000.0, "13 Villa court", 1, 2500, 1200));
        assets.add(new House("Vacation Home", "2017-09-30", 180000.0, "201 Foxhound Drive", 1, 1800, 8000));
        assets.add(new Vehicle(" Car", "2022-03-05", 28000.0, "Lexus Nx350h", 2022, 10000));

        for (Asset asset : assets) {
            System.out.println("Description: " + asset.getDescription());

            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());

            System.out.println("Current Value: $" + asset.getValue());

            if (asset instanceof House) {
                System.out.println("Address: " + ((House) asset).getAddress());

            } else if (asset instanceof Vehicle) {
                System.out.println("Make/Model: " + ((Vehicle) asset).getMakeModel());
                System.out.println("Year: " + ((Vehicle) asset).getYear());
            }


        }
    }
}
