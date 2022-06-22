package com.konovalova.lesson6;

import java.util.Random;

public class HomeworkTask4 {

    public static void main(String[] args) {
        /* Имеется целове число (задать с помощью Random rand = new Random(); int x =
         * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
         * нему слово «рублей» в правильном падеже.
         * */
        Random rand = new Random();
        int randNum = rand.nextInt();
        System.out.println(randNum);
        int lastNumeric = randNum - ((randNum/10)*10);

        if(randNum == 1) {
            System.out.println(randNum + " рубль");
         } else if (lastNumeric>1 && lastNumeric<5) {
            System.out.println(randNum + " рубля");
        } else {
            System.out.println(randNum + " рублей");
        }
    }
}
