package com.company.practice2.onearraysort;

import java.util.Arrays;
import java.util.Scanner;

public class task7 {
    /*
    7. Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и b1<=b2<=...<=bm .
Требуется указать те места, на которые нужно вставлять элементы последовательности b1<=b2<=...<=bm в первую
последовательность так, чтобы новая последовательность оставалась возрастающей.
     */
    public static void main(String[] args) {
        int ind = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of the sequence a:");
        int n = input.nextInt();
        System.out.println("Enter size of the sequence b:");
        int m = input.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        fillRandomNumbers(a, n);
        Arrays.sort(a);
        fillRandomNumbers(b, m);
        Arrays.sort(b);
        System.out.println("sorted sequence a :"+Arrays.toString(a));
        System.out.println("sorted sequence b :"+Arrays.toString(b));
        for(int i=0; i< a.length; i++){
            if (a[i]< b[0]){
                ind = i;
            }
            if (a[i] == b[0]){
                ind = i+1;
            }
        }
        System.out.println("start inserting numbers into the sequence a from the position = "+ ind);
    }

    private static void sortArray(int[] a) {
        
    }


    private static int[] fillRandomNumbers(int[] arr, int size) {
        for (int i = 0; i < size; i++) {
            arr[i] = (int) (Math.random() * 50);
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
