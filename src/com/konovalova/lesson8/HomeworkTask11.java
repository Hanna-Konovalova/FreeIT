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

        while(true){
            threePointsIndex = stringBuilder.indexOf("...");
            if(threePointsIndex<0){
                break;
            }
            stringBuilder.replace(threePointsIndex, (threePointsIndex+3), "?");
        }
        ourString = stringBuilder.toString();
        ourString = ourString.replaceAll("[\\p{P}\\p{S}]", "");
        String[] separateWords = ourString.split(" +");
        for (String word : separateWords) {
            lastLetters = lastLetters + word.charAt(word.length()-1);
        }
        System.out.println("Last letters are: " + lastLetters.toString());
    }
    }

