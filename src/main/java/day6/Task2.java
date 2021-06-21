package day6;

public class Task2 {
    public static void main(String[] args) {
        Airplane airplane = new Airplane("Boeing", 1995, 70, 200);

        airplane.setYear(2005);
        airplane.setLength(80);
        airplane.fillUp(10000);
        airplane.fillUp(25000);
        airplane.info();
    }
}
