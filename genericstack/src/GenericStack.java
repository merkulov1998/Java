import java.util.ArrayList;
import java.util.List;

public class GenericStack<T> {

    private ArrayList<T> arrayList = new ArrayList<>();

    private int first;


    public GenericStack() {
        first = 0;
    }

    //При добавлении в наш стек записываем номер последнего эллемента и добавляем сам элемент в ArrayList
    public void push(T t){
        arrayList.add(t);
        first++;
    }

    //Удаление из нашего стека
    public T pop(){
        T tRet = null;
        try{
            //Проверяем, пуст ли наш лист. Если да, ловим ошибку
            if(isEmpty())throw new GenericStackException();
            //Записываем элемент, который удаляем из нашего листа
            tRet = arrayList.get(first-1);
            arrayList.remove(first-1);
            first--;
        }catch (GenericStackException e){
            e.printStackTrace();
        }
        return tRet;
    }

    public boolean isEmpty(){
        return first==0;
    }
}
