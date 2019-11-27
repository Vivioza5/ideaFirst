package com.company.lesson6;

public class arraysEx {
    public static void main(String[] args) {

        String car1 = "Toyota";
        String car2 = "tesla";
        int array[] = new int[10];// create empty array
        String strArr[]={"Hello","world","Toyota"}; // array 3 elements
        array = new int[]{1,2,3,4,5};
        System.out.println(strArr[2]);
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(strArr[i]);
        }

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
