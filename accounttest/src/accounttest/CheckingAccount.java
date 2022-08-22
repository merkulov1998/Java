package accounttest;
//создание класса CheckingAccount

public class CheckingAccount {
    static double balance = 5000;
    static String name;

    public static double getBalance() {
        return balance;
    }

    public static void withdraw (double d){
        if(d<0){
            System.out.println("Сумма отрицательная");
        }
        else if(d> balance){
            System.out.println("Недостаточно средств");
        }
        else balance = balance - d;
        System.out.println(balance);

    }

}