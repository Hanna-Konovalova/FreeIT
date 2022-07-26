package com.konovalova.lesson8;

     /* Задание 24
     Создать класс и объекты описывающие промежуток времени. Сам промежуток
     в классе должен задаваться тремя свойствами: секундами, минутами, часами.
     Сделать методы для получения полного количества секунд в объекте, сравнения
     двух объектов (метод должен работать аналогично compareTo в строках). Создать
     два конструктора: получающий общее количество секунд, и часы, минуты и секунды
     по отдельности. Сделать метод для вывода данных.
       **/

public class TimeDescriptionRunner {
    public static void main(String[] args) {

        TimeDescription timeOne = new TimeDescription(786567547);
        TimeDescription timeTwo = new TimeDescription(5,12,35);

        System.out.println("Time1: " + timeOne.toString());
        System.out.println("Time2: " + timeTwo.toString());

        System.out.println("Time2 in seconds: " + timeTwo.timeInSeconds().toString());
        System.out.println(timeOne.compareTime(timeOne,timeTwo.timeInSeconds()));

       }
}
