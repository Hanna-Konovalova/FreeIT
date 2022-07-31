package com.konovalova.lesson16;

import java.util.Arrays;
import java.util.Scanner;

public class ConcatenationClass <T extends Object> {
    private T [] myArray;
    public String resultString="";
    public int resultInteger=0;

    public void setArrayValue( T [] myArray){
        this.myArray =  myArray;
    }

    @Override
    public String toString() {
        return "AnyTypeArray{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }
    public void concat(){

        for (int i=0;i<myArray.length;i++){
            if (myArray[i] instanceof String) {
                resultString += (String)myArray[i];
            } else if (myArray[i] instanceof Integer) {
                resultInteger += (Integer)myArray[i];
                }
            else {
                    throw new IllegalArgumentException("Type " + myArray[i].getClass() + " is not supported by this method");
                }
            }
        if(!resultString.equals("")){System.out.println(resultString);}
        if(resultInteger!=0){System.out.println(resultInteger);}

    }
}
