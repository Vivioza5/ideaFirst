package com.company.lesson6;

import java.util.Random;
import java.util.Scanner;

public class arrayPract {

    public static void main(String[] args) {
//        заполнение массива
        int arr[] = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("item [ " + i + "]: " + arr[i]);
        }

//        ex2
        int max, min;

        Scanner scanner = new Scanner(System.in);
        int arr1[] = new int[5];
        System.out.println("Заполните массив целыми числами!!");
        for (int i = 0; i < arr1.length; i++) {
            System.out.println((i + 1) + " item = ");
            arr1[i] = scanner.nextInt();


        }
        min = max = arr1[0];

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > max) {
                max = arr1[i];
            }
            if (arr1[i] < min) {
                min = arr1[i];
            }
        }
        System.out.println("MAX= " + max + " " + "Min = " + min);

        int arrRandom[]= new int[10];
        for (int i = 0; i <arrRandom.length ; i++) {
            arrRandom[i]= 10+(int)(Math.random()*50);
            System.out.println((i + 1) + " item = " +arrRandom[i]);
        }

    }
}
