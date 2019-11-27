package com.company.lesson6.homeworks;

import java.util.Random;
import java.util.Scanner;

//Создать массив целых чисел на 10 элементов. Запомнить его случайными числами в диапазоне от 10 до 100.
//        Вывести массив на экран. Вывести сумму всех элементов массива.

public class arrSumAll {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min, max;
        int[] arr5 = new int[10];
        System.out.println("Заполните массив случайными числами, укажите диапазон двумя числами!!");
        System.out.println("enter first number: ");
        min = scanner.nextInt();
        System.out.println("enter second number: ");
        max = scanner.nextInt();
        if (min==10&& max==100){
            int last= (arr5.length-1);
            for (int i = 0; i < arr5.length; i++) {

                arr5[i] = random.nextInt((max - min) + 1) + min;
                System.out.println((i + 1) + " item = " + arr5[i]);

            }
            int sum=0;
            for (int i = 0; i < arr5.length; i++) {
                sum+=arr5[i];

            }
            System.out.println(" Summary  numbers of this  array = " +sum);
        } else {
            System.out.println("You enter wrong numbers");
        }

    }
}
