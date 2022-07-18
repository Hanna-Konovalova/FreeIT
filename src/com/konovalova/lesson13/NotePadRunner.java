package com.konovalova.lesson13;

import java.util.Scanner;

public class NotePadRunner {

    public static void main(String[] args) {

        //Excel. Class8. Добавить каждой записи в записной книге поле типа (еnum): покупки/дела/звонки/день рождения и т.п.
        // Защитить записи от возможности изменения "снаружи"

        Notepad ourNotepad = new Notepad();
        Scanner in = new Scanner(System.in);
        System.out.println("How many notes would you like to add?");
        ourNotepad.addRecord(in.nextInt());
        ourNotepad.printNotepad();

        // Создать метод, возвращающий все запси переданного в метод типа
        System.out.println("Choose type note (0-PHONECALL,\n" +
                "   1-BIRTHDAY,\n" +
                "   2-MEETING,\n" +
                "   3-TODO;)");
        ourNotepad.recordsByType(in.nextInt());

        // Создать метод, возвращающий все запси в которых содержится переданное слово
        System.out.println("Put word for search note:");
        Scanner ini = new Scanner(System.in);
        ourNotepad.recordsByWord(ini.nextLine());

        // Создать метод, возвращающий все запси в заданном промежутке времени
        ourNotepad.recordsByDateRange();

    }
}
