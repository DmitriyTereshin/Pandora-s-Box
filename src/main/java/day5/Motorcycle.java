package day5;

import static java.lang.Math.abs;

public class Motorcycle {
    private int year;
    private String model;
    private String color;

    public int getYear() {
        return year;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Motorcycle(int year, String model, String color) {
        this.year = year;
        this.model = model;
        this.color = color;
    }
}
