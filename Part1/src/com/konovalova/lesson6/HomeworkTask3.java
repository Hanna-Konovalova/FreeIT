package com.konovalova.lesson6;

import java.util.Scanner;

public class HomeworkTask3 {

    public static void main(String[] args) {

        /* Имеется прямоугольное отверстие размерами a и b, определить, можно ли его
         * полностью закрыть круглой картонкой радиусом r.
         * */
        Scanner in = new Scanner(System.in);
        System.out.print("Input side of the rectangle 'a' : ");
        int sideA = in.nextInt();
        System.out.print("Input side of the rectangle 'b' : ");
        int sideB = in.nextInt();
        System.out.print("Input circle radius 'r' : ");
        int radiusR = in.nextInt();

        boolean matched = (radiusR*radiusR) >= ((sideA*sideA) + (sideB*sideB))/4;

        if(matched) {
            System.out.println("Success");
        } else {
            System.out.println("Not success");
        }
    }
}
