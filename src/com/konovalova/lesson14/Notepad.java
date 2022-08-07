package com.konovalova.lesson14;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Notepad implements BaseNotepad{

    private List<Record> records = new ArrayList<>();
   public Notepad() {
    }

    public void addRecord(String ourNote) {
        Date currentDate = getDateFormat(new Date());
        if(ourNote==""){
            //System.out.println("No records for Notepad");
        } else{

        Record rec = new Record();
        rec.setNoteDate(currentDate);
        rec.setTextRecord(ourNote);
        records.add(rec);
        }
    }
    public void printNotepad() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        if (records != null) {
            for (int id = 0; id < records.size(); id++) {
                System.out.println(id + 1 + ", " + formatter.format(records.get(id).getNoteDate()) + ", " + records.get(id).getTextRecord());
            }
        }
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

