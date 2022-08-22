package oop;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Adult adult = new Adult();
        Child child = new Child();
        child.setFio("Ivanov Ivan Ivanovich");
        child.setSr("00009");
        Object o = new Object();
        System.out.println("child:"+adult);
        System.out.println("Child document:"+child.getDocument());
    }
}
