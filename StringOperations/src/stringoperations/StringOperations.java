package stringoperations;

public class StringOperations {//создание класса
    public static void main(String[] args){//создание главного метода
        //объявление и инициализация переменных
        String str1 = "Hello";
        String str2 = "Duke";
        String str3;
        str3 = "You are"+str2;//создание новой строки путем конкатенации
        System.out.println("Welcome: "+str3);//отображение сообщения на экран
        System.out.println("Length: "+str1.length());//отображение длины строки
        System.out.println("Sub: "+str3.substring(0,5));//отображение первых 5 символов
        System.out.println("Upper: "+str2.toUpperCase());//отображение строки заглавными буквами
        //сравнить 2 строки и увидеть, одинаковы ли они или нет
        //индентифицировать лексикографический порядок 2 строк
        System.out.println(str1.compareTo(str2));
        //сравнить 2 строки и увидеть, одинаковы ли они или нет(порядок не важен)
        System.out.println(str1.equals(str2));
    }//конец главного метода
}//конец класса
