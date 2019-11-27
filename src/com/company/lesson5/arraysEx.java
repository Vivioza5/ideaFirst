package com.company.lesson5;

import java.util.Random;
import java.util.Scanner;

public class arraysEx {
    public static void main(String[] args) {

        int max, min;
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
//min=30;
//max =70;
// через потоки ввод рандома
//        int arr1[] = new int[5];
//        System.out.println("Заполните массив целыми числами!!");
//        for (int i = 0; i < arr1.length; i++) {
//
//            arr1[i] =   random.ints (10, (50 + 1)).limit(1).findFirst().getAsInt();
//            System.out.println((i + 1) + " item = " +arr1[i]);
//
//        }
        int arr5[] = new int[5];
        System.out.println("Заполните массив случайными числами, укажите диапазон двумя числами!!");
        System.out.println("enter first number: ");
        min= scanner.nextInt();
        System.out.println("enter second number: ");
        max= scanner.nextInt();
        for (int i = 0; i < arr5.length; i++) {

            arr5[i] = random.nextInt((max-min) + 1) + min;
            System.out.println((i + 1) + " item = " +arr5[i]);

        }
    }
}
