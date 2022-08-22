import java.util.LinkedList;

public class LetterS2 {
    public static void main(String[] args) {
        //инициализируем коллекцию LinkedList
        LinkedList<String> lettersStack = new LinkedList<>();

        lettersStack.push("A");
        lettersStack.push("B");
        lettersStack.push("C");
        lettersStack.push("D");

        System.out.println("LinkedList: " + lettersStack);
        System.out.println("Queue size " + lettersStack.size());
        //пока LinkedList не пустой
        while (!lettersStack.isEmpty()){
            //извлекаем из коллекции элементы
            System.out.println(lettersStack.pop());
        }
        //выводим содержимое
        System.out.println("LinkedList: " + lettersStack);
        //выводим размер
        System.out.println("Queue size " + lettersStack.size());
    }
}

