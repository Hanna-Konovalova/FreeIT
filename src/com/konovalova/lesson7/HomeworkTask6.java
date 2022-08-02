package com.konovalova.lesson7;

import java.util.HashMap;
import java.util.Scanner;

public class HomeworkTask6 {

    public static void main(String[] args) {
        /* Написать частотный словарь - посчитать сколько раз каждое слово встречается в предложении и вывести
         * результат в консоль
         **/

        System.out.println("Print Your sentence: ");
        Scanner in = new Scanner(System.in);
        String ourSentence = in.nextLine();

        String[] separatedWords = ourSentence.split(" ");
        String[] uniqWords = new String[separatedWords.length];
        String uniW = "";
        boolean isUniq;
        int counterUniq = 0;

        //1. Выборка уникальных значений основного массива и заполнение на его основании массива уникальных значений
        for(int i=0;i<separatedWords.length;i++) {
            uniW = separatedWords[i];
            isUniq = true;
            for (int j = 0; j < uniqWords.length; j++) {
                if(uniqWords[j]!=null) {
                    if (uniqWords[j].equals(uniW)) {
                        isUniq = false;
                        continue;
                    }
                }
            }
            if (isUniq){
                uniqWords[counterUniq] = uniW;
                counterUniq ++;
            }
        }
        //2. Подсчитываем и выводим количество уникальных элементов в исходном массиве
        for(int i=0;i<uniqWords.length;i++){
            counterUniq = 0;
            if(uniqWords[i]!=null) {
                for (int j = 0; j < separatedWords.length; j++) {
                    if (uniqWords[i].equals(separatedWords[j])) {
                        counterUniq++;
                    }
                }
                System.out.println("Word " + uniqWords[i] + " meets in sentence " + counterUniq + " times");
            }

        }
    }
}
