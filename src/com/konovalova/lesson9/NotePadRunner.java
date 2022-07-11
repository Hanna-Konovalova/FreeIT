package com.konovalova.lesson9;

import java.util.Scanner;

public class NotePadRunner {

    public static void main(String[] args) {

        //Excel. Class5. Создать класс записной книжки, в котором хранятся записи дел. Создать в этом классе метод,
        // который выводит частотный словарь для определенной записи (запись можно определить по номеру/индексу)

        Notepad ourNotepad = new Notepad();
        ourNotepad.addRecord();
        ourNotepad.printNotepad();
        Scanner in = new Scanner(System.in);
        System.out.println("Put index of note for frequency dictionary: ");
        int idNote = in.nextInt();
        ourNotepad.printFreqDictionary(idNote-1);

        //Excel. Class7.Написать в классе записной книжки метод, который выводит в консоль название всех дел/сами дела,
        //в которых есть переданное в этот метод в качестве аргемента слово
        Scanner ini = new Scanner(System.in);
        System.out.println("Put word for search note: ");
        String searchWord = ini.nextLine();
        ourNotepad.printNotesForWords(searchWord);


    }
}
