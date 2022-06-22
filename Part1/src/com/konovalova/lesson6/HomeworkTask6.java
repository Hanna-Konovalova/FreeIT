package com.konovalova.lesson6;

import java.util.Scanner;

public class HomeworkTask6 {
    public static void main(String[] args) {
        /* Найдите сумму первых n целых чисел, которые делятся на 3.
        * */
        Scanner in = new Scanner(System.in);
        System.out.print("Input any integer: ");
        int firstNum = in.nextInt();
        int Sum = 0;
        int counter = 0;
        while(counter!= 3) {

            boolean isDivided3 = firstNum%3 == 0;
            if(isDivided3) {
                Sum += firstNum;
                ++counter;
            }
            firstNum++;

        }

        System.out.println(Sum);
    }
}
