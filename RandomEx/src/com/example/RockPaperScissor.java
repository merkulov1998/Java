/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;


import java.util.Random;

public class RockPaperScissor {

    public static void main(String[] args) {
        Random num=new Random();
        int randomnum=num.nextInt(3);
        System.out.println(randomnum);
        if (randomnum==0){
            System.out.println("камень");
        }
        if (randomnum==1){
            System.out.println("бумага");
        }
        if (randomnum==2){
            System.out.println("ножницы");
        }
    }
}
