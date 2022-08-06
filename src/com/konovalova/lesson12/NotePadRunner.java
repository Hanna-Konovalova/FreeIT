package com.konovalova.lesson12;

import java.util.Collections;
import java.util.Scanner;

public class NotePadRunner {

    public static void main(String[] args) {

        //Excel. Class6. Отсортировать записи, хранящиеся в записной книжке по
        // времени их добавления и вывести в этом порядке в консоль

        Scanner in = new Scanner(System.in);
        Notepad ourNotepad = new Notepad();
        System.out.println("Print Your text for notes:");
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.printNotepad();
        ourNotepad.sortRecords();
        ourNotepad.printNotepad();
        in.close();
    }
}
