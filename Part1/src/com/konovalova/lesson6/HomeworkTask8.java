package com.konovalova.lesson6;

public class HomeworkTask8 {
    public static void main(String[] args) {
        /* Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию, в цикле)
        * */
        int firstNumber = 10;
        int lastNumber = 15;
        int resultFactoial = 1;
        int i;

        for(i=firstNumber;i<=lastNumber;i++) {
            resultFactoial *= i;
        }

        System.out.println(resultFactoial);
    }
}
