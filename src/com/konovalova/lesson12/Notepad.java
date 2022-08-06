package com.konovalova.lesson12;

import java.text.SimpleDateFormat;
import java.util.*;

public class Notepad {

    private List<Record> records = new ArrayList<>();
    public Notepad() {}
    public void addRecord(String ourNote) {
        Record rec = new Record(new Date(), ourNote);
        records.add(rec);
    }
    public void printNotepad() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        for (int id = 0; id < records.size(); id++) {
            System.out.println(id + 1 + ", " + formatter.format(records.get(id).getNoteDate()) + ", " + records.get(id).getTextRecord());
        }
    }
    public void sortRecords() {
        Date bufDate;
        for (int out = records.size() - 1; out >= 1; out--) {
            for (int in = 0; in < out; in++) {
                if (records.get(in).getNoteDate().compareTo(records.get(in+1).getNoteDate()) > 0) {
                    bufDate = records.get(in).getNoteDate();
                    records.get(in).setNoteDate(records.get(in+1).getNoteDate());
                    records.get(in+1).setNoteDate(bufDate);
                }
            }
        }
    }
}
