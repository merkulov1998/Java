package com.example;

import java.util.Scanner;

public class SumofNums {
    public static void main(String args[]) {
        Scanner console = new Scanner(System.in);
        int sum = 0;

        int number;
        do {
            System.out.print("Enter a number (-1 to quit): ");
            number = console.nextInt();
            if (number < -1){
                System.out.println("Введите положительное");
                number = console.nextInt();
            }
            sum = sum + number;     // moved to top of loop
        }
        while (number != -1) ;

        System.out.println("The sum is " + sum);

    }
}