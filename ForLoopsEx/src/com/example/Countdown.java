
package com.example;

public class Countdown {

    public static void main(String[] args) {
        
        System.out.println("Countdown to Launch: ");
        //Вывод всех четных чисел от 0 до 20
        for(int i = 0; i <= 20; i=i+2) { //for(<инициализация>;<условие>;<итерация>

            System.out.print(i +" "); 
        }

        System.out.println("Blast Off!");
    }
}
