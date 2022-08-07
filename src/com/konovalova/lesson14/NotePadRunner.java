package com.konovalova.lesson14;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NotePadRunner {
    public static void main(String[] args) {

        //Excel. Class9. Вынести основные методы работы с записной книжкой в интерфейс
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Notepad ourNotepad = new Notepad();

        System.out.println("Print Your text for notes:");
        Scanner in = new Scanner(System.in);
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.addRecord(in.nextLine());
        ourNotepad.printNotepad();

        List<Record> recordsByWord = new ArrayList<>();
        System.out.println("Put word for search note:");
        Scanner ini = new Scanner(System.in);
        recordsByWord = ourNotepad.getRecordsByWord(ini.nextLine());
        for(int i=0; i<recordsByWord.size();i++){
            System.out.println(formatter.format(recordsByWord.get(i).getNoteDate()) + ",\n" +
                    recordsByWord.get(i).getTextRecord());
        }

        List<Record> recordsByDateRange = new ArrayList<>();
        recordsByDateRange = ourNotepad.getRecordsByDateRange();
        for(int i=0; i<recordsByDateRange.size();i++){
            System.out.println(formatter.format(recordsByDateRange.get(i).getNoteDate()) + ",\n" +
                    recordsByDateRange.get(i).getTextRecord());
        }
        in.close();
        ini.close();
    }
}

interface BaseNotepad{

    String ourNote = "";

    void addRecord(String ourNote);
    void printNotepad();
}