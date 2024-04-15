package com.pluralsight;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
       // String welcome = "Big Tex says \"Howdy\"";
       // System.out.println(welcome);
       /* String s1 = "ABC";

        String s2 = "abc";

        String s3 = new String (  "ABC");
        // different way to create a string

        if (s1.equalsIgnoreCase(s2)){
            System.out.println(("s1 is equal to s2"));
        }

        if (s1.equalsIgnoreCase(s3)){
            System.out.println("s1 is equal to s3");
        }
         */
        /*String fullName = "  Manvir Singh     ";
       // int length = fullName.length();
        //System.out.println(length);
        fullName = fullName.trim();
        System.out.println(fullName);

       */
        /*
        String productCode = "ACME-12213";
        int dashPosition = productCode.indexOf('-');

        String vendor = productCode.substring(0, dashPosition);
        String productNum = productCode.substring(dashPosition + 1);

        System.out.println(vendor);
        System.out.println(productNum);
        System.out.println(dashPosition);
         */
        String input = "Dallas|Ft. Worth|Austin";
        String[] cities = input.split ("t");

        System.out.println(Arrays.toString(cities));
    }
}
