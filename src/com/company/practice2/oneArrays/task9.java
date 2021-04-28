package com.company.practice2.oneArrays;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        /*
        9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
        Если таких чисел несколько, то определить наименьшее из них.
         */
        int num1, countTimes = 0, maxCountTimes = 0, maxNum = 0, maxNum2 = 0, min = 0, ind = 0, indI = 0;
        boolean isTrue = false;
//      int[] array = {-4,-3,-3,-4,3,3,-4,0,3,-3,3};
        System.out.println("Enter N:");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = (int) (Math.random() * 100 - 50);
        }
        System.out.println("array of random numbers");

        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }

        for (int i = 0; i < n; i++) {
            num1 = array[i];
            for(int j = 0; j < n; j++) {
                if (array[j] == num1) {
                    countTimes++;
                    ind = j;
                }
            }
            if (countTimes == maxCountTimes && array[ind] != array[indI] && array[ind]!=maxNum && array[ind]!=maxNum2){
                maxNum2 = num1;
                indI = i;
                isTrue = true;
            }
            if(countTimes > maxCountTimes){
                maxCountTimes = countTimes;
                maxNum = num1;
                min = maxNum;
            }
            if (isTrue){
                if (maxNum2 < maxNum){
                    min = maxNum2;
                    maxNum = min;
                    isTrue = false;
                }else{
                    min = maxNum;
                    isTrue = false;
                }
            }
            countTimes = 0;
        }
        System.out.println("\nMin Number = " + min + " was found "+ maxCountTimes);
    }
}
