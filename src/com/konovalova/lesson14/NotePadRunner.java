package com.konovalova.lesson14;

import java.util.Scanner;

public class NotePadRunner {

    public static void main(String[] args) {

        //Excel. Class9. Вынести основные методы работы с записной книжкой в интерфейс

        Notepad ourNotepad = new Notepad();
        Scanner in = new Scanner(System.in);
        System.out.println("How many notes would you like to add?");

        ourNotepad.addRecord(in.nextInt());
        ourNotepad.printNotepad();
        ourNotepad.recordsByWord();
        ourNotepad.recordsByDateRange();
    }
}

interface BaseNotepadMethods{

    int NO_RECORDS = 0;

    public void addRecord(int id);

    public void printNotepad();


}