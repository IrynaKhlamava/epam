package com.company.practice2.arraysOfArrays;

import java.util.Scanner;

public class task12 {
    /*
12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.
     */
    public static void main(String[] args) {
        int tempElement = 0, min = 0;
        System.out.println("Enter size matrix");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                matrix[i][j] = (int)(Math.random()*50);
            }
        }
        System.out.println("Matrix from random numbers:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (matrix[i][j] > matrix[i][k]) {
                        tempElement = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = tempElement;

                    }
                }
            }
        }
        System.out.println("Matrix rows were sorted in ascending order");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (matrix[i][j] < matrix[i][k]) {
                        tempElement = matrix[i][j];
                        matrix[i][j] = matrix[i][k];
                        matrix[i][k] = tempElement;

                    }
                }
            }
        }
        System.out.println("Matrix rows were sorted in ascending order");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}

