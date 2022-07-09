package com.konovalova.lesson8;

import java.util.Scanner;

public class HomeworkTask9 {

    public static void main(String[] args) {
        /* Задание 18
        Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
         **/
        System.out.println("Print Your text: ");
        Scanner in = new Scanner(System.in);
        String ourString = in.nextLine();
        int threePointsIndex;
        StringBuilder stringBuilder = new StringBuilder(ourString);

        while(true){
            threePointsIndex = stringBuilder.indexOf("...");
            if(threePointsIndex<0){
                break;
            }
            stringBuilder.replace(threePointsIndex, (threePointsIndex+3), "?");
        }
        ourString = stringBuilder.toString();

        System.out.println("Quantaty of punctuation marks: " + (ourString.length() - ourString.replaceAll("[\\p{P}\\p{S}]", "").length()));
    }
}
