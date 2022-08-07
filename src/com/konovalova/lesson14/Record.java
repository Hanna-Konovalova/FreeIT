package com.konovalova.lesson14;

import java.util.Date;

public class Record {
     private String textRecord;
     private Date noteDate;
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
