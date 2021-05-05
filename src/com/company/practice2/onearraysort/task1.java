package com.company.practice2.onearraysort;

import java.util.Arrays;

public class task1 {
    /*
    1. Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
дополнительный массив.
     */
    public static void main(String[] args) {
        int[] array1 = {5,10,20,30,11,13,17,39,23};
        int[] array2 = {56,6,7,8,15,64,89,57,2,14,6,1,31,45,55};
        int k = 9;
        String str = Arrays.toString(array1)+", "+k+", "+Arrays.toString(array2);
        System.out.println(str);
        str = str.replaceAll("[\\[\\]]","");
        System.out.println(str);

    }

}
