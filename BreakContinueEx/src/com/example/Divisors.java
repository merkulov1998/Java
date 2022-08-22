package com.example;

import java.util.Scanner;

public class Divisors {

    public static void main(String args[]) {

        
         Scanner console = new Scanner(System.in);
         
        System.out.print("Enter the number :  ");
        int num = console.nextInt();
         
     System.out.print("Divisors of " + num+" "+ "="+" " );
     //i-счетчик цикла, num-вводимое число
        //начальное значение в цикле 1, цикл идет до значения num
        for (int i = 1; i < num; i++) {
            //если деление без остатка !=0, то цикл продолжается
            if (num % i != 0) {
                continue;
            }
            System.out.print(i + " , ");
        }
    }
}
