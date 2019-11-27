package com.company.lesson6.homeworks;

import java.util.Random;
import java.util.Scanner;
//    2. Дан массив:
//Умножить все элементы на последний элемент.
public class arrMultiLast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int min, max;
        int[] arr5 = new int[4];
        System.out.println("Заполните массив случайными числами, укажите диапазон двумя числами!!");
        System.out.println("enter first number: ");
        min = scanner.nextInt();
        System.out.println("enter second number: ");
        max = scanner.nextInt();
        int last= (arr5.length-1);
        for (int i = 0; i < arr5.length; i++) {

            arr5[i] = random.nextInt((max - min) + 1) + min;
            System.out.println((i + 1) + " item = " + arr5[i]);

        }
        for (int i = 0; i < arr5.length; i++) {
            arr5[i]=arr5[i]*arr5[last];
            System.out.println((i + 1) + " item  * last number of array = " + arr5[i]);
        }
    }
}
