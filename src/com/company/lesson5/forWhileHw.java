package com.company.lesson5;

import java.util.Scanner;

public class forWhileHw {
    public static void main(String[] args) {
//        Напечатать таблицу перевода 1, 2 ... 20 долларов США в гривны по текущему курсу (значение курса вводится с клавиатуры).

        Scanner scaner = new Scanner(System.in);
        System.out.println("Введите значение курса:");
        double curs = scaner.nextDouble();
        for (int i = 1; i <= 20; i++) {
            double dol;
            dol = curs * i;
            System.out.println("Стоимость " + i + " долларов" + " = " + dol);
        }

//        Найти:
//        Сумму всех чисел от 100 до 500;
        int sum = 0;
        for (int i = 100; i <= 500; i++) {

            sum += i;

        }


        System.out.println("The sum of all numbers 100 between 500: " + sum);

//        Сумму всех целых чисел от a до 500 (значение a вводится с клавиатуры a <=
        System.out.println("Введите значение A:");
        int a = scaner.nextInt();
        int sum2 = 0;
        if (a <= 500) {
            for (int i = a; i <= 500; i++) {

                sum2 += i;

            }
            System.out.println("The sum of all numbers " + a + " between 500: " + sum2);
        } else {
            System.out.println("This is wrong number!");
        }
//        Сумму всех четных чисел от a до b (значение a и b вводится с клавиатуры b >= a);
        System.out.println("Введите значение A:");
        int A = scaner.nextInt();
        System.out.println("Введите значение B:");
        int B = scaner.nextInt();
        int sum3 = 0;
        if (B >= A) {
            for (int i = A; i <= B; i++) {
                if ((i % 2) != 0) continue;
                sum3 += i;

            }
            System.out.println("The sum of all numbers " + A + " between " + B + ": " + sum3);
        } else {
            System.out.println("This is wrong number!");
        }

    }

}
