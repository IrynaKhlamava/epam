package com.company.practice1;

import java.util.Scanner;

public class cycle2 {
    /*
    2. Вычислить значения функции на отрезке [а,b] c шагом h: y = x, x > 2
    y = -x, x<=2
     */
    public static void main(String[] args){
        double a, b, h, x, y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a:");
        a = input.nextDouble();
        System.out.println("Enter b:");
        b = input.nextDouble();
        System.out.println("Enter h:");
        h = input.nextDouble();
        for(x = a; x < b; x+=h){
            if(x <= 2){
                y = -x;
                System.out.println(y);
            }else{
                System.out.println(x);
            }
        }

    }
}
