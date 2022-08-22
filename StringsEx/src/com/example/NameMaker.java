/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Scanner;

public class NameMaker {
    
    public static void main(String args[])
    {
        //Объявление переменных firstName, middleName, lastName и fullName
        String fullName;
        Scanner sc=new Scanner(System.in);
        String fistName=sc.nextLine();
        String middleName=sc.nextLine();
        String lastName=sc.nextLine();
        fullName=fistName+" "+middleName+" "+lastName;//Конкатенация строк
        System.out.println(fullName);
        sc.close();
    }
    
}
