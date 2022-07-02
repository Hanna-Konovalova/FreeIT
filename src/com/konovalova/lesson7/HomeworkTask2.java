package com.konovalova.lesson7;

import java.util.Random;

public class HomeworkTask2 {

    public static void main(String[] args) {
        /* Создать массив оценок произвольной длины, вывести максимальную и
         * минимальную оценку, её (их) номера.
         * */
        Random rand = new Random();
        int[] someNumbers = new int[30];
        int maxNumber = 0;
        int minNumber = 100;
        String maxNumberIndexes = "; indexes :   ";
        String minNumberIndexes = "; indexes :   ";

        for(int i = 0;i<someNumbers.length;i++){
            someNumbers[i] = rand.nextInt(12)+1;
            System.out.print(someNumbers[i] + "  ");
            if(someNumbers[i]>maxNumber){
                maxNumber = someNumbers[i];
            }
            if(someNumbers[i]<minNumber){
                minNumber = someNumbers[i];
            }
        }

        for(int i = 0;i<someNumbers.length;i++){
            if(someNumbers[i]==maxNumber){
                maxNumberIndexes = maxNumberIndexes + i + "  ";
            }
            if(someNumbers[i]==minNumber){
                minNumberIndexes = minNumberIndexes + i + "  ";;
            }
        }

        System.out.println("\nMaximum number: " + maxNumber + maxNumberIndexes);
        System.out.println("Minimum number: " + minNumber + minNumberIndexes);

        }
}
