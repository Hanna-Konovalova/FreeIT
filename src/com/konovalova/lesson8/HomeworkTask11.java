package com.konovalova.lesson8;

import java.util.Scanner;

public class HomeworkTask11 {
    public static void main(String[] args) {
        /* Задание 20
        Имеется строка с текстом. Вывести текст, составленный из последних букв
        всех слов.
         **/
        System.out.println("Print Your text: ");
        Scanner in = new Scanner(System.in);
        String ourString = in.nextLine();
        int threePointsIndex;
        String lastLetters = "";
        StringBuilder stringBuilder = new StringBuilder(ourString);

        String[] separateWords = ourString.split("[.:;!?,\\s]+");
        for (String word : separateWords) {
            lastLetters = lastLetters + word.charAt(word.length()-1);
        }
        System.out.println("Last letters are: " + lastLetters.toString());

    }
    }

