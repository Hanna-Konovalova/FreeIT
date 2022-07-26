package com.konovalova.lesson8;

     /* Задание 24
     Создать класс и объекты описывающие промежуток времени. Сам промежуток
     в классе должен задаваться тремя свойствами: секундами, минутами, часами.
     Сделать методы для получения полного количества секунд в объекте, сравнения
     двух объектов (метод должен работать аналогично compareTo в строках). Создать
     два конструктора: получающий общее количество секунд, и часы, минуты и секунды
     по отдельности. Сделать метод для вывода данных.
       **/

public class TimeDescription {

    private int hours;
    private int minutes;
    private long seconds;

    public TimeDescription(long seconds){
        this.seconds = seconds;
    }

    public TimeDescription(int hours, int minutes, long seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public TimeDescription timeInSeconds(){
        long newSeconds = (long)(this.seconds + this.minutes*60 + this.hours*60*60);
        return new TimeDescription(newSeconds);
    }

    public String compareTime(TimeDescription timeOne,TimeDescription timeTwo){
        int compRes = Long.compare(timeOne.seconds,timeTwo.seconds);
        return compRes==1? "Time1 > Time2":compRes<0?"Time1 < Time2":"Time1 = Time2";

    }

    public String toString(){
        return "hours: " + this.hours + ", minutes: " + this.minutes + ", seconds: " + this.seconds;
    }

}
