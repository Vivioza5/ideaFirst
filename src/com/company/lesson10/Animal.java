package com.company.lesson10;

public class Animal {
    public static void main(String[] args) {
        Cat vasja = new Cat();


//        System.out.println(vasja.age +" "+ vasja.hair +" "+vasja.gender);
//        vasja.age = 5;
//        vasja.gender = "Male";
//        vasja.hair = "long";
//        System.out.println(vasja.age +" "+ vasja.hair +" "+vasja.gender);


        //vasja.setAge(12);
        vasja.setGender("Male");
        System.out.println("lags = " + Cat.lags);
        System.out.println(Math.PI);

        vasja.setCat("avarage", "castr", 13);


        System.out.println(vasja);


    }
}
