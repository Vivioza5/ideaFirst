package com.company.lesson4;

import java.util.Scanner;

public class changeNumber {

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
//
//        //Даны 4 числа типа int. Сравнить их и вывести
//        //наименьшее на консоль.
        int a, b, c, d, e;
        a = 45;
        b = 140;
        c = 50;
        d = 120;
        e = 250;

        if (a < b && a < c && a < d) {
            System.out.println(a);

        } else if (b < a && b < c && b < d) {
            System.out.println(b);
        } else if (c < a && c < b && c < d) {
            System.out.println(c);
        } else {
            System.out.println(d);
        }
////        Даны 5 чисел (тип int). Вывести вначале наименьшее, а
////        затем наибольшее из данных чисел
        int max1, min1, min2, max2, minAllNumbers, maxAllNumbers;
        min1 = Math.min(a, b);
        max1 = Math.min(a, b) == a ? b : a;
        max2 = Math.min(c, d) == c ? d : c;
        min2 = Math.min(c, d);
        minAllNumbers = Math.min(min1, min2);
        maxAllNumbers = Math.min(max1, max2) == max1 ? max2 : max1;
        System.out.println("MIN: " + " " + (Math.min(minAllNumbers, e) == e ? e : minAllNumbers));
        System.out.println("MAX: " + " " + (Math.max(maxAllNumbers, e) == e ? e : maxAllNumbers));
////      В условии требуется через операторы ветвления, в целях сокращения кода привел к тернарным операторам, изначально
////        написал через операторы ветвления, но получается для определения наибольшего числа надо такой же код, что увеличивает его обьем
//
////        if (Math.min(temp, e) == e) {
////            System.out.println(e);
////        } else {
////            System.out.println(temp);
////        }
////        if (Math.min(a, b) < Math.min(c, d) && Math.min(a, b) < e) {
////            System.out.println(Math.min(a, b));
////
////        } else if (Math.min(c, d) < e) {
////            System.out.println(Math.min(c, d));
////        }  else {
////            System.out.println(e);
////        }
//
////        Дано число месяца (тип int). Необходимо определить время года (зима, весна, лето, осень) и вывести на консоль.

        int month=5;
        switch (month){


            case 1:case 2:case 12:
                System.out.println("It's the month of winter");
                break;

            case 3:case 4:case 5:
                System.out.println("It's the month of Spring");
                break;
            case 6:case 7:case 8:
                System.out.println("It's the month of Summer");
                break;
            case 9:case 10:case 11:
                System.out.println("It's the month of Autumn");
                break;
            default:
                System.out.println("It's no number of month");
                break;

        }

//        1. Дано натуральное число. Определить:
//        a. Является ли оно четным
//        b. Оканчивается ли оно цифрой 7

        int number=8;
        System.out.println(number%2==0?"Это четное число": "Это нечетное число");
        System.out.println(number%10==0? "Это число заканчивается на 7": "Это число не заканчивается на семь");

//        2. Дано двузначное число. Определить:
//        a. Какая из его цифр больше: первая или вторая
//        b. Одинаковы ли его цифры

        int twoNumber=54;
         int numeral1= twoNumber/10;
         int numeral2 = twoNumber%10;
        if (numeral1>numeral2){
            System.out.println("First numeral1 is big: " + numeral1);
        }else if (numeral2 > numeral1){
            System.out.println("Second numeral2 is big: " + numeral2);
        } else {
            System.out.println("digits of this number are the same! " );
        }
//        3. Дано двузначное число. Определить:
//        a. Является ли сумма его цифр двузначным числом
//        b. Больше ли числа a сумма его цифр (не совсем логично, но пусть будет)

        System.out.println("сумма его цифр " + " " + (numeral1+numeral2 >= 10 ? "двузначное число" : "состоит из одной цифры"));
        System.out.println("сумма его цифр " + " " + (numeral1+numeral2 > twoNumber ? "Больше" : "меньше")+ " этого числа");

//        4. Дано трехзначное число. Определить какая из его цифр больше:
//        a. Первая или последняя
//        b. Первая или вторая
//        c. Вторая или последняя
//        проверки на то что число трехзначное A<999 || A>99
         int threeNumb =150;
         int firstNumeral = threeNumb / 100;
        int secondNumeral = threeNumb % 100 / 10;
        int thirdNumeral= threeNumb %10;
        System.out.println("Между первой и последней наибольшая " + " " + (firstNumeral>thirdNumeral? "первая" : "последняя") +" цифра этого числа " );
        System.out.println("Между первой и второй наибольшая " + " " + (firstNumeral>secondNumeral? "первая" : "вторая") +" цифра этого числа " );
        System.out.println("Между второй и последней наибольшая " + " " + (secondNumeral>thirdNumeral? "вторая" : "последняя") +" цифра этого числа " );



    }
}

