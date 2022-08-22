package accounttest;
//создание класса AccountTest с помощью главного метода

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount();
//        checkingAccount.balance = 5000;
        System.out.println("Баланс "+ checkingAccount.getBalance());
        checkingAccount.name = "Dadova";
        Bond bond = new Bond();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.println("Введите сумму вложения");
            int i = Integer.parseInt(bufferedReader.readLine());
            System.out.println("Остаток на балансе");
            checkingAccount.withdraw(i);
            System.out.println("Введите кол-во месяцев");
            int a = Integer.parseInt(bufferedReader.readLine());
            bond.balance = i;
            bond.setTermAndRate(a);
            bond.earnInterest();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

}