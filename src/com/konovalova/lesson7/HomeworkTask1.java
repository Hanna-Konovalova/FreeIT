package com.konovalova.lesson7;

import java.util.Random;

public class HomeworkTask1 {

    public static void main(String[] args) {
        /* Создать последовательность случайных чисел, найти и вывести наибольшее из них.
         * */
        Random rand = new Random();
        int[] someNumbers = new int[20];
        int i = 0;
        int maxNumber = 0;
        for (; i < someNumbers.length; i++) {
            someNumbers[i] = rand.nextInt(50);
            System.out.print(someNumbers[i] + "  ");
            maxNumber = Math.max(maxNumber, someNumbers[i]);
        }
        System.out.println("\nMaximum number: " + maxNumber);
    }
}
