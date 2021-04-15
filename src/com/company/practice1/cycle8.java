package com.company.practice1;

import java.util.Scanner;

public class cycle8 {
    public static void main(String[] args) {
        /*
        8. Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number:");
        long firstNum = input.nextLong();
        System.out.println("Enter the second number:");
        long secondNum = input.nextLong();
        allNum(firstNum);
        allNum(secondNum);

    }
    protected static void allNum(long num){
        long cur = 0;
        String str = "";
        for(long i = 0; i <= num; i++){
            cur = num % 10;
            str = str + cur + " ";
            num = num / 10;
            if (num < 10){
                str = str + num;
                i = num;
            }
        }
        String newStr = "";
        for(int i = 0; i < str.length(); i++){
            newStr = str.charAt(i) + newStr;
        }
        System.out.println(newStr);

    }
}
