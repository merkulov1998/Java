package bikeproject;

import java.util.*;

public class BikeList {
    public static void main(String[] args) {
        ArrayList<Bike> bikes = new ArrayList<>();//создание ArrayList для хранения горных и дорожных велосипедов
        //добавление 2 локальных целочисленных переменных
        int mountainBikeSales = 0;
        int roadBikeSales = 0;
        fillArray(bikes);//вызов метода fillArray
        displayStock(bikes);//вызов метода displayStock
        System.out.println(calculateStock(bikes));
        displayBikeNumbers(bikes);//вызов метода displayBikeNumbers
    }

    //Случайным образом заполняем лист
    public static void fillArray(ArrayList<Bike> bikes) {
        Random r = new Random();
        int low = 0;
        int high = 2;
        int rand;
        // 0 горный велосипед, 1 дорожный
        for (int i = 0; i < 10; i++) {
            rand = r.nextInt(high - low) + low;
            if (rand < 1) bikes.add(new MountainBike());
            else
                bikes.add(new RoadBike());
        }
    }

    public static void displayStock(ArrayList<Bike> bikes) {//метод, принимающий ArrayList в качестве параметра
        for (Bike b : bikes
        ) {
            System.out.println(b);
        }
    }


    //Подсчет количества горных велосипедов с помощью instanceof
    public static int calculateStock(ArrayList<Bike> bikes) {
        int bikesSold = 0;
        for (Bike b : bikes
        ) {
            if (b instanceof MountainBike) bikesSold++;
        }
        return bikesSold;
    }

    //Подсчет количества дорожных велосипедов с помощью instanceof
    public static void displayBikeNumbers(ArrayList<Bike> bikes) {
        int mb = 0;
        int rb = 0;
        mb = calculateStock(bikes);
        rb = 10 - mb;
        System.out.println("Stock Levels" + "\n We have " + mb + " Mountain bikes in stock" + "\n We have " + rb + " Road bikes in stock");
    }

}
