package com.konovalova.lesson10;

public class Mixer extends Kitchen{

    private double speed;
    private boolean isTurbo;

    public Mixer(String tradeMark,int voltage,int volumeCup, double speed, boolean isTurbo){
        super(tradeMark,voltage,volumeCup);
        this.speed = speed;
        this.isTurbo = isTurbo;
    }

}
