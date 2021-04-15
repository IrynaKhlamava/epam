package com.company.practice1;

import java.util.Scanner;

public class cycle7 {
    /*
    7. Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
m и n вводятся с клавиатуры.
     */
    public static void main(String[] args) {
        int m, n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the beginning of interval m:");
        m = input.nextInt();
        System.out.println("Enter the end of interval n:");
        n = input.nextInt();
        int j, cur;
        for(int i = m; i <= n; i++){
            for(j = i; j>1; j--){
                cur = j-1;
                if (i % cur == 0 && cur > 1){
                    System.out.print("Divisor for "+ i +" is "+ cur + "; ");
                }
            }
            System.out.println();
        }
    }
}
