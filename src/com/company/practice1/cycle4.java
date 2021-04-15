package com.company.practice1;

public class cycle4 {
    public static void main(String[] args) {
        /*
        4. Составить программу нахождения произведения квадратов первых двухсот чисел.
         */
        double multi = 1;
        for(int i = 1;i <= 200; i++){
            multi = multi * i*i;
           // System.out.print(i+"*"+i+"*");
        }
        System.out.println(" multiply="+multi);
    }
}
