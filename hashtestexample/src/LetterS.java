import java.util.LinkedList;

public class LetterS {
    public static void main(String[] args) {
        //Инициализируем LinkedList
        LinkedList<String> lettersQ = new LinkedList<>();
        //добавляем в LinkedList
        lettersQ.add("A");
        lettersQ.add("B");
        lettersQ.add("C");
        lettersQ.add("D");
        //выводим информацию
        System.out.println("LinkedList: " + lettersQ);
        //выводим размер
        System.out.println("Queue size " + lettersQ.size());
        //пока коллекция не пустая
        while (!lettersQ.isEmpty()){
            //выводим в консоль и удаляем первый элемент
            System.out.println(lettersQ.removeFirst());
        }

        System.out.println("LinkedList: " + lettersQ);

    }
}

