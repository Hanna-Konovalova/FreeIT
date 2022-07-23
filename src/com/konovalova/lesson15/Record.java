package com.konovalova.lesson15;

import java.util.Date;

public class Record {

     private String textRecord;
     private Date noteDate;

     public Record(Date noteDate, String textRecord, Enum typeNote){
          this.noteDate = noteDate;
          this.textRecord = textRecord;
               }

     public Record(){};
     public String getTextRecord() {
          return textRecord;
     }
     public Date getNoteDate(){
          return noteDate;
     }
     public void setNoteDate(Date noteDate) {
          this.noteDate = noteDate;
     }
     public void setTextRecord(String textRecord) {
          this.textRecord = textRecord;
     }

}
