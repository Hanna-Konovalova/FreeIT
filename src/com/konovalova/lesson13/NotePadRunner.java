package com.konovalova.lesson13;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotePadRunner {

    public static void main(String[] args) throws CloneNotSupportedException {

        //Excel. Class8. Добавить каждой записи в записной книге поле типа (еnum): покупки/дела/звонки/день рождения и т.п.
        // Защитить записи от возможности изменения "снаружи"
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Notepad ourNotepad = new Notepad();

        System.out.println("Print Your text for notes:");
        Scanner in = new Scanner(System.in);
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.printNotepad();

        // Создать метод, возвращающий все запси переданного в метод типа
        List<Record> recordsByType = new ArrayList<>();
        System.out.println("Choose type note (0-PHONECALL,\n" +
                "   1-BIRTHDAY,\n" +
                "   2-MEETING,\n" +
                "   3-TODO;)");
        recordsByType = ourNotepad.getRecordsByType(in.nextInt());
        for(int i=0; i<recordsByType.size();i++){
            System.out.println(formatter.format(recordsByType.get(i).getNoteDate()) + ",\n" +
                    recordsByType.get(i).getTextRecord() + ",\n" +
                    recordsByType.get(i).getTypeNote());
        }


        // Создать метод, возвращающий все запси в которых содержится переданное слово
        List<Record> recordsByWord = new ArrayList<>();
        System.out.println("Put word for search note:");
        Scanner ini = new Scanner(System.in);
        recordsByWord = ourNotepad.getRecordsByWord(ini.nextLine());
        for(int i=0; i<recordsByWord.size();i++){
            System.out.println(formatter.format(recordsByWord.get(i).getNoteDate()) + ",\n" +
                    recordsByWord.get(i).getTextRecord() + ",\n" +
                    recordsByWord.get(i).getTypeNote());
        }

        // Создать метод, возвращающий все запси в заданном промежутке времени
        List<Record> recordsByDateRange = new ArrayList<>();
        recordsByDateRange = ourNotepad.getRecordsByDateRange();
        for(int i=0; i<recordsByDateRange.size();i++){
            System.out.println(formatter.format(recordsByDateRange.get(i).getNoteDate()) + ",\n" +
                    recordsByDateRange.get(i).getTextRecord() + ",\n" +
                    recordsByDateRange.get(i).getTypeNote());
        }
        in.close();
        ini.close();
    }
}
