package com.company.lesson4;

import java.util.Scanner;

public class preobrTipov {

//    В трехзначном числе зачеркнули его последнюю цифру. В оставшимся двухзначном числе переставили цифры.
//    Затем приписали к ним слева последнюю цифру числа x, то получили число 654. Какое число было изначальным? Вывести его на экран.
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int anyNumber = scanner.nextInt();
        int num = 654;
        int second = num % 100 / 10;
        int third = num / 100;
        System.out.println(third);
        System.out.println(second);
        int num1 = third * 100 + second * 10 + anyNumber;
        System.out.println(num1);

        scanner.close();
    }
}
