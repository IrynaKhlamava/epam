package com.company.practice2.oneArrays;

import java.util.Scanner;

public class task8 {
    /*
    8. Дана последовательность целых чисел a1,a2 , ,an . Образовать новую последовательность, выбросив из
исходной те члены, которые равны min( a1,a2 , ,an).
     */
    public static void main(String[] args) {
        int min = 0;
        System.out.println("Enter N:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 10 - 5);
        }
        System.out.println("array of random numbers");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if ( array[i] < min ){
                min = array[i];
            }
        }

         System.out.println("min = " + min);
         System.out.println();
         for (int i = 0; i < n; i++) {
             if ( array[i] != min ){
                System.out.print(array[i] + " ");
             }
     }

    }
}
