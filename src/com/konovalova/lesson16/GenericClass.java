package com.konovalova.lesson16;

import java.util.Scanner;

public class GenericClass {

    public static <T> void fill(T [] myArray) {
        T [] arr = myArray;
        AnyTypeArray <T> ata = new AnyTypeArray <T> ();
        ata.setArrayValue(arr);

        System.out.println(ata.toString());

        Scanner in = new Scanner(System.in);
        System.out.println("Choose index to print:");
        if(in.nextInt()<ata.getLength(arr)){
            System.out.println(ata.getArrayValueByIndex(2));
        } else {
            System.out.println("Index out of array length");
        }
    }

    public static void main(String[] args) {

        /*Задание 28. Написать класс, который умеет хранить в себе массив любых типов данных (int, long
        etc.). Реализовать метод get(int index), который возвращает любой элемент
        массива по индексу.*/

        String [] stringArray = {"text1", "text2","text3","text4"};
        fill(stringArray);

        Integer [] integerArray = { 12,1,55,16,28,2,61,8,20,107};
        fill(integerArray);
    }
}
