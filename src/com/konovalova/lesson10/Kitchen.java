package com.konovalova.lesson10;

public class Kitchen extends HouseholdАppliances{

    public int volumeCup;

    public Kitchen(String tradeMark,int voltage,int volumeCup){
        super(tradeMark,voltage);
        this.volumeCup = volumeCup;
    }

    @Override
    public void switchOn(){
        System.out.println("Kitchen app. works");
    }
}
