package com.company.practice2.oneArrays;

import java.util.Scanner;

public class task10 {
    /*
    10. Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
     */
    public static void main(String[] args) {
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
        for (int i = 0; i < n; i++) {
            if (i % 2 !=0){
                array[i] = 0;
            }
        }
        System.out.println("new array:");
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
