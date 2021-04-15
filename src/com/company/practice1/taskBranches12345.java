package com.company.practice1;

import java.util.Scanner;

public class taskBranches12345 {
    public static void main(String[] args) {
    /*1. Даны два угла треугольника (в градусах). Определить, существует ли такой треугольник,
                и если да, то будет ли он прямоугольным.

         */
        System.out.println("Enter first corner:");
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


/*3. Даны три точки А(х1,у1), В(х2,у2) и С(х3,у3). Определить, будут ли они расположены на одной прямой.
 */
        int x3 = -2;
        int y3 = 5;
        int x2 = 4;
        int y2 = 3;
        int x1 = 1;
        int y1 = -1;
        if ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1)){
            System.out.println("On one line");
        } else {
            System.out.println("Not on one line");
        }
        /* 4. Заданы размеры А, В прямоугольного отверстия и размеры х, у, z кирпича. Определить, пройдет ли кирпич через отверстие.
            */
            int sizeA = 35;
            int sizeB = 20;
            int sizeX = 100;
            int sizeY = 100;
            int sizeZ = 10;
            if ((sizeA >= sizeX && sizeB >= sizeY) || (sizeA >= sizeY && sizeB >= sizeX) ||
                    (sizeA >= sizeX && sizeB >= sizeZ) || (sizeA >= sizeZ && sizeB >= sizeX)
                    || (sizeA >= sizeZ && sizeB >= sizeY)|| (sizeA >= sizeY && sizeB >= sizeZ)){
                System.out.println("brick will pass");
            } else{
                System.out.println("brick won't pass");
            }

        /*       5. Вычислить значение функции:
        Math.pow(x,2)-3*x +9, x<=3
        1/((Math.pow(x,3)+6), x>3

  */
            int x=3;
            if(x <= 3) {
                System.out.println("result="+(Math.pow(x,2)-3*x +9));
            }else if(x>3){
                System.out.println("result="+(1/((Math.pow(x,3)+6))));
            }


}
}

