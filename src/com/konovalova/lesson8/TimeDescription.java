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
    private int seconds;

    public TimeDescription(int seconds){
        this.seconds = seconds;
    }

    public TimeDescription(int hours, int minutes, int seconds){
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getSeconds(){
      return seconds;
    }

    public int getMinutes(){
        return minutes;
    }

    public int getHours(){
        return hours;
    }

    public int secondInTime(int hours, int minutes, int seconds){
          return seconds + minutes*60 + hours*60*60;
    }

    public TimeDescription fullTimeFromSeconds(int seconds){
        int ourHours = seconds/3600;
        int ourMinutes = (seconds - ourHours*3600)/60;
        int ourSeconds = (seconds - ourHours*3600) - ourMinutes*60;
        return new TimeDescription (ourHours,ourMinutes,ourSeconds);
    }

    public int compareTimeInSeconds(int secOne, int secTwo){
        return Integer.compare(secOne,secTwo);
    }

    public int compareFullTime(TimeDescription timeOne, TimeDescription timeTwo){
        int compH = Integer.compare(timeOne.getHours(),timeTwo.getHours());
        int compM = Integer.compare(timeOne.getMinutes(),timeTwo.getMinutes());
        int compS = Integer.compare(timeOne.getSeconds(),timeTwo.getSeconds());
        if(compH != 0){
            return compH;
        } else if (compM != 0) {
            return compM;
        } else {return compS;}
    }

    public String toString(){
        return "hours: " + this.hours + ", minutes: " + this.minutes + ", seconds: " + this.seconds;
    }

    public void printCompResInSeconds(int secOne, int secTwo){
        int compS = compareTimeInSeconds(secOne,secTwo);
        String ourCS = compS==0?" = ":compS==1?" > ": " < ";
        System.out.println("Time1" + ourCS + "Time2");
    }

    public void printCompResFullTime(TimeDescription timeOne, TimeDescription timeTwo){
        int compS = compareFullTime(timeOne,timeTwo);
        String ourCS = compS==0?" = ":compS==1?" > ": " < ";
        System.out.println("Full time compare\nTime1" + ourCS + "Time2");
    }
}
