package com.company;

import java.util.Scanner;

public class Main {

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
        double z = (( a - 3 ) * b / 2 ) + c;
        System.out.println("Value function z = ( (a – 3 ) * b / 2) + c = "+z);

        //2. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        // 𝑏+√𝑏2+4𝑎𝑐2𝑎−𝑎3𝑐+𝑏−2
        z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a , 3) + b - 2;
        System.out.println("Value function z = (b + Math.sqrt(b * b + 4 * a * c)) / 2 * a - Math.pow(a , 3) + b - 2 = "+z);

       // 3. Вычислить значение выражения по формуле (все переменные принимают действительные значения):
        // (𝑠𝑖𝑛𝑥+𝑐𝑜𝑠𝑦)/(𝑐𝑜𝑠𝑥−𝑠𝑖𝑛𝑦)∗𝑡𝑔 𝑥𝑦
        z = (Math.sin(a) + Math.cos(b))/(Math.cos(b) - Math.sin(b))* Math.tan(a * b);
        System.out.println("Value function z = ((Math.sin(a) + Math.cos(b))/(Math.cos(b) - Math.sin(b))* Math.tan(a * b) = "+z);

        //4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
        // Поменять местами дробную и целую части числа и вывести полученное значение числа.
        System.out.println("Enter the number R as nnn,ddd");
        Scanner inputR = new Scanner(System.in);
        double numR = inputR.nextDouble();
        double numReverse = (numR * 1000) % 1000 + (int)numR / 1000.0;
        System.out.println("Reverse R = " + numReverse);
        /*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSc.*/

        System.out.println("Enter natural number T:");
        Scanner inputT = new Scanner(System.in);
        long t = inputT.nextLong();
        long h, m, s;
        if (t >= 3600 ) {
            h = t / 3600;
            m = (t - h * 3600)/60;
            s = t  - (h * 3600 + m * 60);
            System.out.println(t+" seconds = " + h + "H: "+ m + "M: "+s + "S");
        } else {
            m = t /60;
            s = t  - m * 60;
            System.out.println(t+" seconds = " + " 0H:"+ m + "M: "+s + "S");
        }
    }
}
