/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ComputeAvg
{

    public static void main(String[] args) {

        // объявляем scanner для ввода из консоли.
        Scanner scanner = new Scanner(System.in);
        int[] val = new int[5];
        int step = 0;
        int count = 0;
        // для ввода значение теста используем цикл while и выходим после заполнения 5 значений
        while (step < 5) {
            int values;
            System.out.println("Введите количество баллов за тест");
            values = scanner.nextInt();
            // присваиваем каждому элементу значения
            val[step] = values;
            // увеличения счетчика
            step++;
        }

        // вывод информациии
        for (int i = 0; i <= val.length - 1; i++) {
            System.out.println("Значение" + val[i]);
            count += val[i];
        }

        System.out.println("Средняя оценка за тест" + count/val.length);
    }

}
