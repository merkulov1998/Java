package collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        /*List<String> list = new ArrayList<String>();
        list.add("Hello");
        list.add("World");
        //System.out.println(list.get(0));
        for(String s: list){
            System.out.println(s);
        }
        List<String> list2 = new LinkedList<String>();
        list2.add("One");
        list2.add("Two");
        for(String s: list2){
            System.out.println(s);
        }*/
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(1, "Four");

        System.out.println(map.get(3));
    }



    public static void saveToDb(List<String> list){

    }
}
