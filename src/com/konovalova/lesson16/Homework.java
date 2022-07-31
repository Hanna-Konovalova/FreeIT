package com.konovalova.lesson16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework {

    //Excel class 11. Создать класс, который может складывать и числа и строки

    public static <T> void fill(T [] myArray) {

        T [] arr = myArray;
        ConcatenationClass <T> ata = new ConcatenationClass <T> ();
        ata.setArrayValue(arr);

        System.out.println(ata.toString());
        ata.concat();

    }

    public static void main(String[] args) {

        String [] stringArray = {"text1", "text2","text3","text4"};
        fill(stringArray);

        Integer [] integerArray = { 12,1,55,16,28,2,61,8,20,107};
        fill(integerArray);

    }

}
