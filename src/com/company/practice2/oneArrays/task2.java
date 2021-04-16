package com.company.practice2.oneArrays;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        /*
        2. Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены,
        большие данного Z, этим числом. Подсчитать количество замен.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = input.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = (int) (Math.random()*100);
        }
        System.out.println("Enter Z");
        int count = 0;
        int z = input.nextInt();
        for(int i = 0; i < n; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            if (A[i] > z){
                A[i] = z;
                count++;
            }
        }
        for(int i= 0; i < n; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("Count = "+count);
    }
}
