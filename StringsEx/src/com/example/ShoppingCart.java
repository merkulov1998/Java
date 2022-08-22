/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class ShoppingCart {
    public static void main (String[] args){
        String custName = "Steve Smith";
        int spaceIdx=custName.indexOf(" ");//Получение индекса пробела с помощью метода indexOf и присвоение ему значения spaceIdx
        String lastName= custName.substring(spaceIdx, custName.length());//Возвращение вложенной строки и вывод первых 5 символов, начиная с нулевого
        System.out.println(spaceIdx);
        System.out.println(lastName);
        // Get the index of the space character (" ") in custName. 

        // Use the substring method parse out the first name and print it.


    }

    
}
