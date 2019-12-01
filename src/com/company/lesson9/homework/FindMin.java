package com.company.lesson9.homework;

import java.util.Scanner;

public class FindMin {
    public static int InputFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите три числа!");
        System.out.println("enter first number: ");
        int min = scanner.nextInt();
        return min;
    }

    public static int InputSecond() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter second number: ");
        int min = scanner.nextInt();
        return min;
    }

    public static int InputThird() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter third number: ");
        int min = scanner.nextInt();
        return min;
    }

    public static void findMin(int a, int b, int c) {
        if (a < b && a < c) {
            System.out.println(a);
        } else if (b < c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        int a = InputFirst();
        int b = InputSecond();
        int c = InputThird();
        System.out.print("Наименьшее значение - ");
        findMin(a, b, c);
    }
}
