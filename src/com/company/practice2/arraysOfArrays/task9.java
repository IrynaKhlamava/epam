package com.company.practice2.arraysOfArrays;

import java.util.Scanner;

public class task9 {
    /*
    9. Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
столбец содержит максимальную сумму.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix's size");
        int n = input.nextInt();
        int maxSum = 0, maxSumCol = 0, numCol = 0;
        int[][] matrix = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("Matrix from random numbers:");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int j = 0;

        for (int i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                maxSumCol += matrix[j][i];

            }
            if(maxSumCol > maxSum){
                maxSum = maxSumCol;
                numCol = i+1;
            }
            maxSumCol = 0;
        }

        System.out.println("Max sum = "+ maxSum + " in column №" + numCol);
    }
}
