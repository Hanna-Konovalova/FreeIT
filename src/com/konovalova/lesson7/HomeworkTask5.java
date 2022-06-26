package com.konovalova.lesson7;

public class HomeworkTask5 {

    public static void main(String[] args) {
        /* Создать двухмерный квадратный массив, и заполнить его «бабочкой»
         * */
        int butterflyArray[][] = new int[5][5];

        for (int i = 0; i < butterflyArray.length; i++) {

            for (int j = 0; j < butterflyArray[i].length; j++) {
                //butterflyArray[i][j] = 1;
                butterflyArray[i][j] = validNumber(i, j);
                if (butterflyArray[i][j]==0) {
                    System.out.print("   ");
                } else {
                    System.out.print(butterflyArray[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }

    private static int validNumber(int i, int j) {
        int ourValidNumber;
        if ( ((i==0|i==4)&(j==1|j==2|j==3)) | ((i==1|i==3)&j==2) ) {
            ourValidNumber = 0;
        } else ourValidNumber = 1;
        return ourValidNumber;
    }
}
