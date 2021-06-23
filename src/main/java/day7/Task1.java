package day7;

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 1985, 85, 200);
        Airplane airplane2 = new Airplane("Tupolev", 1975, 90, 150);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}