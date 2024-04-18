package com.pluralsight;

import static java.lang.Thread.sleep;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {


        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
            Thread.sleep(1000);
            if(i ==1){
                System.out.println("launch");
            }



        }

        //another way to do it, instead of decrementing
        /*
        int count = 10;
        System.out.println("Count down: ");
        for (int i = 0; i<10; i++){
            System.out.println(count - i + ".");
            Thread.sleep(1000);
        }
        System.out.println("Launch");

         */



    }
}
