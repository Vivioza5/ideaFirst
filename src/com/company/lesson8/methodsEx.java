package com.company.lesson8;

public class methodsEx {

    public static int Amount (int first, int second) {

      return first+second;

    }

    public  static  int countOfNum (int arr[]){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==5){
                count++;
            }

        }return count;
    }
        public static int [] loadArray (){
         int arr[] = new int [10];
            for (int i = 0; i <arr.length ; i++) {
                arr[i]= i+1;

            }
            return arr;
        }
        public  static void showArr(int arr[]){
            for (int i = 0; i <arr.length ; i++) {
                System.out.println(arr[i]+ " ,");
            }

        }

    public static void main(String[] args) {
        methodsEx.Amount(12,14);
        int num = methodsEx.countOfNum(methodsEx.loadArray());
        System.out.println(num);
    }
}
