package com.konovalova.lesson7;

public class HomeworkTask4 {

    public static void main(String[] args) {
        /* Определите сумму элементов одномерного массива, расположенных между
         * минимальным и максимальным значениями.
         * */
        int[] someNumbers = {12, 0, 8, 12, 23, 4, 5, 8, 49, 15, 7};
        int i = 0;
        int maxNumber = someNumbers[0];
        int minNumber = someNumbers[0];
        int indexMaxNumder = 0;
        int indexMinNumber = 0;
        int bufferNumber = 0;
        int amountNumber = 0;

        for (; i < someNumbers.length; i++) {
            System.out.print(someNumbers[i] + " ");
            if (someNumbers[i] > maxNumber) {
                maxNumber = someNumbers[i];
                indexMaxNumder = i;
            } else if (someNumbers[i] < minNumber) {
                minNumber = someNumbers[i];
                indexMinNumber = i;
            }
        }
        System.out.println("\nMax number: " + maxNumber + " , max index: " + indexMaxNumder);
        System.out.println("Min number: " + minNumber + " , max index: " + indexMinNumber);

        if (indexMinNumber > indexMaxNumder) {
            bufferNumber = indexMinNumber;
            indexMinNumber = indexMaxNumder;
            indexMaxNumder = bufferNumber;
        }

        i=indexMinNumber+1;
        for (;i<indexMaxNumder;i++){
            amountNumber += someNumbers[i];
        }

        System.out.println("Amount: " + amountNumber);

    }
}
