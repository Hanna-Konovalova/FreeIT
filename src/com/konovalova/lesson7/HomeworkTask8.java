package com.konovalova.lesson7;

import java.util.Random;
import java.util.Scanner;

public class HomeworkTask8 {

    public static void main(String[] args) {
        /* Написать игру крестики нолики
         **/
        Random rand = new Random();
        Scanner in = new Scanner(System.in);
        int[][] playGround = new int[3][3];

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                playGround[x][y] = 0;
            }
        }

        printPlayGroun(playGround);

        while (true) {

            if(actingMethod(2,playGround,in,rand)){
                break;
            }
            if(actingMethod(3,playGround,in,rand)){
                break;
            }
        }
    }
    private static boolean actingMethod(int playerMark,int[][] playGround,Scanner in,Random rand){
        //ход игрока/компьтера
        if(playerMark==2) {
            userAct(playGround,in);
        }else{
            compAct(playGround,rand);
        }
        //проверка победы
        if(isWin(playerMark,playGround)){
            System.out.println(playerMark==2?"You win":"Computer wins");
            printPlayGroun(playGround);
            return true;
        } else {
            //печать поля
            printPlayGroun(playGround);
        }
        //проверка ничья
        if (noWins(playGround)){
            System.out.println("No wins");
            return true;
        }
        return false;
    }
    private static boolean noWins(int[][] playGround){
        for(int x = 0;x<3;x++){
            for(int y = 0;y<3;y++){
                if(playGround[x][y]==0){
                    return false;
                }
            }
        }
        return true;
    }
    private static boolean isWin(int playerMark, int[][] playGround){

         for (int x =0;x<3;x++){
            if((playGround[x][0]==playerMark & playGround[x][1]==playerMark & playGround[x][2]==playerMark) ||
               (playGround[0][x]==playerMark & playGround[1][x]==playerMark & playGround[2][x]==playerMark))
            {
                return true;
            }
         }

        if((playGround[0][0]==playerMark & playGround[1][1]==playerMark & playGround[2][2]==playerMark) ||
                (playGround[0][2]==playerMark & playGround[1][1]==playerMark & playGround[2][0]==playerMark))
        {
            return true;
        }
        return false;
    }
    private static void printPlayGroun(int[][] playGround){
        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                if(playGround[x][y]==0) {
                    System.out.print("_" + " ");
                } else if (playGround[x][y]==2) {
                    System.out.print("X" + " ");
                } else {
                    System.out.print("O" + " ");
                }
            }
            System.out.println();
        }
    }
    private static void userAct(int[][] playGround,Scanner in) {
        int x, y;
        do {
            System.out.println("Input cell numbers (from 1-3):");
            x = in.nextInt() - 1;
            y = in.nextInt() - 1;
        } while (!emptyCell(x, y, playGround));
        playGround[y][x] = 2;
    }
    private static void compAct(int[][] playGround,Random rand) {
        System.out.println("Computer act:");
        int x, y;
        do {
            x = rand.nextInt(3);
            y = rand.nextInt(3);
        } while (!emptyCell(x, y, playGround));
        playGround[y][x] = 3;
    }
    private static boolean emptyCell(int x, int y, int[][] playGround) {
         if (x < 0 || y < 0 || x >= 3 || y >= 3)
                return false;
            return playGround[y][x] == 0;
        }

    }


