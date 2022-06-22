package com.konovalova.lesson6;

import java.util.Scanner;

public class HomeworkTask5 {
    public static void main(String[] args) {
        /* Имеется целое число, определить является ли это число простым, т.е.
         * делится без остатка только на 1 и себя.
         * */

        Scanner in = new Scanner(System.in);
        System.out.print("Input any integer: ");
        int integ = in.nextInt();
        int integClone = integ;

        boolean isRemain = true;

        while (isRemain) {
            --integClone;

            if (integClone > 1) {
                isRemain = integ % integClone !=0;
               } else {
               break;
              }
        }
        if(isRemain){
            System.out.println("Prime number");
        } else {
            System.out.println("Not prime number");
        }

    }

}
