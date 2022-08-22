package agechecker;
import java.util.Scanner;
public class AgeChecker {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int age;
        char holdLicense;

        System.out.println("Enter your age: ");
        age=sc.nextInt();//ввод данных
        System.out.println("Do you hold a driving license? ");
        holdLicense=sc.next().charAt(0);
        if((age>20)&&(holdLicense=='y'))//проверка условия
            System.out.println("You are an adult and can hire a car");
        else
            System.out.println("You are mot an adult so can't hire a car");
        sc.close();//закрываем Scanner
    }//конец главного метода
}//конец класса AgeChecker
