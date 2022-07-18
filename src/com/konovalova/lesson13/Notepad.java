package com.konovalova.lesson13;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class Notepad {

    public Record[] notepad;
    Date bufDate;
    Random rand = new Random();
    Record ourRecord;
    boolean noteFound;
    Date currentDate;
    Date currentDate1;
    Date firstDateTime;
    Date secondDateTime;
    String currentDateStr;
    Date ourNDate;
    SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
    public Notepad() {
    }

    public void addRecord(int id) {
        notepad = new Record[id];
        Scanner in = new Scanner(System.in);
        for (id = 0; id < notepad.length; id++) {
            System.out.println("Print Your text for note" + (id + 1) + ":");
            String ourNote = in.nextLine();
            int randNum = rand.nextInt(4);// от 0 до 3
            Record rec = new Record();
            currentDate = getDateFormat(new Date());
            rec.setNoteDate(currentDate);
            rec.setTextRecord(ourNote);
            rec.setTypeNote(TypeNote.getTypeNoteByIndex(randNum));
            notepad[id] = rec;
        }
    }
    public void printNotepad() {
        for (int id = 0; id < notepad.length; id++) {
            System.out.println(id + 1 + ", " + formatter.format(notepad[id].getNoteDate()) + ", " + notepad[id].getTextRecord() + ", " + notepad[id].getTypeNote());
        }
    }
    public Record getNoteByNoteType(int indexNoteType,int id){
       if(notepad[id].getTypeNote().equals(TypeNote.getTypeNoteByIndex(indexNoteType))){
          return notepad[id];}
       else {return null;}
    }
    public void recordsByType(int indexNoteType){
        noteFound = false;
        for (int id = 0; id < notepad.length; id++) {
           ourRecord = getNoteByNoteType(indexNoteType,id);
           if(!(ourRecord ==null)){
               noteFound = true;
               System.out.println(formatter.format(ourRecord.getNoteDate()) + ",\n" +
                       ourRecord.getTextRecord() + ",\n" +
                       ourRecord.getTypeNote());
           }
        }
        if(!noteFound) {
            System.out.println("No notes found");
        }
    }
    public Record getNoteByWord(String ourWord,int id){
        if(notepad[id].getTextRecord().contains(ourWord)){
            return notepad[id];}
        else {return null;}
    }
    public void recordsByWord(String ourWord){
        noteFound = false;
        for (int id = 0; id < notepad.length; id++) {
            ourRecord = getNoteByWord(ourWord,id);
            if(!(ourRecord ==null)){
                noteFound = true;
                System.out.println(formatter.format(ourRecord.getNoteDate()) + ",\n" +
                        ourRecord.getTextRecord() + ",\n" +
                        ourRecord.getTypeNote());
            }
        }
        if(!noteFound) {
            System.out.println("No notes found");
        }
    }
    public Record getNoteByDateRange(int id, Date fDate, Date sDate){
        ourNDate = notepad[id].getNoteDate();
        if(ourNDate.after(fDate)&ourNDate.before(sDate)){
            return notepad[id];}
        else {return null;}
    }
    public void recordsByDateRange(){
        noteFound = false;
        Calendar calendar = new GregorianCalendar(2022, 6 , 18,18,42,15);
        firstDateTime = calendar.getTime();
        Calendar calendar1 = new GregorianCalendar(2022, 6 , 18,18,59,15);
        secondDateTime = calendar1.getTime();
        for (int id = 0; id < notepad.length; id++) {
            ourRecord = getNoteByDateRange(id,firstDateTime,secondDateTime);
            if(!(ourRecord ==null)){
                noteFound = true;
                System.out.println(formatter.format(ourRecord.getNoteDate()) + ",\n" +
                        ourRecord.getTextRecord() + ",\n" +
                        ourRecord.getTypeNote());
            }
        }
        if(!noteFound) {
            System.out.println("No notes found");
        }
    }
    private Date getDateFormat(Date curDate){
        currentDateStr = formatter.format(curDate);
        try{
            currentDate1 = formatter.parse(currentDateStr);}
        catch (ParseException e) {
            e.printStackTrace();
        }
        return currentDate1;
    }
}
