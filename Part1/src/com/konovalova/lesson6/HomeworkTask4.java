package com.konovalova.lesson6;

import java.util.Random;

public class HomeworkTask4 {

    public static void main(String[] args) {
        /* Имеется целове число (задать с помощью Random rand = new Random(); int x =
         * rand.nextInt() ). Это число – количесво денег в рублях. Вывести это число, добавив к
         * нему слово «рублей» в правильном падеже.
         * */
       // Random rand = new Random();
       // int randNum = rand.nextInt();
       int randNum = 1013;
        System.out.println(randNum);
        int lastNumeric = randNum%10;
        int lastNumeric1 = randNum%100;

        if((lastNumeric == 1)&&(lastNumeric1!=11)) {
            System.out.println(randNum + " рубль");
         } else if ((lastNumeric>=2 && lastNumeric<=4)
                &&(lastNumeric1!=12 && lastNumeric1!=13 && lastNumeric1!=14)) {
            System.out.println(randNum + " рубля");
        } else {
            System.out.println(randNum + " рублей");
        }
    }
}
