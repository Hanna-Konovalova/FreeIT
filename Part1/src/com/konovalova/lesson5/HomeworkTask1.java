package com.konovalova.lesson5;

public class HomeworkTask1 {

    public static void main(String[] args) {

        /* Написать 5 способов создания/получения строки
        * */
        int a = 123;
        //1
        String s1 = "" + a;
        System.out.println(s1);
        //2
        String s2 = String.valueOf(a);
        System.out.println(s2);
        //3
        System.out.println(Integer.toString(a));
        //4
        String s4 = String.format("%d", a);
        System.out.println(s4);
        //5
        String s5 = new StringBuilder().append(a).toString();
        System.out.println(s5);

    }
}
