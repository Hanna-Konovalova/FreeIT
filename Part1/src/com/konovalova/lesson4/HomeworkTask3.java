package com.konovalova.lesson4;

import java.util.Scanner;
public class HomeworkTask3 {

    public static void main(String[] args) {

        /* Определить число, полученное выписыванием в обратном порядке
         * цифр любого 4-х значного числа
         * */
        Scanner in = new Scanner(System.in);
        System.out.print("Input a four-digit number: ");

        int num1 = in.nextInt();
        int firstNum = num1/1000;
        int buferNum1 = (num1 - firstNum*1000);
        int secondNum = buferNum1/100;
        int buferNum2 = (buferNum1 - secondNum*100);
        int thirdNum = buferNum2/10;
        int fourNum = (buferNum2 - thirdNum*10);
        int reverseNum = fourNum*1000 + thirdNum*100 + secondNum*10 + firstNum;

        System.out.println("Revers number " + reverseNum);

        in.close();

    }
}
