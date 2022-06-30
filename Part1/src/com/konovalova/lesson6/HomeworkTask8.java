package com.konovalova.lesson6;

import java.util.Random;

public class HomeworkTask8 {
    public static void main(String[] args) {
        /* Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию, в цикле)
        * */
        Random rand = new Random();
        int randNum = rand.nextInt(6)+10;
        System.out.println(randNum);

        long resultFactoial = 1;

        for(int i=1;i<=randNum;i++) {
            resultFactoial *= i;
        }

        System.out.println(resultFactoial);
    }
}
