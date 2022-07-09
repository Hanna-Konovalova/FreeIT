package com.konovalova.lesson8;

import java.util.Scanner;

public class HomeworkTask10 {
    public static void main(String[] args) {
        /* Задание 19
        Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
        учесть, что слова могут разделяться несколькими пробелами, в начале и конце
        текста также могут быть пробелы, но могут и отсутствовать.
         **/
        System.out.println("Print Your text: ");
        Scanner in = new Scanner(System.in);
        String ourString = in.nextLine();

        ourString = ourString.replaceAll("[\\p{P}\\p{S}]", " ");
        String[] separateWords = ourString.split(" +");
        System.out.println("Quantaty of words in sentance: " + separateWords.length);
    }
    }

