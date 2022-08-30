package task2;

import generated.Train;
import oao.rzd.trains.Train;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class Main {

    public static void main(String[] args) {
        {
            InputStream is = null;
            OutputStream os = null;
            try {
                // Подготавливаем файлы для записи
                is = new FileInputStream("resources/data.xml");
                os = new FileOutputStream("resources/otherCatalog.xml");

                // Пример чтения файла
                readXML(is);

                // Пример записи файла
               // writeXML(os);

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (JAXBException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    is.close();
                    os.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }

    }

    private static void readXML(InputStream is) throws JAXBException {
        // Подготавливаем необходимый набор объектов для чтения
        JAXBContext jc = JAXBContext.newInstance("oao.rzd.trains");
        Unmarshaller u = jc.createUnmarshaller();

        // Считываем файл в иерархию объектов
        Train po = (Train) u.unmarshal(is, Train.class);

        // Убеждаемся, что объекты есть
        System.out.println("Wagon:" + po.getWagons().getWagon().get(0));
    }
/*
    private static void writeXML(OutputStream os) throws JAXBException, FileNotFoundException {
        // Подготавливаем необходимый набор объектов для записи
        JAXBContext jc = JAXBContext.newInstance("src/generated");
        Marshaller m = jc.createMarshaller();

        // Создаем новый набор элементов для записи
        BookCatalogue bc = new BookCatalogue();
        Book b = new Book();
        b.setAuthor("First");
        Cost c = new Cost();
        c.setValue(new BigDecimal(1001));
        b.setCost(c);
        bc.getBook().add(b);

        // И записываем это в файл XML
        m.marshal(bc, os);
    }
    */
}