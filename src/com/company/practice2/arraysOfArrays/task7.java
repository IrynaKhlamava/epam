package com.company.practice2.arraysOfArrays;

import java.util.Scanner;

public class task7 {
    /*
    7. Сформировать квадратную матрицу порядка N по правилу:
    a[i][j] = sin ((i2 - j2)/n)
    и подсчитать количество положительных элементов в ней.
     */
    public static void main(String[] args) {
        int posElement = 0;
        System.out.println("Enter matrix's size:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double[][] matrix = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j]= Math.sin((Math.pow(i,2)-Math.pow(j,2))/n);
            }
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ( matrix[i][j] > 0){
                    posElement++;
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
        System.out.println("\nPositive elements in matrix = "+posElement);
    }
}

