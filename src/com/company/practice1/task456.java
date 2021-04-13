package com.company.practice1;

import java.util.Scanner;

public class task456 {
    public static void main(String[] args) {
        //4. Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях).
        // Поменять местами дробную и целую части числа и вывести полученное значение числа.
        System.out.println("Enter the number R as nnn,ddd");
        Scanner inputR = new Scanner(System.in);
        double numR = inputR.nextDouble();
        double numReverse = (numR * 1000) % 1000 + (int) numR / 1000.0;
        System.out.println("Reverse R = " + numReverse);
        /*5. Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
        Вывести данное значение длительности в часах, минутах и секундах в следующей форме:
        ННч ММмин SSc.*/

        System.out.println("Enter natural number T:");
        Scanner inputT = new Scanner(System.in);
        long t = inputT.nextLong();
        long h, m, s;
        if (t >= 3600) {
            h = t / 3600;
            m = (t - h * 3600) / 60;
            s = t - (h * 3600 + m * 60);
            System.out.println(t + " seconds = " + h + "H: " + m + "M: " + s + "S");
        } else {
            m = t / 60;
            s = t - m * 60;
            System.out.println(t + " seconds = " + " 0H:" + m + "M: " + s + "S");
        }
        /*6. Для данной области составить линейную программу, которая печатает true, если точка с координатами
        (х, у) принадлежит закрашенной области, и false — в противном случае:
         */

        System.out.println("Enter coordinate X:");
        Scanner inputX = new Scanner(System.in);
        int x = inputX.nextInt();
        System.out.println("Enter coordinate Y:");
        Scanner inputY = new Scanner(System.in);
        int y = inputY.nextInt();
        if ((x >= -4 && x <= 4 && y >= -3 && y <= 0) || (y > 0 && x >= -2 && x <= 2)) {
            System.out.println("true");
        } else System.out.println("false");

    }
}