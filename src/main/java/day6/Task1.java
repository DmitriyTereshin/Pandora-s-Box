package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setYear(1985);

        Motorbike motorbike = new Motorbike( "Suzuki", "Blue", 2015);

        car.info();
        System.out.println("Разница между переданным годом и годом выпуска транспортного средства: "
                + car.yearDifference(2025));


        motorbike.info();
        System.out.println("Разница между переданным годом и годом выпуска транспортного средства: "
                + motorbike.yearDifference(2045));
    }
}
