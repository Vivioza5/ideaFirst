package com.company.lesson6.homeworks;

import java.util.Random;
import java.util.Scanner;

//Создать массив целых чисел на 10 элементов. Заполнить его случайными числами в диапазоне от 0 до 10. Вывести массив на экран. Найти наибольшее значение и его индекс.
public class arrFindNegative {



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
        if (min == -10 && max == 10) {
            for (int i = 0; i < arr5.length; i++) {

                arr5[i] = random.nextInt((max - min) + 1) + min;
                System.out.println((i + 1) + " item = " + arr5[i]);


            }
            int arrMax = arr5[0];
            int itemInd = 0;
            int countNegative = 0;
            int[] arrInt = new int[]{};
            System.out.println("index of negative numbers:");
            for (int i = 0; i < arr5.length; i++) {
                if (arr5[i] < 0) {
                    countNegative++;
                    System.out.print((i + 1) + ", ");

                }

            }
            System.out.println(" ");
            System.out.println("Count of negative numbers =  " + countNegative);
        } else {
            System.out.println("You enter wrong numbers");
        }

    }
}
