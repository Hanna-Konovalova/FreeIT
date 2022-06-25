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
        int checkInt = 2;
        boolean isRemain = integ!=2;

        while (checkInt<=Math.sqrt(integ)) {
            if(integ%checkInt==0){
                isRemain = false;
                break;
            }
            ++checkInt;
        }

       System.out.println(isRemain?"Prime number":"Not prime number");
    }

}
