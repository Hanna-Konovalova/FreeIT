package com.konovalova.lesson15;

import java.util.Scanner;

public class NotePadRunner {

    public static boolean privNotepad = false;

    public static void main(String[] args) {

        //Excel. Class11. Написать свою аннотацию для метода или для поля класса
        annotAnalizator(Notepad.class);
        if(!privNotepad) {
            Scanner in = new Scanner(System.in);
            System.out.println("How many notes would you like to add?");
            Notepad ourNotepad = new Notepad();
            ourNotepad.addRecord(in.nextInt());
            ourNotepad.printNotepad();
            ourNotepad.recordsByWord();
            ourNotepad.recordsByDateRange();
        }
    }
    private static void annotAnalizator(Class <? extends Object> clazz) {
        boolean annotPresernt = clazz.isAnnotationPresent(IsAvailableNotepad.class);
        if (annotPresernt) {
            IsAvailableNotepad isAvailableNotepad = clazz.getAnnotation(IsAvailableNotepad.class);
            boolean ourIsAv = isAvailableNotepad.publicNotepad();
            if (!ourIsAv) {
                privNotepad = true;
                System.out.println("Private notepad");
            }
        }
    }
}

