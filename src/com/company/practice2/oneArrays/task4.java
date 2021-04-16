package com.company.practice2.oneArrays;

import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        /*
        4. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
         */
        int a=-100;
        int b=100;
        System.out.println("Enter N");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            int x = a + (int)(Math.random()*((b - a) + 1));;
            array[i] = x;
        }
        for(int i = 0; i < n; i++){
            if (array[i] > a) {
                a = array[i];
            }
            if (array[i] < b) {
                b = array[i];
            }

        }
        System.out.println("array of random numbers from -100 to 100");
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println("Maximal number in the array = " + a + ", minimum = " + b);

    }
}
