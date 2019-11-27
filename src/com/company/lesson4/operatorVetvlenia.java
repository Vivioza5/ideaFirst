package com.company.lesson4;

public class operatorVetvlenia {
    public static void main(String[] args) {

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
//        Даны 5 чисел (тип int). Вывести вначале наименьшее, а
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


    }
}
