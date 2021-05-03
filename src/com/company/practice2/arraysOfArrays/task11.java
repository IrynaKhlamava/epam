package com.company.practice2.arraysOfArrays;

public class task11 {
    /*
    11. Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
которых число 5 встречается три и более раз.
     */
    public static void main(String[] args) {
        int count = 0;
        int[][] matrix = new int[10][20];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 20; j++){
                matrix[i][j] = (int)(Math.random()*15);
             }
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 20; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 20; j++){
                if(matrix[i][j] == 5){
                    count++;
                }
             }
            if (count >=3){
                System.out.print(" In line " + (i+1) + " number 5 is found 3 or more times\n");
            }
            count = 0;
        }
    }
}
