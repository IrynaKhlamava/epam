package com.company.practice2.oneArrays;

import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        /*
        6. Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами.
         */
        double sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = input.nextInt();
        double[] array = new double[n];
        for(int i = 0; i < n; i++){
            array[i] = (Math.random()*10);
        }
        System.out.println("array of random numbers");
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        for(int i = 0; i < n; i++){
            for(int j = i; j > 0; j --){
                if( i % j == 0 ) {
                    count++;
                }
            }
            if (count == 2){
                sum = sum + array[i];
           }
            count = 0;
        }
        System.out.println();
        System.out.print("sum = " + sum);
    }
}
