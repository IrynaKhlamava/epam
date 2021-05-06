package com.company.practice2.onearraysort;

import java.util.Arrays;

public class task2 {
    /*
    2. Даны две последовательности a1<=a2<=...<=an  b1<=b2<=...<=bm .
    Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
    Примечание. Дополнительный массив не использовать.
     */
    public static void main(String[] args) {
        int[] a = {1,2,3,4,5,7,8,9,10,14,16,19,20,21,22};
        int[] b = {34,35,41,45,47,48,52,57,58,64,75};
        String str = Arrays.toString(a)+", "+Arrays.toString(b);
        System.out.println(str);
        str = str.replaceAll("[\\[\\]]","");
        System.out.println(str);
    }
}
