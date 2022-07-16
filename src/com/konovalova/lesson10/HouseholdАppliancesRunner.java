package com.konovalova.lesson10;

public class HouseholdАppliancesRunner {

    public static void main(String[] args) {

        /*Задание 26. Создать иерархию классов, описывающих бытовую технику. Создать несколько
        объектов описанных классов, часть из них включить в розетку.
        Иерархия должна иметь хотя бы три уровня.*/

        Bath fan = new Bath("Bosh",220,"white",false);
        fan.switchOn();
        Mixer ourMix = new Mixer("Tefal",220,2,6,true);
        ourMix.switchOn();
        LaundaryMashine lMash = new LaundaryMashine("LG",360,"black",true,6,20);
        lMash.switchOn();
    }
}
