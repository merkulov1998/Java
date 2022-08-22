public class Main {
    public static void main(String[] args) {
        GenericStack<Integer> genericStack = new GenericStack<>();
        System.out.println(genericStack.pop());
        System.out.println("Пуст ли стек? " + genericStack.isEmpty());
        System.out.println("Добавим элементы в наш стек");
        //Добавляем элементы в наш стек
        genericStack.push(4);
        genericStack.push(3);
        genericStack.push(2);
        genericStack.push(1);
        System.out.println("Пуст ли стек Сейчас?  " + genericStack.isEmpty());
        //Удаляем и выводим из нашего стека элементы, и выводим один лишний, чтобы проверить наше исключение
        for (int i = 0; i < 5; i++) {
            System.out.println(genericStack.pop());
        }
    }
}
