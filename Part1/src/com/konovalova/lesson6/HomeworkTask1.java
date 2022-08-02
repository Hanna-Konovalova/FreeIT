package com.konovalova.lesson6;

public class HomeworkTask1 {

    public static void main(String[] args) {
        /* надо получить ряд случайных чисел, и посчитать
         * среднее произведение от них. Ввод чисел прекращается, если очередным числом
         * будет ноль.
         * */

        double averageMult = 0;
        double mult = 1;
        int symbolQuant = 0;
        int numb = (int)(Math.random() * 30);

        while(numb != 0) {
            mult *= numb;
            symbolQuant ++;
            numb = (int)(Math.random()*30);
        }

       if(symbolQuant != 0){
            averageMult = mult / symbolQuant;
        } else {
            averageMult = 0;
        }
        System.out.println("среднее:" + averageMult);

    }
}
