package com.company.practice1;

import java.io.IOException;
import java.util.Scanner;

public class cycle6 {
/*
6. Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера.
 */
    public static void main(String[] args) throws IOException {
        int symbol;
       // Scanner in = new Scanner(System.in);
        System.out.println("Enter symbol");
        symbol= System.in.read();
        char ch = (char)symbol;
        System.out.println("symbol code "+ch+" = "+symbol);

}
}

