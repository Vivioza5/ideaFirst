package com.company.lesson5;

import java.util.Scanner;

public class practice {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.print(20 +" ");
        }
        System.out.println();
        System.out.println("Enter any number: ");
        int num = scanner.nextInt();
        System.out.println("how many:");
        int count= scanner.nextInt();
        for (int i = 0; i <count ; i++) {
            System.out.print(num + " ");

        }
        System.out.println();

        for (int i = 2; i <20 ; i++) {
            double cost= 24.5;
            cost*=i;
            System.out.println("Cost " +i+ " item = " +cost );
        }
        System.out.println("Enter any number A: ");
        int a =scanner.nextInt();
        System.out.println("Enter any number B: ");
        int b =scanner.nextInt();

        int sum =0;
        if (a<b && b>=100){
            for (int i = a; i < b; i++) {
                sum+=i;


            }
            System.out.println("среднее арифмитическое: " + sum/(b-a));
        }else {
            System.out.println("error enter number");

        }



    }
}
