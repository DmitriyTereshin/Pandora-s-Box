package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        // int[] array = {6862, 5330, 1547, 9737, 6608, 6942, 1563, 8159, 5236, 296};
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }

        System.out.println(Arrays.toString(array));
        indexAndSum(array);
    }

    public static void indexAndSum(int[] array) {
        int maxSum = 0;
        int maxIndex = 0;

     /* int sum = 0;
        int count = 0;
        for (int i = 0; i < array.length - 2; i++) {
            sum += array[i];
            count++;
            if (count == 3) {
                if (sum >= maxSum) {
                    maxSum = sum;
                    maxIndex = i - 2;
                }
                sum = 0;
                count = 0;
                i -= 2;

            }
        }*/

        for (int i = 0; i < array.length - 2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3; j++) {
                sum += array[j];
            }

            if (sum >= maxSum) {
                maxSum = sum;
                maxIndex = i;
            }

        }
        System.out.println("Максимум среди сумм трех соседних элементов: " + maxSum);
        System.out.println("Индекс первого элемента тройки: " + maxIndex);
    }
}

