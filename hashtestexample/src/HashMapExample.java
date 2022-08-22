import java.util.HashMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String,String> fruitBowl = new HashMap<>();//создание HashMap, содержащего 2 строковых значения

        addElements(fruitBowl);
        displayElements(fruitBowl);
        findElement(fruitBowl,"Banana");
    }

    static void addElements(HashMap<String,String> fruitBowl){//метод, принимающий HashMap в качестве параметра
        //добавление элементов(фруктов)
        fruitBowl.put("Apple","Green");
        fruitBowl.put("Chery","Red");
        fruitBowl.put("Orange","Orange");
        fruitBowl.put("Banana","Yellow");
    }

    static void displayElements(HashMap<String,String> fruitBowl){//метод, отображающий значения HashMap
        for (HashMap.Entry<String,String> fruit: fruitBowl.entrySet()
        ) {
            System.out.println("Fruit: " +fruit.getKey()+" Color: " + fruit.getValue());
        }
    }
    static void findElement(HashMap<String,String> fruitBowl, String fruit){//метод проверки содержимого
        if(fruitBowl.containsKey(fruit)){
            System.out.println("The " + fruit + " is " + fruitBowl.get(fruit));
        }else System.out.println("There is no " + fruit + " in the bowl");
    }
}

