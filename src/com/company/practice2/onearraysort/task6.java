package com.company.practice2.onearraysort;

import java.util.Arrays;
import java.util.Scanner;

public class task6 {
    /*
    6. Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 . Если ai <= ai+1 , то продвигаются
на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = input.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 50);
        }
        System.out.println(Arrays.toString(array));
        System.out.println();

        sortShell(array);

        System.out.println(Arrays.toString(array));
    }

    private static void sortShell(int[] array) {
        for (int step = array.length / 2; step > 0; step /= 2) {
            for (int i = step; i < array.length; i++) {
                for (int j = i - step; j >= 0 && array[j] > array[j + step] ; j -= step) {
                    int x = array[j];
                    array[j] = array[j + step];
                    array[j + step] = x;
                }
            }
        }
    }

}

