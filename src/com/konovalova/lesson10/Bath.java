package com.konovalova.lesson10;

public class Bath extends HouseholdАppliances{

    public String color;
    public boolean waterproof;

    public Bath(String tradeMark,int voltage,String color,boolean waterproof){
        super(tradeMark,voltage);
        this.color = color;
        this.waterproof = waterproof;
    }

    @Override
    public void switchOn(){
        System.out.println("Bath app. works");
    }
}
