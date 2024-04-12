package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("enter the first number");
        int firstNumber = myScanner.nextInt();
        System.out.println("enter the second number");
        int secondNumber = myScanner.nextInt();
        addAndDisplay(firstNumber,secondNumber);
    }
    public static void addAndDisplay(int num1, int num2){
        int sum = num1 + num2;
        System.out.printf("%d + %d = %d", num1, num2, sum);
    }
}
