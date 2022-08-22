package input03;

import java.util.Scanner;

    public class Input03 {
        public static void main(String[] args) {
            //Create a Scanner

            //Find and print the sum of three integers entered by the user

            Scanner in = new Scanner(System.in);
            System.out.print("Первое значение ");
            int x1 = in.nextInt();
            System.out.print("Второе значение");
            int x2 = in.nextInt();
            System.out.print("Третье значение ");
            int x3 = in.nextInt();
            System.out.println("Сумма трех чисел : " +(x1+x2+x3));
            in.close();
        }
        //Remember to close the Scanner
    }