package com.company.practice1;

import java.util.Scanner;

public class cycle5 {
    /*
    5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид:an = 1/pow(2,n) + 1/pow(3,n)
     */
    public static void main(String[] args) {
        double a, sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter n");
        double n = in.nextDouble();
        System.out.println("Enter e");
        double e = in.nextDouble();
        for(int i = 0; i <= n; i++){
            a = 1 / Math.pow(2,i) + 1 / Math.pow(3,i);
           // System.out.print(a+" ");
            if (Math.abs(a) >= e){
                sum = sum + a;
                System.out.print(a+" ");
            }
        }
        System.out.println("sum="+sum);
    }
}
