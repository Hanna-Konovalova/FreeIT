package com.konovalova.lesson5;

import java.util.Scanner;

public class HomeworkTask3 {

    public static void main(String[] args) {
        /* Написать программу, которая приветствует пользователя в зависимости от его пола
        * и возраста (имя, пол и возраст задаются при старте программы)
        **/
        Scanner in = new Scanner(System.in);
        System.out.print("Input Your gender m/f: ");
        String gen = in.nextLine();
        System.out.print("Input Your name: ");
        String name = in.nextLine();
        System.out.print("Input Your age: ");
        int age = in.nextInt();

        boolean m = gen.equals("m");
        boolean f = gen.equals("f");

        if (m) {
            if (age < 7) {
                System.out.println("Hi, " + name);
            } else {
                System.out.println("Hello, Mr. " + name);
            }
        } else if (f) {
            if (age < 7) {
                System.out.println("Hi, " + name);
            } else {
                System.out.println("Hello, Ms. " + name);
            }

        } else {
            System.out.println("Hello creature " + name);
        }

        in.close();

    }
}
