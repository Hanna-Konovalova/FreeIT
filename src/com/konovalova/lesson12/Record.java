package com.konovalova.lesson12;

import java.util.Date;

public class Record {

     private String textRecord;
     private Date noteDate;

     public Record(Date noteDate,String textRecord){
          this.noteDate = noteDate;
          this.textRecord = textRecord;
     }
     public String getTextRecord(){return textRecord;}
     public Date getNoteDate(){return noteDate;}
     public void setTextRecord(String textRecord){
          this.textRecord = textRecord;
     }
     public void setNoteDate(Date noteDate) {
          this.noteDate = noteDate;
     }
}
