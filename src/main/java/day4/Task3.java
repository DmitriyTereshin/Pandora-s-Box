package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] matrix = new int[12][8];
        Random random = new Random();

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = random.nextInt(50);
            }
        }
      /*  matrix[0][0] = 5;
        matrix[0][1] = 5;
        matrix[0][2] = 5;
        matrix[1][0] = 5;
        matrix[1][1] = 2;
        matrix[1][2] = 5;
        matrix[2][0] = 5;
        matrix[2][1] = 5;
        matrix[2][2] = 5; */

        System.out.println(Arrays.deepToString(matrix));
        index(matrix);
    }

    public static void index(int[][] array) {
        int maxSum = 0;
        int maxIndex = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum >= maxSum) {
                maxSum = sum;
                maxIndex = i;
            }
        }

        System.out.println("Индекс строки, сумма чисел в которой максимальна: " + maxIndex);


    }
}
