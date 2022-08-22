import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Employee {
    private String name;

    private String eMail;

    private StringBuilder password;

    private String userName;

    public String getName() {
        return name;
    }

    //Используем String, поскольку имя пользователя не будет изменяьтся
    public void setUserName(String userName) {
        this.userName = userName.toLowerCase().replace(' ','.');

    }

    //Используем String, поскольку почта не будет изменяться
    public void seteMail(String userName) {
        eMail = userName + "@ocrv.ru" ;
    }

    public void setName() {
        // Считываем, пока не будут введены имя и фамилия через пробел, используем String, поскольку мы не изменяем имя
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            int count = 0;
            while(count != 1) {
                System.out.println("Введите имя фамилию через пробел");
                String s= reader.readLine();
                if (s.matches("(.*) (.*)"))
                name = s;
                else
                    System.out.println("Неверный формат для имени");
                count = countChars(name, ' ');
            }
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public String geteMail() {
        return eMail;
    }

    public StringBuilder getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    //Пароль хранится в StringBuilder, поскольку мы часто меняем пароль
    public StringBuilder setPassword(StringBuilder s) {
        //Флаг, который отвечает за первый заглавный символ
        boolean b = true;
        //Флаг, который говорит, является ли символ негласным
        boolean b1 = true;
        password = s;
        //Массив гласных букв
        char [] Vowels = {'a', 'e', 'i', 'o', 'y', 'u','а', 'у','о', 'ы', 'и', 'э', 'я', 'ю', 'ё', 'е'};
        //Смотрим длину пароля и меняем её в зависимости от количества символов
        if(password.length()>=8){
            password.delete(8,password.length());
        }else{
            while(password.length() < 8){
                password.append('*');
            }
        }
        // Массив, в котором мы ищем гласные символы
        for (int i = 0; i< 8; i++) {
            for (char c2: Vowels
            ) {
                //Проверяем букву на согласность
                if(c2 == password.charAt(i)){
                    password.replace(i,i+1, "*");
                    //Флаг
                    b1 = false;
                }
            }
            //Первый согласный символ делаем заглавным
            if(password.charAt(i) !='.' && password.charAt(i) !='#' && password.charAt(i) !=',' && password.charAt(i) !='*' && b && b1){
                password.replace(i,i+1, password.substring(i,i+1).toUpperCase());
                b=false;
            }
            b1 = true;
        }
        return password;
    }

    @Override
    public String toString() {
        return "Имя='" + name + '\'' +
                ", Email='" + eMail + '\'' +
                ", Пароль =" + password +
                ", Имя пользователя='" + userName + '\'';
    }

    // Конструктор
    public Employee() {
        setName();
        setUserName(name);
        seteMail(userName);
        System.out.println(userName);
        setPassword(new StringBuilder(userName));
    }


    public int countChars(String str,char c){
        int count = 0;
        //Считаем, сколько раз встречается символ в слове
        for (char s:str.toCharArray()
        ) {
            if(s==c) count++;
        }
        return count;
    }


}
