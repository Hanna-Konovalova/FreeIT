package com.konovalova.lesson12;

import java.util.Collections;
import java.util.Scanner;

public class NotePadRunner {

    public static void main(String[] args) {

        //Excel. Class6. Отсортировать записи, хранящиеся в записной книжке по
        // времени их добавления и вывести в этом порядке в консоль

        Notepad ourNotepad = new Notepad();
        Scanner in = new Scanner(System.in);
        System.out.println("How many notes would you like to add?");
        ourNotepad.addRecord(in.nextInt());
        ourNotepad.printNotepad();
        ourNotepad.sortRecords();
        ourNotepad.printNotepad();


    }
}
