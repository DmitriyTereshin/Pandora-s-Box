package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int a, b;
        int count;

        Scanner scanner = new Scanner(System.in);
        a = scanner.nextInt();
        b = scanner.nextInt();

        if (a >= b)
            System.out.println("Некорректный ввод");

        count = a + 1;
        while (count < b) {
            if ((count % 5 == 0) && (count % 10 != 0)) {
                System.out.print(count + " ");
            }
            count++;
        }

    }
}
