package com.company.practice2.onearraysort;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    /*
    5. Сортировка вставками. Дана последовательность чисел a1, a2, ... ,an . Требуется переставить числа в порядке
возрастания. Делается это следующим образом. Пусть a1, a2, ... ,ai - упорядоченная последовательность, т. е.
a1<=a2<=...<=an. Берется следующее число ai+1 a и вставляется в последовательность так, чтобы новая
последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.
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

        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;
            sortIns(value, i, array);
        }
        System.out.println(Arrays.toString(array));

    }
    private static void sortIns(int value, int i, int[] array) {
        for (; i >= 0; i--) {
            if (value < array[i]) {
                array[i + 1] = array[i];
            } else {
                break;
            }
        }
        array[i + 1] = value;
    }

}