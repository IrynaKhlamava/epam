package com.company.practice2.arraysOfArrays;

import java.util.Scanner;

public class task1 {
    /*
    1. Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
     */
    public static void main(String[] args) {
        System.out.println("Enter matrix's size:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = (int) (Math.random() * 100 - 50);
            }
        }
        System.out.println("Matrix from random numbers:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\nAll odd columns where first element > last element:");

        for (int i = 0; i < n; i++) {
            if (matrix[0][i] > matrix[n - 1][i] && i % 2 ==0) {
                System.out.print("Column №"+(i+1)+" ");
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[j][i] + " ");
                }
                System.out.println();
            }
        }
    }
}
