import java.util.HashMap;
import java.util.Map;

public class HashCourses {
    public static void main(String[] args) {
        //создание коллекции
        HashMap<String,String> technology = new HashMap<>();
        //добавление значений в коллекцию
        technology.put("CIT", "Computing and Information Technology");
        technology.put("CHI", "Childcare and Early Education");
        technology.put("MVS", "Motor Vehicle Systems");
        technology.put("BTH", "Beauty Therapy");
        technology.put("GDE", "Graphic Design");
        //получаем список всех курсов
        //если нужны только курсы, то убираем entry.getKey()
        for(Map.Entry<String, String> entry: technology.entrySet()){
            System.out.println("ключ " + entry.getKey() + " значение: " + entry.getValue());
        }
        //выводим один курс через get
        System.out.println(technology.get("MVS"));

    }
}

