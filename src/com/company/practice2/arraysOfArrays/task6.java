package com.company.practice2.arraysOfArrays;

import java.util.Scanner;
import java.util.jar.JarEntry;

public class task6 {
    /*
    6. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    1 1 1 ... 1 1 1
    0 1 1 ... 1 1 0
    0 0 1 ... 1 0 0
          ...
    0 0 1 ... 1 0 0
    0 1 1 ... 1 1 0
    1 1 1 ... 1 1 1
     */
    public static void main(String[] args) {
        System.out.println("Enter matrix's size:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n /2 ; i++) {
                matrix[i][i] = 1;
                matrix[i][n-i-1] = 1;
                for (int k = i + 1; k < n-i-1; k++) {
                    matrix[i][k] = 1;
                }
        }
        for (int i = n-1 ; i >= n /2 ; i--) {
            matrix[i][i] = 1;
            matrix[i][n-i-1] = 1;
            for (int k = i-1; k > n-i-1; k--) {
                matrix[i][k] = 1;
            }
        }
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
  }
}
