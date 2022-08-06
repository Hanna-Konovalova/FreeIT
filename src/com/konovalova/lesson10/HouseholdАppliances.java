package com.konovalova.lesson10;

public class HouseholdАppliances {

    private String tradeMark;
    private int voltage;

    public HouseholdАppliances(String tradeMark,int voltage) {
        this.tradeMark = tradeMark;
        this.voltage = voltage;
    }
    public void switchOn(){
        System.out.println("It works");
    }
    public String getTradeMark(){return tradeMark;}
    public int getVoltage(){return voltage;}

}
