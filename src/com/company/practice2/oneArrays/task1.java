package com.company.practice2.oneArrays;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        /*1. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
    */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = input.nextInt();
        int[] A = new int[n];
        for(int i = 0; i < n; i++){
            A[i] = (int) (Math.random()*100);
        }
        System.out.println("Enter K");
        int sum = 0;
        int k = input.nextInt();
        for(int i = 0; i < n; i++){
            if (A[i] % k == 0){
                sum = sum + A[i];
            }
        }
        for(int i= 0; i < n; i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("Sum = "+sum);
    }

}
