/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        System.out.print("Введите цену билета \n");
        //ввод целочисленной переменной-цены билета
        Scanner sc=new Scanner(System.in);
        int price=sc.nextInt();
        System.out.print("Введите рейтинг фильма \n");
        //ввод целочисленной переменной-рейтинга билета
        int rate=sc.nextInt();
        //если условие истинно
        if((price>=12)&&(rate==5)){
            System.out.println("Мне интересно посмотреть фильм");

        }
        //если условие ложно
        else{
            System.out.println("Я не заинтересован в просмотре фильма");
        }
        sc.close();
    }
}
