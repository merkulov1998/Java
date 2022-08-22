package com.example;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class SquareRootWhile {
    public static void main(String args[]) {
        System.out.print("Type a non-negative integer: ");
        Scanner console = new Scanner(System.in);
        int number = console.nextInt();
        while (number <0){
            System.out.println("Число меньше 0, попробуйте еще раз");
            number = console.nextInt();
        }
        System.out.println("Квадратный корень от числа"+ number+ " = "+ sqrt(number));
    }
}