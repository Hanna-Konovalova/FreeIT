package com.konovalova.lesson7;

import java.util.Random;

public class HomeworkTask2 {

    public static void main(String[] args) {
        /* Создать массив оценок произвольной длины, вывести максимальную и
         * минимальную оценку, её (их) номера.
         * */
        Random rand = new Random();
        int[] someNumbers = new int[30];
        int i = 0;
        int j = 0;
        int k = 0;
        int maxNumber = 0;
        int minNumber = 100;
        int countMax = 0;
        int countMin = 0;
        int[][] finalArray = new int[2][];

        for(;i<someNumbers.length;i++){
            someNumbers[i] = rand.nextInt(12)+1;
            System.out.print(someNumbers[i] + "  ");
            maxNumber = Math.max(maxNumber,someNumbers[i]);
            minNumber = Math.min(minNumber,someNumbers[i]);
        }
        i = 0;
        for(;i<someNumbers.length;i++){
            if(someNumbers[i]==maxNumber){
              ++countMax;
            } else if (someNumbers[i]==minNumber) {
               ++countMin;
            }
        }

        finalArray[0] = new int[countMax];
        finalArray[1] = new int[countMin];

        i = 0;
        for(;i<someNumbers.length;i++){
            if(someNumbers[i]==maxNumber){
                finalArray[0][j] = i;
                ++j;
            } else if (someNumbers[i]==minNumber) {
                finalArray[1][k] = i;
                ++k;
            }
        }

        i = 0;
        for (; i < finalArray.length; i++) {
           if(i==0){
            System.out.print("\nMaximum number: " + maxNumber+ "; indexes :   ");
           } else {
               System.out.print("\nMinimum number: " + minNumber+ "; indexes :   ");
           }
            j = 0;
            for (; j < finalArray[i].length; j++) {
                System.out.print(finalArray[i][j] + 1 + " ");
            }
        }
    }
}
