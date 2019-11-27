package com.company.lesson7;

import java.util.Arrays;

public class arraysEx {
    public static void main(String[] args) {

        int arr[] = {23, 5, 1, 7, 9, 21, 4};


        String str = Arrays.toString(arr);

        System.out.println(str);

        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));


        //Arrays.fill(arr, 12);

        int arr1[] = {71,45};
        arr1 = Arrays.copyOf(arr, arr.length + 2 );
        //arr1 = Arrays.copyOfRange(arr, 2, 5);
        int res = Arrays.binarySearch(arr, 19);

        boolean bool = Arrays.equals(arr, arr1);

        System.out.println(Arrays.toString(arr1));
        System.out.println(res);
        System.out.println(bool);
    }
}
