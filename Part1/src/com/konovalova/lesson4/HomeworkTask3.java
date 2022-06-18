package com.konovalova.lesson4;

import java.util.Scanner;
public class HomeworkTask3 {

    public static void main(String[] args) {

        /* Определить число, полученное выписыванием в обратном порядке
         * цифр любого 4-х значного числа
         * */
        Scanner in = new Scanner(System.in);
        System.out.print("Input a four-digit number: ");
        String str = in.nextLine();
        String reverse = new StringBuffer(str).reverse().toString();

        System.out.println(reverse);

        in.close();

    }
}
