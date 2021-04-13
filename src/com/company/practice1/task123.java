package com.company.practice1;

import java.util.Scanner;

public class task123 {
    public static void main(String[] args) {
        // 1. Найдите значение функции: z = ( (a – 3 ) * b / 2) + c.

        System.out.println("Enter a value a");
        Scanner inputA = new Scanner(System.in);
        double a = inputA.nextDouble();
        System.out.println("Enter a value b");
        Scanner inputB = new Scanner(System.in);
        double b = inputB.nextDouble();
        System.out.println("Enter a value c");
        Scanner inputC = new Scanner(System.in);
        double c = inputC.nextDouble();
        double z = ((a - 3) * b / 2) + c;
        System.out.println("Value function z = ( (a – 3 ) * b / 2) + c = " + z);

        //2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        // 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2
        z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a , 3) + b - 2;
        System.out.println("Value function z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a , 3) + b - 2 = "+z);

        // 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        // (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔 𝑥𝑦
        z = (Math.sin(a) + Math.cos(b))/(Math.cos(b) - Math.sin(b))* Math.tan(a * b);
        System.out.println("Value function z = ((Math.sin(a) + Math.cos(b))/(Math.cos(b) - Math.sin(b))* Math.tan(a * b) = "+z);

    }
}
