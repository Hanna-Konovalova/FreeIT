package com.konovalova.lesson7;

import java.util.Random;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /* Создать массив, заполнить его случайными элементами, распечатать,
         * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
         * еще один массив).
         * */

        Random rand = new Random();
        int[] someNumbers = new int[10];
        int i = 0;

        System.out.println("Our array: ");
        for(;i<someNumbers.length;i++){
            someNumbers[i] = rand.nextInt(5)+7;
            System.out.print(someNumbers[i] + "  ");
        }

        System.out.println("\nRevers array: ");
        for(i=someNumbers.length - 1;i>=0;i--){
            System.out.print(someNumbers[i] + "  ");
        }
    }
}
