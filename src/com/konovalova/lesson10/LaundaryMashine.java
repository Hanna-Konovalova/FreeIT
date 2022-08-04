package com.konovalova.lesson10;

public class LaundaryMashine extends Bath{

    private double loadWeight;
    private int quantPrograms;

    public LaundaryMashine(String tradeMark,int voltage,String color,boolean waterproof, double loadWeight,int quantPrograms){
        super(tradeMark,voltage,color,waterproof);
        this.loadWeight = loadWeight;
        this.quantPrograms = quantPrograms;
    };

    @Override
    public void switchOn(){
        System.out.println("Laundary is ready to start!");
    }
}
