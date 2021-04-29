package com.company.practice2.arraysOfArrays;

import java.util.Scanner;

public class task2 {

    /*
    2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
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
        System.out.println("Diagonal elements");
        for (int i = 0; i < n; i++) {
            System.out.print(matrix[i][i] + " ");
            }
       }
}
