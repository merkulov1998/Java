/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListEx2
{

    public static void main(String[] args) {
        // объявляем переменную. коллецкию. добавляем значения в коллекцию.
        int i = 1;
        ArrayList<Integer> numberPhone = new ArrayList<Integer>();
        numberPhone.add(2);
        numberPhone.add(2);
        numberPhone.add(1);
        numberPhone.add(1);
        numberPhone.add(2);
        numberPhone.add(2);
        numberPhone.add(1);
        numberPhone.add(1);
        //отображение содержимого ArrayList с помощью Iterator
        Iterator<Integer> iterator = numberPhone.iterator();
        while (iterator.hasNext()) {
            System.out.println(" Номер" + iterator.next());


        }

        System.out.println(numberPhone.size());

        //удаление всех четных чисел
        for ( iterator= numberPhone.iterator(); iterator.hasNext();) {
            Integer number = iterator.next();
            if (number % 2 == 0) {
                //  System.out.println("This is Even Number: " + number);
                iterator.remove();
            }

        }

        System.out.println(numberPhone);


    }
}
