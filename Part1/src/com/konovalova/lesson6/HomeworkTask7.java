package com.konovalova.lesson6;

public class HomeworkTask7 {
    public static void main(String[] args) {
        /* Посчитать факториал числа в границах от 10 до 15 (используя рекурсию)
         * */

        int resultFactor = factorialCycle(15);
        System.out.println(resultFactor);
    }

    public static int factorialCycle(int x) {

        int resultFactor;

        if (x < 10) return 1;
        else resultFactor = factorialCycle(x - 1) * x;
        return resultFactor;

    }
}

