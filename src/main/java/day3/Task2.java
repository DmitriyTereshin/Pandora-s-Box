package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double dividend, divider;
        Scanner scanner = new Scanner(System.in);

        do {
            dividend = scanner.nextDouble();
            divider = scanner.nextDouble();

            if (divider == 0)
                break;
            System.out.println(dividend / divider);

        } while (true);

        scanner.close();
    }
}
