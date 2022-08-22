/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class SwitchEx2 {

    public static void main(String args[]) {
         char option = 'A';
        int aCount = 0, bCount = 0, cCount = 0;
        switch (option) {
            case 'A':
                aCount++;
                System.out.println("Count of A  " + aCount);
            case 'B':
                bCount++;
                System.out.println("Count of B  " + bCount);
            case 'C':
                cCount++;
                System.out.println("Count of B  " + cCount);
                break;
       
        }

    }
}
/* switch: Указывает переменную для тестирования
значения.
• case: Сравнивание значение переменной switch.
• default: Если ввод не соответствует случаям, будет
выполнен оператор по умолчанию. Однако оператор
default является дополнительным.
• break: Используется в качестве последнего оператора в
каждом списке операторов Case. Оператор Break
приводит к перемещению управления в конец
оператора switch.
*/

