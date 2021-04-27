package com.company.practice2.oneArrays;

import java.util.Scanner;

public class task7 {
    /*
    7. Даны действительные числа а1, а2, ..., аn.
    Найти  max(a1 + a2n, a2 + a2n-1, ..., аn + an+1).
     */
    public static void main(String[] args) {
        System.out.println("Enter N:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[2*n];
        for(int i = 0; i < 2*n; i++){
            array[i] = (int) (Math.random()*10);
        }
        System.out.println("array of random numbers");
        for(int i = 0; i < 2*n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        int sum = array[0] + array[2 * n - 1];
        for (int i = 1; i < n - 1; i++) {
            int  curSum = array[i] + array[2*n - 1 - i];
            if (curSum > sum) {
                sum = curSum;
            }

        }
        System.out.println("Summa = " + sum);

    }
}

