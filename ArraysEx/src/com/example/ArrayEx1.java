/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

public class ArrayEx1 {

    public static void main(String args[]) {
        //объявление одномерного массива
        int[] score = new int[9];
        //объявление и инициализация массива
        byte[] values = {1,1,1,1,1,1,1,1,1,1};
        //поменяли тип массива с int на long
        long[] primeNum = new long[20]; //было: int[] primeNum = new long[20];
        //Добавили квадратные скобки после типа массива
        int[] even = new int[5];//было: int even=new int[5];
        long[] primes = new long[20];
        primes[0] = 2;
        primes[1] = 3;
        long[] primes2 = primes;
        System.out.println(primes2[0]);
        primes2[0] = 5;
        System.out.println(primes[0]);

    }

}
