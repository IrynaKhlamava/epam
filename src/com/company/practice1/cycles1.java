package com.company.practice1;

import java.util.Scanner;

public class cycles1 {
    /*
    1. Напишите программу, где пользователь вводит любое целое положительное число.
    А программа суммирует все числа от 1 до введенного пользователем числа.
     */
    public static void main (String[] args){
        System.out.println("Enter a number:");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int sum = 0;
        for(int i = 1; i < a; i++){
            sum += i;
            System.out.print(i+" ");
        }
        System.out.println("="+sum);
    }
}
