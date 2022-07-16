package com.konovalova.lesson10;

public class HouseholdАppliances {

    public String tradeMark;
    public int voltage;

    public HouseholdАppliances(String tradeMark,int voltage) {
        this.tradeMark = tradeMark;
        this.voltage = voltage;
    }

    public void switchOn(){
        System.out.println("It works");
    }

}
