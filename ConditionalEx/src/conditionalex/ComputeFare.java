/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conditionalex;

import java.util.Scanner;

public class ComputeFare {

    public static void main(String args[]) {
        System.out.print("Enter the age \n");
        Scanner keyboard = new Scanner(System.in);
        int age = keyboard.nextInt();//объявление целочисленной переменной и ее ввод с клавиатуры
        int fare;
        //проверяется 3 условия. Если условие истинно, выполняется оператор
        //если возраст меньше 11, тариф=3
        if (age < 11) {
            fare = 3;
            //если тариф не меньше 11 и меньше 65, тариф=5
        } else if (age >= 11 && age < 65) {
            fare = 5;
        } else {//если 2 предыдущих условия не выполняются, тариф 3
            fare = 3;
        }
        System.out.println(fare+"$");
        keyboard.close();
    }
}
