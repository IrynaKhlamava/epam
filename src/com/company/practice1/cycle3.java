package com.company.practice1;

public class cycle3 {
    public static void main(String[] args) {
         /*
         3. Найти сумму квадратов первых ста чисел.
          */
        double sum = 0;
         for(int i = 1;i <= 100; i++){
           sum = sum + i * i;
             System.out.print(i+"*"+i+"+");
        }
        System.out.println(" sum="+sum);
    }
}
