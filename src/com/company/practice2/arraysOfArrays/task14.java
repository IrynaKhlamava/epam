package com.company.practice2.arraysOfArrays;

public class task14 {
    /*
    14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца.
     */
    public static void main(String[] args) {
        int m = 10;
        int n = 8;
        int[][] matrix = new int[m][n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                for(int k = 0; k < j+1; k++){
                    matrix[k][j]= 1;
                }
            }
        }
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
    }

}
