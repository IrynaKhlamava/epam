package com.company.practice2.arraysOfArrays;

import java.util.Scanner;

public class task10 {
    /*
    10. Найти положительные элементы главной диагонали квадратной матрицы.
     */
    public static void main(String[] args) {
        System.out.println("Enter size matrix");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Positive elements of diagonal of matrix:");
        for (int i = 0; i < n; i++) {
            if (matrix[i][i] > 0) {
                System.out.print(matrix[i][i] + " ");
            }
        }
    }
}
