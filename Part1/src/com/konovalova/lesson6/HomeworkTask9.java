package com.konovalova.lesson6;

import java.util.Random;
import java.util.Scanner;

public class HomeworkTask9 {

    public static void main(String[] args) {
        /* Написать игру в которой нужно угадать случайно выбранную букву (именно букву).
         * При каждом вводе пользователем программа долна говорить "warmly, hot" или "chilly, cold"
         * в зависимости от того, как далеко буква пользователя от загаданной
         * */

        byte ourSymbolLetter = 97;
        byte askSymbolLetter = 97;

        //1 Find random letter from A-Z
        boolean LetterAZ = false;
        while (!LetterAZ) {
            Random rand = new Random();
            int randNum = rand.nextInt();
            ourSymbolLetter = (byte) randNum;
            if (ourSymbolLetter >= 97 && ourSymbolLetter <= 122) {
                LetterAZ = true;
            }
        }

        //2 Input by user letter from A-Z
        Scanner input = new Scanner(System.in);
        while (askSymbolLetter != ourSymbolLetter) {
            LetterAZ = false;
            while (!LetterAZ) {
                System.out.print("Input any letter from latin alphabet : ");
                char a = input.next().charAt(0);
                askSymbolLetter = (byte) a;
                if (askSymbolLetter >= 97 && askSymbolLetter <= 122) {
                    LetterAZ = true;
                } else {
                    System.out.println("Letter is out of latin alphabet. Try again");
                }
            }

            //3 Compere symbol letters
            int compereResult = Math.abs(askSymbolLetter - ourSymbolLetter);
            if (compereResult == 0) {
                System.out.println("Well done! Game over");
            } else if (compereResult >= 1 && compereResult <= 3) {
                System.out.println("Hot");
            } else if (compereResult > 3 && compereResult <= 6) {
                System.out.println("Wormy");
            } else if (compereResult > 6 && compereResult <= 10) {
                System.out.println("Chilly");
            } else if (compereResult > 10) {
                System.out.println("Cold");
            }
        }
    }
}

