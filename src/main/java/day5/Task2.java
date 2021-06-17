package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle(2015, "Honda Gold Wing", "Black");

        System.out.println("Год выпуска мотоцикла: " + motorcycle.getYear());
        System.out.println("Модель мотоцикла: " + motorcycle.getModel());
        System.out.println("Цвет мотоцикла: " + motorcycle.getColor());
    }
}
