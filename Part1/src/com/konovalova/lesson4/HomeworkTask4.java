package com.konovalova.lesson4;

import java.util.Scanner;

public class HomeworkTask4 {

    public static void main(String[] args) {

        /* Дано любое натуральное 4-х значное число.
         * Верно ли, что все цифры числа различны?
         * */
        Scanner in = new Scanner(System.in);
        System.out.print("Input a four-digit number: ");
        int num1 = in.nextInt();
        int a = num1/1000;
        int aa = (num1 - a*1000);
        int b = aa/100;
        int bb = (aa - b*100);
        int c = bb/10;
        int cc = (bb - c*10);
        boolean res = (a == b | b == c | c == cc | a == c | a == cc | b == cc);

        System.out.println("The numerics differs " + !res);

        in.close();

    }
}
