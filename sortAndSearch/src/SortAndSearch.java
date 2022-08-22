import java.util.Random;
import java.util.Scanner;

public class SortAndSearch {
    public static void main(String[] args) {
        // объявляем массив размера в 50 значений
        int[] array = new int[50];

        addValue(array);
        System.out.println("неупорядоченный список:");
        displayValues(array);
        // метод для поиска
        // при запуске метода вводим значение в консоли
        int number = search(array);
        if (number == -1) {
            System.out.println("Невозможно найти значение");
        } else {
            System.out.println("Значение находится в массиве под номером " + number);
        }

        // сортируем массив
        bubbleSort(array);

        System.out.println("Упорядоченный список");
        displayValues(array);


        number = search(array);
        if (number == -1) {
            System.out.println("Невозможно найти значение");
        } else {
            System.out.println("Значение находится в массиве под номером " + number);
        }
    }

    // метод для заполнения массива значением от 0 до 100
    static void addValue(int[] array) {
        Random rand = new Random();
        for (int i = 0; i <= 49; i++) {
            int random = rand.nextInt(100);

            array[i] = random;
        }
    }

    // метод для вывода массива в консоль
    static void displayValues(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }//endfor
        System.out.println("\n");
    }

    // метод последовательного поиска
    // при удачном исходе возвращает нам номер в массиве
    // иначе выкидывает -1
    static int search(int[] numbers) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите значение для поиска");
            int value = sc.nextInt();
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == value) {

                    return i;
                }//endif
            }//endfor


        } catch (IllegalArgumentException e) {
            System.out.println("введенное значение не подходит для поиска");
        }
        return -1;
    }

    // метод для сортировки пузырьком
    static void bubbleSort(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            boolean flag = false;
            for (int j = 0; j < numbers.length - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    flag = true;
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }//endif
            }//endfor
            if (!flag) {//Перестановок не случилось, массив отсортирован. Выход.
                return;
            }//endif
        }//endfor
    }
}