package com.company.lesson8;

public class stringEX {
    public static void main(String[] args) {

        StringBuffer str = new StringBuffer("Hello=)");
        str.append("))))");
        System.out.println(str);
        System.out.println(str.length());
        System.out.println(str.capacity());
/*        System.out.println(str);
        StringBuffer str2 = new StringBuffer(5);
        str2.append("Kiev");
        System.out.println(str2);
        System.out.println(str2.length());
        System.out.println(str2.capacity());*/
        StringBuffer str2 = new StringBuffer();
        str2.append("Hello Kiev");

    }
}
