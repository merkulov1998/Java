package queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> stringQueue = new Queue();

        stringQueue.put("Hello");
        //stringQueue.put(1);
        stringQueue.put("Beautiful");
        //stringQueue.put(2);
        stringQueue.put("World");
       // stringQueue.put(3);
       /* Object obj = q.get();
        if(obj instanceof String){

        }else if(obj instanceof Long){

        }
        */
        String s = stringQueue.get();
        System.out.println(stringQueue.get());
        System.out.println(stringQueue.get());
        System.out.println(stringQueue.get());

        Queue<Integer> intQueue = new Queue();
        intQueue.put(1);
        intQueue.put(2);
        intQueue.put(3);

        System.out.println(intQueue.get());
        System.out.println(intQueue.get());
        System.out.println(intQueue.get());
    }
}
