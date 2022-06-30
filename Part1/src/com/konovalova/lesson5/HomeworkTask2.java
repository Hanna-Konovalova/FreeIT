package com.konovalova.lesson5;

import java.util.Scanner;

public class HomeworkTask2 {

    public static void main(String[] args) {

        /* Написать программу, в которой в консоль будет выводится название месяца и сезон,
        * к которму этот месяц относится (написать с помощью  if  и с помощью switch)
        **/

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int mn1 = in1.nextInt();

        switch (mn1) {
            case 1,2,12 -> System.out.println("Winter " + (mn1==1?"JAN":mn1==2?"FEB":"DEC"));
            case 3,4,5 -> System.out.println("Spring " + (mn1==3?"MAR":mn1==4?"APR":"MAY"));
            case 6,7,8 -> System.out.println("Summer " + (mn1==6?"JUN":mn1==7?"JUL":"AUG"));
            case 9,10,11 -> System.out.println("Autumn " + (mn1==9?"SEP":mn1==10?"OCT":"NOV"));
            default -> System.out.println("There is not such month");
        }

        in1.close();

    }
}
