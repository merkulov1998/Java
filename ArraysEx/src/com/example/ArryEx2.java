/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ArryEx2
{

    static final int ROWS = 2;
    static final int COLS = 3;

    public static void main(String args[])
    {
        // Размер массива не 3, а 4
        String[] browsers = new String[4];
        browsers[0] = "explorer";
        browsers[1] = "chrome";
        browsers[2] = "opera";
        browsers[3] = "firefox";
        System.out.println("size of array " + browsers.length);
        for (String i : browsers)
        {
            System.out.print(i + " ");
        }
        System.out.println();
        // Упр
        Scanner sc = new Scanner(System.in);
        int[][] M = new int[ROWS][COLS];
        M[0][0] = sc.nextInt();
        M[0][1] = sc.nextInt();
        M[0][2] = sc.nextInt();
        M[1][0] = sc.nextInt();
        M[1][1] = sc.nextInt();
        M[1][2] = sc.nextInt();
        System.out.println("Организация по строкам:");
        for (int i = 0; i < ROWS; i++)
        {
            for (int j = 0; j < COLS; j++)
            {
                System.out.printf("%d ", M[i][j]);
            }
            System.out.println();
        }
        System.out.println("Организация по столбцам:");
        for (int j = 0; j < COLS; j++)
        {
            for (int i = 0; i < ROWS; i++)
            {
                System.out.printf("%d ", M[i][j]);
            }
            System.out.println();
        }
        sc.close();
    }

}
