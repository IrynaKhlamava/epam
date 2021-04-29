package com.company.practice2.arraysOfArrays;

import java.util.Scanner;

public class task4 {
    /*
    4. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    1  2  3   ... n
    n n-1 n-2 ... 1
    1  2  3   ... n
    n n-1 n-2 ... 1
           ...
    n n-1 n-2 ... 1
     */
    public static void main(String[] args) {
        int elementMatrix = 1 ;
        System.out.println("Enter matrix's size:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    matrix[i][j] = elementMatrix++;
                } else {
                    matrix[i][j] = --elementMatrix;
                }

            }
            System.out.println();
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
