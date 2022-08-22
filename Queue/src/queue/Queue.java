package queue;

public class Queue<T> {
    private QueueElement<T> first;
    private QueueElement<T> last;

    public void put(T value){
        System.out.println("put method start");
        QueueElement newElement = new QueueElement(value);
        System.out.println("\tput value " + value);
        if(first == null){
            System.out.println("\tThis is a first element in a queue");
            first = newElement;
            last = newElement;
        }else{
            System.out.println("\tThis element will be placed after " + last.getValue());
            last.setNext(newElement);
            last = newElement;
        }
        System.out.println("put method end");
    }

    public T get(){
        System.out.println("get method start");
        if(first == null){
            System.out.println("\tQueue is empty");
            return null;
        }
        T value = first.getValue();
        System.out.println("\tValue to return is " + value);
        QueueElement nextElement = first.getNext();
        first = nextElement;
        if(first == null){
            System.out.println("\tQueue in now empty");
            last = null;
        }
        System.out.println("get method end");
        return value;
    }
}
