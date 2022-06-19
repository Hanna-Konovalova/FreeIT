package com.konovalova.lesson5;

import java.util.Scanner;

public class HomeworkTask2 {

    public static void main(String[] args) {

        /* Написать программу, в которой в консоль будет выводится название месяца и сезон,
        * к которму этот месяц относится (написать с помощью  if  и с помощью switch)
        **/
        Scanner in = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int mn = in.nextInt();

        if (mn == 1 || mn == 2 || mn == 12) {
             if (mn == 1) {
                 System.out.println("Winter JAN");
             } else if (mn == 2) {
                 System.out.println("Winter FAB");
             } else  {
                 System.out.println("Winter DEC");
             }
        }
        else if(mn == 3 || mn == 4 || mn == 5){
            if (mn == 3) {
                System.out.println("Spring MAR");
            } else if (mn == 4) {
                System.out.println("Spring APR");
            } else {
                System.out.println("Spring MAY");
            }
               }
        else if(mn == 6 || mn == 7 || mn == 8){
            if (mn == 6) {
                System.out.println("Summer JUN");
            } else if (mn == 7) {
                System.out.println("Summer JUL");
            } else {
                System.out.println("Summer AUG");
            }
        }
        else if(mn == 9 || mn == 10 || mn == 11){
            if (mn == 9) {
                System.out.println("Autumn SEP");
            } else if (mn == 10) {
                System.out.println("Autumn OCT");
            } else {
                System.out.println("Autumn NOV");
            }
        }
        else{
            System.out.println("There is not such month");
        }

        in.close();

        Scanner in1 = new Scanner(System.in);
        System.out.print("Input a month number: ");
        int mn1 = in1.nextInt();

        switch (mn1) {
            case 1:
                System.out.println("Winter JAN");
                break;
            case 2:
                System.out.println("Winter FEB");
                break;
            case 12:
                System.out.println("Winter DEC");
                break;
            case 3:
                System.out.println("Spring MAR");
                break;
            case 4:
                System.out.println("Spring APR");
                break;
            case 5:
                System.out.println("Spring MAY");
                break;
            case 6:
                System.out.println("Summer JUN");
                break;
            case 7:
                System.out.println("Summer JUL");
                break;
            case 8:
                System.out.println("Summer AUG");
                break;
            case 9:
                System.out.println("Autumn SEP");
                break;
            case 10:
                System.out.println("Autumn OCT");
                break;
            case 11:
                System.out.println("Autumn NOV");
                break;
            default:
                System.out.println("There is not such month");
        }

        in1.close();

    }
}
