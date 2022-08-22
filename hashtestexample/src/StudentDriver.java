import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class StudentDriver {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>();
        //добавление студентов
        addStudent(arrayList);
        //вывод студентов
        displayStudent(arrayList);
        //сортировка студентов
        Collections.sort(arrayList);
        //вывод списка студентов
        System.out.println("Выводим новый список");
        displayStudent(arrayList);
    }

    static void displayStudent(ArrayList<Student> studentName){//вывод информации о студентах
        for (Student student:studentName
        ) {
            System.out.println(student);
        }
    }

    static void addStudent(ArrayList<Student> studentName){//добавление студентов
        studentName.add(new Student("Mark","Mywords",98));
        studentName.add(new Student("Andrew","Apic",45));
        studentName.add(new Student("Beth","Tween",78));
    }

}

