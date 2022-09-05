package task2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import oao.rzd.trains.Train;
import oao.rzd.trains.Wagon;
import oao.rzd.trains.Wagons;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        {
            InputStream is = null;
            try {

                // Подготавливаем файлы для записи
                is = new FileInputStream("resources/data.xml");

                // Пример чтения файла
                readXML(is);

                // Пример записи файла
            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (JAXBException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    is.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

    private static void readXML(InputStream is) throws JAXBException {
        // Подготавливаем необходимый набор объектов для чтения
        JAXBContext jc = JAXBContext.newInstance(Train.class, Wagons.class, Wagon.class);
        Unmarshaller u = jc.createUnmarshaller();

        // Считываем файл в иерархию объектов
        Train po = (Train) u.unmarshal(new File("resources/data.xml"));

        // Убеждаемся, что объекты есть
        System.out.println("Train:" + po.getName());

        //Создаем объект Gson
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(po);
        System.out.println(json);

        //Записываем данные в json файл
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("resources/data.json"))) {
            writer.write(json);
        }
        catch(IOException e){
            // Handle the exception
        }
    }
}