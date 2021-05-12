package com.company.practice2.onearraysort;

import java.util.Arrays;
import java.util.Scanner;

public class task4 {
    /*
    4. Сортировка обменами. Дана последовательность чисел a1<=a2<=...<=an .Требуется переставить числа в
порядке возрастания. Для этого сравниваются два соседних числа ai и аi+1. Если ai > аi+1, то делается
перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = input.nextInt();
        int[] array = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++){
            array[i] = (int)(Math.random()*50);
        }
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        for(int i = 0; i < array.length-1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    int tempEl = array[i];
                    array[i] = array[j];
                    array[j] = tempEl;
                    count++;
                }
            }
        }
        System.out.println();
        System.out.println(Arrays.toString(array));
        System.out.println();
        System.out.println("number of permutations = "+count);
    }
}

