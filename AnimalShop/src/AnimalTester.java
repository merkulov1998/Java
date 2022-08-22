public class AnimalTester {
    public static void main(String[] args){
        Dog dog1 = new Dog ("Лопушок", "Пудель", "Гав-гав", 21.9, "Черный");
        Fish fish1 = new Fish ("Гуппи", "Горячая", "Серая");
        System.out.println("Имя песика: " + dog1.getName());
        System.out.println("Порода: " + dog1.getBreed());
        System.out.print("Лай: ");
        dog1.bark();
        System.out.println("Вес: " + dog1.getWeight());
        System.out.println("Цвет: " + dog1.getColour());
        System.out.println("");
        System.out.println("Вид рыбки: " + fish1.getBreed());
        System.out.println("Необходимая температура воды: " + fish1.getWaterType());
        System.out.println("Цвет: " + fish1.getColour());
    }
}
