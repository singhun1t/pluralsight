package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static Scanner myScanner = new Scanner(System.in);
    public static void main(String[] args) {


        System.out.println("enter the first number");
        int firstNumber = myScanner.nextInt();

        System.out.println("enter the second number");
        int secondNumber = myScanner.nextInt();

        int sumFromFunction = addAndDisplay(firstNumber,secondNumber);
        System.out.printf("%d + %d = %d", firstNumber, secondNumber, sumFromFunction);
    }
    public static int addAndDisplay(int num1, int num2){
        int sum = num1 + num2;

        return sum;
    }
}
