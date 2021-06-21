package day6;

import static java.lang.Math.abs;

public class Motorbike {

    private final int year;
    private final String model;
    private final String color;

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Motorbike(String model, String color, int year) {
        this.year = year;
        this.model = model;
        this.color = color;
    }

    public void info() {
        System.out.println("Это мотоцикл");
    }

    public int yearDifference(int inputYear) {
        return abs(this.year - inputYear);
    }
}


