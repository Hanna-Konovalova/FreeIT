package com.konovalova.lesson12;

import java.text.SimpleDateFormat;
import java.util.*;

public class Notepad {

    public Record[] notepad;
    Date bufDate;

    public Notepad() {
    }

    public void addRecord(int id) {
        notepad = new Record[id];
        Scanner in = new Scanner(System.in);
        for (id = 0; id < notepad.length; id++) {
            System.out.println("Print Your text for note" + (id + 1) + ":");
            String ourNote = in.nextLine();
            Record rec = new Record(new Date(), ourNote);
            notepad[id] = rec;
        }
    }

    public void printNotepad() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        for (int id = 0; id < notepad.length; id++) {
            System.out.println(id + 1 + ", " + formatter.format(notepad[id].noteDate) + ", " + notepad[id].textRecord);
        }
    }

    public void sortRecords() {

        for (int out = notepad.length - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (notepad[in].noteDate.compareTo(notepad[in + 1].noteDate) > 0) {
                    bufDate = notepad[in].noteDate;
                    notepad[in].noteDate = notepad[in + 1].noteDate;
                    notepad[in + 1].noteDate = bufDate;
                }
            }
        }
    }
}
