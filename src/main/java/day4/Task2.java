package day4;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(array));
        max(array);
        min(array);
        zeroEnds(array);

    }

    public static void min(int[] array) {
        int min = array[0];

        for (int i : array) {
            if (i < min)
                min = i;
        }
        System.out.println("Наименьший элемент массива: " + min);
    }

    public static void max(int[] array) {
        int max = array[0];

        for (int i : array) {
            if (i > max)
                max = i;
        }
        System.out.println("Наибольший элемент массива: " + max);
    }

    public static void zeroEnds(int[] array) {
        int number = 0;
        int sum = 0;

        for (int i : array) {
            if (String.valueOf(i).endsWith("0")) {
                sum += i;
                number++;
            }
        }
        System.out.println("Количество элементов массива, оканчивающихся на 0: " + number);
        System.out.println("Сумма элементов массива, оканчивающихся на 0: " + sum);
    }
}
