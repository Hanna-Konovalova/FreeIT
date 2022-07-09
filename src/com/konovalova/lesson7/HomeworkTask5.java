package com.konovalova.lesson7;

public class HomeworkTask5 {

    public static void main(String[] args) {
        /* Создать двухмерный квадратный массив, и заполнить его «бабочкой»
         * */
        int butterflyArray[][] = new int[5][5];

        for (int i = 0; i < butterflyArray.length/2+1; i++) {
            for (int j = 0; j < butterflyArray[i].length; j++) {
                if(j<=i||j>=butterflyArray[i].length-i-1){
                butterflyArray[i][j] = 1;}
                else {
                    butterflyArray[i][j] = 0;
                }
            }
        }

        for (int i = butterflyArray.length/2+1; i < butterflyArray.length; i++) {
            for (int j = 0; j < butterflyArray[i].length; j++) {
                if(j>=i||j<butterflyArray[i].length-i){
                    butterflyArray[i][j] = 1;}
                else {
                    butterflyArray[i][j] = 0;
                }
            }
        }

        for(int i = 0; i < butterflyArray.length; i++){
           for(int j = 0; j < butterflyArray[i].length; j++){
               if(butterflyArray[i][j]==1){
                   System.out.print(butterflyArray[i][j]+"  ");
               } else {
                   System.out.print("   ");
               }
           }
            System.out.println();
        }
    }
}



