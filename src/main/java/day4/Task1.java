package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int size, moreThenEight, equalsToOne, sum, even, odd;
        moreThenEight = equalsToOne = sum = even = odd = 0;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        size = scanner.nextInt();
        Random random = new Random();

        array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            if (array[i] > 8)
                moreThenEight++;
            if (array[i] == 1)
                equalsToOne++;
            if (array[i] % 2 == 0)
                even++;
            else odd++;
        }

        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8 : " + moreThenEight);
        System.out.println("Количество чисел равных 1 : " + equalsToOne);
        System.out.println("Количество четных чисел : " + even);
        System.out.println("Количество нечетных чисел :" + odd);
        System.out.println("Сумма всех элементов массива: " + sum);
    }
}
