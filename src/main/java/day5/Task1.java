package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();

        car.setYear(2010);
        car.setModel("Ford Focus");
        car.setColor("Red");

        System.out.println("Год выпуска машины: " + car.getYear());
        System.out.println("Модель машины: " + car.getModel());
        System.out.println("Цвет машины: " + car.getColor());
    }
}
