package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        /*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
                и если да, то будет ли он прямоугольным.

         */
 /*       System.out.println("Enter first corner:");
        Scanner first = new Scanner(System.in);
        int cornerFirst = first.nextInt();
        System.out.println("Enter second corner:");
        Scanner second = new Scanner(System.in);
        int cornerSecond = second.nextInt();
        if (cornerFirst == 90 || cornerSecond == 90 || cornerFirst + cornerSecond == 90){
            System.out.println("Triangle is rectangular");
        } else if((cornerFirst > 0) && (cornerSecond > 0) &&(cornerFirst + cornerSecond < 180)) {
            System.out.println("Triangle exists");
        } else {
            System.out.println("Triangle doesn't exist");
        }
        /*2. Найти max{min(a, b), min(c, d)}.*/
        System.out.println("Enter number a:");
        Scanner inputMinA = new Scanner(System.in);
        int minA = inputMinA.nextInt();
        System.out.println("Enter number b:");
        Scanner inputMinB = new Scanner(System.in);
        int minB = inputMinB.nextInt();
        int minAb = minA < minB ? minA : minB;
        System.out.println("Enter number c:");
        Scanner inputMinC = new Scanner(System.in);
        int minC = inputMinA.nextInt();
        System.out.println("Enter number D:");
        Scanner inputMinD = new Scanner(System.in);
        int minD = inputMinA.nextInt();
        int minCD = minC < minD ? minC : minD;
        int max = minAb > minCD ? minAb : minCD;
        System.out.println("max{min("+ minA+", "+minB+"), min("+minC+", "+minD+")}="+max);
    }
}
