package com.company.lesson5;

public class breakContinue {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 0; i < num; i++) {
            if (i * i > num) break;
            System.out.println(i);

        }
        int num1 = 10;
        for (int i = 0; i < num1; i++) {
            if (i == 5) continue;
            System.out.println(i);

        }
        for (int i = 0; i <50; i++) {
            if ((i % 2) !=0) continue;
            System.out.println(i);
        }

    }
}
