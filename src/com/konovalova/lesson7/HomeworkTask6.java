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

        HashMap<String, Integer> separatedWordsCounter = new HashMap<>();
        for (String word : separatedWords)
        {
            if (!separatedWordsCounter.containsKey(word)){
                separatedWordsCounter.put(word, 0);
            }
            separatedWordsCounter.put(word, separatedWordsCounter.get(word) + 1);
        }
        for (String word : separatedWordsCounter.keySet()){
            System.out.println(word + " - meets in sentence - " + separatedWordsCounter.get(word) + " times");
        }

    }


}
