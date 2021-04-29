package com.company.practice2.arraysOfArrays;

import java.util.Scanner;

public class task5 {
    /*
    5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
    1   1   1 ... 1   1
    2   2   2 ... 2   0
    3   3   3 ... 0   0
          ...
    n-1 n-1 0 ... 0   0
    n    0  0 ... 0   0
     */
    public static void main(String[] args) {
        System.out.println("Enter matrix's size:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[][] matrix = new int[n][n];
        int i = 0, j = 0;
        if( i==0 ) {
            for (i = 0; i < 1; i++) {
                for (j = 0; j < n; j++) {
                    matrix[i][j] = i+1;
                }
            }
        }
        if ( i > 0) {
            for (i = 1; i < n; i++) {
                for (j = 0; j < n - i; j++) {
                    matrix[i][j] = i + 1;
                }
                for (int k = n - i; k < n; k++) {
                    matrix[i][j] = 0;
                }
            }
            System.out.println();
        }
        System.out.println("Matrix:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
