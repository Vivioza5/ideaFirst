package com.company.lesson6.homeworks;

import java.util.Random;
import java.util.Scanner;

public class arrChangePos {
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
        for (int i = 0; i < arr5.length; i++) {

            arr5[i] = random.nextInt((max - min) + 1) + min;
            System.out.println((i + 1) + " item = " + arr5[i]);

        }
        int temp = 0;
        for (int i = 0; i < arr5.length; i++) {
            if (i == 0) {
                temp = arr5[0];
                arr5[0] = arr5[3];
                arr5[3] = temp;
            }
            if (i == 1) {
                temp = arr5[1];
                arr5[1] = arr5[2];
                arr5[2] = temp;
            }
            System.out.println((i + 1) + " item = " + arr5[i]);
        }

    }
}
