package com.konovalova.lesson4;

public class HomeworkTask1 {

    public static void main(String[] args) {
        /* Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
         * А) минут + секунд,
         * В) часов + минут + секунд,
         * С) дней + часов + минут + секунд,
         * D) недель + дней + часов + минут + секунд.
        * */
        int s = 604800;
        int sec = s % 60;
        int m = (s - sec) / 60;
        int min = m % 60;
        int h = (m - min) / 60;
        int da = h % 24;
        int d = (h - da)/24;
        int we = d % 7;
        int w = (d - we)/7;
        System.out.println(m + " minutes " + sec + " seconds");
        System.out.println(h + " hours " + min + " minutes " + sec + " seconds");
        System.out.println(d + " days " +da + " hours " + min + " minutes " + sec + " seconds");
        System.out.println(w + " weeks " + we + " days " +da + " hours " + min + " minutes " + sec + " seconds ");
    }
}
