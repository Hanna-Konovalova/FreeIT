package com.konovalova.lesson7;
import java.util.HashMap;
import java.util.Scanner;
public class HomeworkTask7 {
    public static void main(String[] args) {
        /* Написать программу, которая будет хранить текст
         * по предложениям и для каждого предложения составить частотный словарь
         **/

        System.out.println("Print Your text: ");
        Scanner in = new Scanner(System.in);
        String ourText = in.nextLine();
        boolean isUniq;

        String[] separatedSentence = ourText.split("[.!?\n]");
        for (String sentence : separatedSentence) {

            System.out.println("Sentence: " + sentence);
            String[] separatedWords = sentence.split(" ");
            String[] uniqWords = new String[separatedWords.length];
            String uniW = "";
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
}
