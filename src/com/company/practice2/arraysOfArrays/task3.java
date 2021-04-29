package com.company.practice2.arraysOfArrays;

import java.util.Scanner;

public class task3 {
    /*
        3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
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
        System.out.println("Enter number row and column from 0 to "+n + " to display:");
        int k = input.nextInt();
        int p = input.nextInt();

        System.out.println("Row number " + k + ":");
        for (int i = k-1; i <= k-1; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        System.out.println("\nColumn number " + p + ":");
        for (int i = 0; i < n; i++) {
            for (int j = p-1; j <= p-1; j++) {
                System.out.println(matrix[i][j] + " ");
            }
        }

    }
}