package com.konovalova.lesson4;

import org.w3c.dom.ls.LSInput;
import java.util.Scanner;

public class HomeworkTask2 {

    public static void main(String[] args) {

        /* Сравнить 2 введенных числа
         * */
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number1: ");
        int num1 = in.nextInt();
        System.out.print("Input a number2: ");
        int num2 = in.nextInt();
        boolean res = num1 >= num2;

        System.out.println("Number1 >= Number2 " + res);

      in.close();

    }

}
