package com.jvm;

public class StringIntern {

    public static void main(String[] args) {
        String str1 = new StringBuilder("计算及").append("软件").toString();
        System.out.println(str1 == str1.intern());


//        String str2 = new StringBuilder("ja").append("va").toString();
//        String str2 = "计算及1软件";
        String str2 = new String("哈哈哈");


        String str2i = str2.intern();
        System.out.println(str2 == str2i);
    }
}
