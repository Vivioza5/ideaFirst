package com.company.lesson9.homework;




public class Palindroms {


    public static boolean testWords(String first) {
        StringBuffer text1 = new StringBuffer(first);
        StringBuffer testtext = text1.reverse();
        String testtext2 = testtext.toString();
        String text2 = new String(first);
        boolean test = text2.equals(testtext2);
        return test;
    }
//методы ввода выведены в отдельный класс InputMethods для удобства доступа из нескольких классов
    public static void main(String[] args) {
        System.out.println("Please enter word!");
        String first = InputMethods.inputOperator();
        String second = InputMethods.inputOperator();
        String third = InputMethods.inputOperator();
        System.out.println(testWords(first) ? "This word is palindrom" : "No palindrom");
        System.out.println(testWords(second) ? "This word is palindrom" : "No palindrom");
        System.out.println(testWords(third) ? "This word is palindrom" : "No palindrom");


    }


}
