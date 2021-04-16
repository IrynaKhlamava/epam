package com.company.practice2.oneArrays;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        /*
        5. Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter N:");
        int n = input.nextInt();
        int[] array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = (int) (Math.random()*10);
        }
        System.out.println("array of random numbers");
        for(int i = 0; i < n; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        for(int i = 0; i < n; i++){
            if(array[i] > i) System.out.print("array[ i ] = " + array[i]+ " > i = " + i + " , ");
        }
    }
}
