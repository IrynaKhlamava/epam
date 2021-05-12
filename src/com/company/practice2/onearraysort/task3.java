package com.company.practice2.onearraysort;

import java.util.Arrays;
import java.util.Scanner;

public class task3 {
    /*
    3. Сортировка выбором. Дана последовательность чисел a1<=a2<=...<=an  .Требуется переставить элементы так,
чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
повторяется. Написать алгоритм сортировки выбором.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = input.nextInt();
        int[] array = new int[n];
        int maxInd = 0;
        for(int i = 0; i < n; i++){
            array[i] = (int)(Math.random()*50);
        }
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(array));

        for(int i = 0; i < array.length-1; i++) {
            maxInd = i;
            for (int k = i+1; k < array.length; k++) {
                if (array[k] > array[maxInd]) {
                    maxInd = k;
                }
            }
            int tempEl = array[maxInd];
            array[maxInd] = array[i];
            array[i]= tempEl;
        }
        System.out.println(Arrays.toString(array));

    }
}
