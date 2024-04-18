package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        /*int i = 1;
        int sum = 0;
        while (i <=10){
            sum += i;
            i++;
        }

         */

      /*  int sum = 0;
        //(variable, condition, increment)
        for(int i =1; i<=10; i++){
            sum += i;
        }
        System.out.println("sum = " + sum);

       */

    //do while does the code first and then checks condition
       /* do{
            sum+=i;
            i++;
        } while(i<=10);


        */
        //break vs continue
        /*
        int sum =0;
        for(int i=1; i<=10; i++){
            if (i%3 == 0){
                break;
            }
            sum +=i;
        }
        System.out.println("sum = " + sum);

         */
        int sum =0;
        for(int i=1; i<=10; i++){
            if (i%3 == 0){
                //continue will run the sum as long is it i%3 is not 0, so will run for 1,2,4,5,7,8,10 where
                // for loop breaks
                continue;
            }
            sum +=i;
        }
        System.out.println("sum = " + sum);
    }
}
