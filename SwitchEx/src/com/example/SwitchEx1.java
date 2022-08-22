/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class SwitchEx1 {
    public static void main(String[] args) {
        int month;
        Scanner sr = new Scanner(System.in);
        System.out.println("Введите номер месяца");
        //вввод номера месяца
        month = sr.nextInt();
        String mnth;
        //если переключатель равен значению у case, выполняется оператор
        switch (month) {//month-переменная-переключатель
            case 1:
                mnth = "январь";
                break;
            case 2:
                mnth = "февраль";
                break;
            case 3:
                mnth = "март";
                break;
            case 4:
                mnth = "апрель";
                break;
            case 5:
                mnth = "май";
                break;
            case 6:
                mnth = "июнь";
                break;
            case 7:
                mnth = "июль";
                break;
            case 8:
                mnth = "август";
                break;
            case 9:
                mnth = "сентябрь";
                break;
            case 10:
                mnth = "октябрь";
                break;
            case 11:
                mnth = "ноябрь";
                break;
            case 12:
                mnth = "декабрь";
                break;
                //оператор по умолчанию
            default:
                mnth = "месяца не существует";
                break;

        }
        System.out.println("месяц : " + mnth);

    }
}