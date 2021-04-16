package com.company.practice2.oneArrays;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
       /* 3. Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
                положительных и нулевых элементов.

        */
        int pos=0, neg=0, zero=0;
        int a=-100;
        int b=100;
        System.out.println("Enter N");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        System.out.println("array of random numbers from -100 to 100");
        for(int i = 0; i < n; i++){
            int x = a + (int)(Math.random()*((b - a) + 1));;
            array[i] = x;
        }
        for(int i = 0; i < n; i++){
            if (array[i] > 0) {
                pos++;
            }
            if (array[i] < 0) {
                neg++;
            }
            if (array[i] == 0)  {
                zero++;
            }

        }
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(" Array contains: positive = " + pos + " negative = " + neg + " zero = " + zero);
    }
}
