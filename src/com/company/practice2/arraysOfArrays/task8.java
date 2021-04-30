package com.company.practice2.arraysOfArrays;

import java.util.Scanner;

public class task8 {
    /*
    8. В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
пользователь с клавиатуры.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter matrix's size");
        int n = input.nextInt();
        System.out.println("Enter first column number to replace");
        int col1 = input.nextInt();
        System.out.println("Enter second column number to replace");
        int col2 = input.nextInt();
        int tempElement = 0;
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
        for (int i = 0; i < n; i++) {
                tempElement = matrix[i][col1-1];
                 matrix[i][col1-1] = matrix[i][col2-1];
                 matrix[i][col2-1] = tempElement;
        }
        System.out.println("New Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
