/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;
import java.util.ArrayList;

public class ArrayListEx1 {


    public static void main(String[] args) {
        // объявление массива
        ArrayList student = new ArrayList();
        // добавление элемента
        student.add("Эйми");
        student.add("Боб");
        student.add("Синди");
        student.add("Дэйвид");

        // вывод студентов
        System.out.println("Студенты"+ student);

        //добавление 2 других студентов в индексы 0 и 1
        student.add(0,"Ника");
        student.add(1,"Майк");
        //удаление студента в индексе 3
        student.remove(3);
        //вывод элементов ArrayList и отображение размера списка
        System.out.println("'элементы"+ student +" размер " + student.size());
    }
    
}
