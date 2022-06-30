package com.konovalova.lesson6;

import java.util.Random;

public class HomeworkTask7 {
    public static void main(String[] args) {
        /* Посчитать факториал числа в границах от 10 до 15 (используя рекурсию)
         * */
        Random rand = new Random();
        int randNum = rand.nextInt(6)+10;
        System.out.println(randNum);
        long resultFactor = factorialCycle(randNum);
        System.out.println(resultFactor);
    }

    public static long factorialCycle(int x) {

        long resultFactor;

        if (x < 2) return 1;
        else resultFactor = factorialCycle(x - 1) * x;
        return resultFactor;

    }
}

