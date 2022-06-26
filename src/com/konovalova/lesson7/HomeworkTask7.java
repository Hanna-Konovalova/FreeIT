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

        String[] separatedSentence = ourText.split("[.]");
        for (String sentence : separatedSentence) {

            String[] separatedWords = sentence.split(" ");

            HashMap<String, Integer> separatedWordsCounter = new HashMap<>();
            for (String word : separatedWords) {

                if (word != " ") {
                    if (!separatedWordsCounter.containsKey(word)) {
                        separatedWordsCounter.put(word, 0);
                    }
                    separatedWordsCounter.put(word, separatedWordsCounter.get(word) + 1);
                }
            }
            for (String word : separatedWordsCounter.keySet()) {
                System.out.println(word + " - meets in sentence - " + separatedWordsCounter.get(word) + " times");
            }
        }
    }
}
