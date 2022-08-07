package com.konovalova.lesson13;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatterBuilder;
import java.util.*;

public class Notepad implements Cloneable{

    private List<Record> records = new ArrayList<>();

    //
    public Notepad() {
    }
    public void addRecord(String ourNote) {

        Date currentDate = getDateFormat(new Date());
        Random rand = new Random();

        int randNum = rand.nextInt(4);// от 0 до 3
        Record rec = new Record();
        rec.setNoteDate(currentDate);
        rec.setTextRecord(ourNote);
        rec.setTypeNote(TypeNote.getTypeNoteByIndex(randNum));
        records.add(rec);
    }
    public void printNotepad() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        for (int id = 0; id < records.size(); id++) {
            System.out.println(id + 1 + ", " + formatter.format(records.get(id).getNoteDate()) + ", " + records.get(id).getTextRecord() + ", " + records.get(id).getTypeNote());
        }
    }
    private Record getNoteByNoteType(int indexNoteType,int id){
       if(records.get(id).getTypeNote().equals(TypeNote.getTypeNoteByIndex(indexNoteType))){
          return records.get(id);}
       else {return null;}
    }
    public List getRecordsByType(int indexNoteType){

        boolean noteFound = false;
        Record ourRecord;
        List<Record> returnRecords = new ArrayList<>();

        for (int id = 0; id < records.size(); id++) {
           ourRecord = getNoteByNoteType(indexNoteType,id);
           if(!(ourRecord ==null)){
               noteFound = true;
               returnRecords.add(ourRecord);
           }
        }
        if(!noteFound) {
            System.out.println("No notes found by type");
        }
        return returnRecords;
    }
    private Record getNoteByWord(String ourWord,int id){
        if(records.get(id).getTextRecord().contains(ourWord)){
            return records.get(id);}
        else {return null;}
    }
    public List getRecordsByWord(String ourWord){

        List<Record> returnRecords = new ArrayList<>();
        boolean noteFound = false;
        Record ourRecord;

        for (int id = 0; id < records.size(); id++) {
            ourRecord = getNoteByWord(ourWord,id);
            if(!(ourRecord ==null)){
                noteFound = true;
                returnRecords.add(ourRecord);
            }
        }
        if(!noteFound) {
            System.out.println("No notes found by word search");
        }
        return returnRecords;
    }
    private Record getNoteByDateRange(int id, Date fDate, Date sDate){

        Date ourNDate = records.get(id).getNoteDate();
        if(ourNDate.after(fDate)&ourNDate.before(sDate)){
            return records.get(id);}
        else {return null;}
    }
    public List getRecordsByDateRange(){

        List<Record> returnRecords = new ArrayList<>();
        boolean noteFound = false;
        Record ourRecord;
        Date firstDateTime;
        Date secondDateTime;

        Calendar calendar = new GregorianCalendar(2022, 6 , 18,18,42,15);
        firstDateTime = calendar.getTime();
        Calendar calendar1 = new GregorianCalendar(2022, 6 , 18,18,59,15);
        secondDateTime = calendar1.getTime();
        for (int id = 0; id < records.size(); id++) {
            ourRecord = getNoteByDateRange(id,firstDateTime,secondDateTime);
            if(!(ourRecord ==null)){
                noteFound = true;
                returnRecords.add(ourRecord);
            }
        }
        if(!noteFound) {
            System.out.println("No notes found for date range");
        }
        return returnRecords;
    }
    private Date getDateFormat(Date curDate){

        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        Date currentDate1 = new Date();
        String currentDateStr = formatter.format(curDate);

        try{
            currentDate1 = formatter.parse(currentDateStr);}
        catch (ParseException e) {
            e.printStackTrace();
        }
        return currentDate1;
    }

}
