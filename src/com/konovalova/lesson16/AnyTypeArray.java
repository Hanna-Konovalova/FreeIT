package com.konovalova.lesson16;

import java.util.Arrays;

public class AnyTypeArray <T> {
    private T [] myArray;
    public void setArrayValue( T [] myArray){
        this.myArray =  myArray;
    }
    public T getArrayValueByIndex(int index){
        return  myArray[index] ;
    }
    public int getLength(T [] myArray){
        return myArray.length;
    }
    @Override
    public String toString() {
        return "AnyTypeArray{" +
                "myArray=" + Arrays.toString(myArray) +
                '}';
    }
}
