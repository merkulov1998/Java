package com.example;

import java.util.Scanner;

public class ComputeSum {

    public static void main(String[] args) {
    Scanner console=new Scanner(System.in);
    int sum=0;
    int number;
    int k=0;
    do{
        System.out.print("Enter a number(0 to quit): ");
        number=console.nextInt();
        k++;
        if(k==10){
            break;
        }
        sum=sum+number;
    }while(k!=10);
       System.out.println("The sum is "+sum);

    }
}
