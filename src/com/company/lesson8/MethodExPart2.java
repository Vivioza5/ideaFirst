package com.company.lesson8;

import java.util.Arrays;

public class MethodExPart2 {
    public static void numOfArgs(int... a) {
        System.out.println(Arrays.toString(a));

    }
    public static void numOfArgs(int a, int... b) {
        System.out.println(Arrays.toString(b));

    }
    public static int numOfArgs(String str, int... b) {
        System.out.println(Arrays.toString(b));
        int a = 0;
        return a;
    }


    public static A minMaxReturn(int[]arr){
        A a = new A();

        a.min = arr[0];
        a.max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<a.min){
                a.min = arr[i];
            }
            if(arr[i]>a.max){
                a.max = arr[i];
            }
        }
        return a;
    }



    public static void main(String[] args) {
//        int arr [] = MethodsEx.loadArr(10);
//        MethodsEx.showArr(arr);

        int arr[] = {1,3,7,4,2,6,8,21,-4,-50};

        //numOfArgs(12, 12);
        //numOfArgs(1);

        A a1 = minMaxReturn(arr);
        System.out.println("MAX = " + a1.max);
        System.out.println("MIN = " + a1.min);


    }
}
