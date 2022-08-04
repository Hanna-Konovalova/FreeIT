package com.konovalova.lesson10;

public class Kitchen extends HouseholdАppliances{

    private int volumeCup;

    public Kitchen(String tradeMark,int voltage,int volumeCup){
        super(tradeMark,voltage);
        this.volumeCup = volumeCup;
    }

    @Override
    public void switchOn(){
        System.out.println("Kitchen app. works");
    }

    public int getVolumeCup() {
        return volumeCup;
    }
    public String getTradeMark(){return super.getTradeMark();}

    public int getVoltage(){return super.getVoltage();}
}
