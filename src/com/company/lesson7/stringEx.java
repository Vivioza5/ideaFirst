package com.company.lesson7;

import java.util.Arrays;

public class stringEx {
    public static void main(String[] args) {

    String str1 = "Hello =)";
    String str2 = new String("Hello =)");

    char chArr[] = {'a', 'b','c'};

    String str3 = new String(chArr);
    String str4 = Arrays.toString(chArr);

        System.out.println(str1 == str2);//Сравнение ссылок
        System.out.println(str1.equals(str2));//Содержимое обьектов

        System.out.println(str1.charAt(str1.length()-1));//Получаем символ по индексу

        System.out.println(str1.concat(str3));

        System.out.println(str1 = str1.concat(str3));//Hello =)abc

        System.out.println(str1);

    String [] arr1 = {"Hello", "=)"};
        System.out.println(Arrays.toString(arr1));



        for (String str: arr1){
        System.out.println(str);
    }

    int [] num = {4,6,2,35,7,2};

        for (int i = 0; i < num.length; i++) {

        System.out.print(num[i] + " ");
    }
        System.out.println();

        for (int i: num){
        System.out.print(i + " ");
    }

        System.out.println();

    char ch[] = str1.toCharArray();

        System.out.println(Arrays.toString(ch));

        System.out.println(str1.endsWith("abc"));

//        int count = 0;
//        if(str1.endsWith("abc")){
//            count++;
//        }

        System.out.println(str1.startsWith("Hello"));

        System.out.println(str1.replace(')', '('));

        System.out.println(str1.indexOf('H'));
        System.out.println(str1.substring(6,8));
        System.out.println(str1.contains("=)"));

//        System.out.println(str1);
//        System.out.println(str2);

    String s = "123456";
        System.out.println(str1.compareTo(str1));
//        String []string = str1.split(str2);

//        System.out.printf("");
//        String.format("")
        System.out.println(str1.toUpperCase());




}
}
