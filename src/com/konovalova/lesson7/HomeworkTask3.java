package com.konovalova.lesson7;

import java.util.Random;

public class HomeworkTask3 {
    public static void main(String[] args) {
        /* Создать массив, заполнить его случайными элементами, распечатать,
         * перевернуть, и снова распечатать (при переворачивании нежелательно создавать
         * еще один массив).
         * */

        Random rand = new Random();
        int[] someNumbers = new int[11];
        int tempNumber;

        System.out.println("Our array: ");
        for(int i = 0;i<someNumbers.length;i++){
            someNumbers[i] = rand.nextInt(5)+7;
            System.out.print(someNumbers[i] + "  ");
        }

        for(int i = 0;i<someNumbers.length/2;i++){
            tempNumber = someNumbers[i];
            someNumbers[i] = someNumbers[someNumbers.length -i-1];
            someNumbers[someNumbers.length -i-1] = tempNumber;
        }

        System.out.println("\nRevers array: ");
        for(int i = 0;i<someNumbers.length;i++){
            System.out.print(someNumbers[i] + "  ");
        }
    }
}
