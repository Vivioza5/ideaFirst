package com.company.lesson5;

public class loopEx2 {
    public static void main(String[] args) {
//        double num, root, error;
//        for (num = 1.0; num <100 ; num++) {
//            root=  Math.sqrt(num);
//            System.out.println("Корень из числа "+ num+ " равен " + root);
//            error= num-(root*root);
//            System.out.println("Ошибка округления " + error);
//        }
        int i, j;
        for ( i = 0, j=10; i < j; i++, j--) {
            System.out.println("i and J = " + i + " "+ j);

        }
        int sum=0;
        for (int k = 0; k < 10; sum+= k++);
        System.out.println("Summa = " + sum);

//        while
        char ch= 'a';

        while (ch<='z'){
            System.out.println(ch+ " ");
            ch++;
        }
        int i2=100;
        int j2=200;
        int count=0;
        while (++i2<--j2);
        System.out.println("Среднее значение = " + i2);
//        вложенные циклы
        int pow, rez;
        for (int e = 0; e <10 ; e++) {
            rez=1;
            pow= e;
            while(pow>0) {
                rez*=2;
                pow--;

            }


            System.out.println("2  в степени " + e + " равно "+ rez);
        }
    }
}
