package com.konovalova.lesson10;

public class Bath extends HouseholdАppliances{

    private String color;
    private boolean waterproof;

    public Bath(String tradeMark,int voltage,String color,boolean waterproof){
        super(tradeMark,voltage);
        this.color = color;
        this.waterproof = waterproof;
    }
    @Override
    public void switchOn(){
        System.out.println("Bath app. works");
    }
    public String getColor(){return color;}
    public boolean getWaterproof(){return waterproof;}

}
