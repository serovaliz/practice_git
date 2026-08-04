package org.example;

import java.util.Scanner;

public class JavaPracticeHW {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;

        int c = a + b;
        System.out.println(c);

        int d = a * b;
        System.out.println(d);
        int e = b / a;
        System.out.println(e);


        int f = 10;
        double g = 2.5;

        System.out.println(g/f);

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите ваш возраст");
        int x = sc.nextInt();
        if (x >= 14 && x <= 59) {
            System.out.println("Нужно бы ходить на работу!");
        } else
        {
            System.out.println("можно отдыхать!");
        }

        //Переполнение

        int maxInt = Integer.MAX_VALUE;  // 2_147_483_647
        System.out.println("Integer.MAX_VALUE = " + maxInt);
        int overflowInt = maxInt + 1;
        System.out.println("MAX_VALUE + 1 = " + overflowInt + " (переполнение, результат отрицательный)");



    }
}
