package com.konovalova.lesson9;

import java.util.Scanner;

public class NotePadRunner {

    public static void main(String[] args) {

        //Excel. Class5. Создать класс записной книжки, в котором хранятся записи дел. Создать в этом классе метод,
        // который выводит частотный словарь для определенной записи (запись можно определить по номеру/индексу)

        Notepad ourNotepad = new Notepad();
        Scanner in = new Scanner(System.in);
        System.out.println("How many notes would you like to add?");
        ourNotepad.addRecord(in.nextInt());
        ourNotepad.printNotepad();
        Scanner ini = new Scanner(System.in);
        System.out.println("Put index of note for frequency dictionary: ");
        int idNote = ini.nextInt();
        ourNotepad.printFreqDictionary(idNote-1);

        //Excel. Class7.Написать в классе записной книжки метод, который выводит в консоль название всех дел/сами дела,
        //в которых есть переданное в этот метод в качестве аргемента слово
        Scanner inii = new Scanner(System.in);
        System.out.println("Put word for search note: ");
        String searchWord = inii.nextLine();
        ourNotepad.printNotesForWords(searchWord);


    }
}
