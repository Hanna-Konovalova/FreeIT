package com.konovalova.lesson6;

import java.util.Scanner;

public class HomeworkTask2 {

    public static void main(String[] args) {
        /* Создайте число. Определите, является ли число трехзначным. Определите, является
         * ли его последняя цифра семеркой. Определите, является ли число четным.
         * */
        Scanner in = new Scanner(System.in);
        System.out.print("Input any 3 digital number: ");
        int ourNumeric = in.nextInt();
        boolean IsThreeDigit;

        IsThreeDigit = ourNumeric >= 100 && ourNumeric <= 999;

        if (IsThreeDigit) {

            System.out.println("Number is 3 digital");
            int lastNumeric = ourNumeric - ((ourNumeric/10)*10);

            if (lastNumeric == 7) {
                System.out.println("Last number is 7");
                System.out.println("Number is not even");
            } else {
                System.out.println("Last number is not 7");

                boolean resOfDivision = (lastNumeric % 2) == 0;
                 if (resOfDivision){
                     System.out.println("Number is even");
                 } else {
                     System.out.println("Number is not even");
                 }
            }
        } else {
            System.out.println("Number is not 3 digital");
        }
    }
}
