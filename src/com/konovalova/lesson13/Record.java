package com.konovalova.lesson13;

import java.util.Date;

public class Record {

     private String textRecord;
     private Date noteDate;
     private Enum typeNote;

     public Record(Date noteDate,String textRecord,Enum typeNote){
          this.noteDate = noteDate;
          this.textRecord = textRecord;
          this.typeNote = typeNote;
     }

     public Record(){};

     public String getTextRecord() {
          return textRecord;
     }
     public Date getNoteDate(){
          return noteDate;
     }
     public Enum getTypeNote(){
          return typeNote;
     }
     public void setNoteDate(Date noteDate) {
          this.noteDate = noteDate;
     }
     public void setTextRecord(String textRecord) {
          this.textRecord = textRecord;
     }
     public void setTypeNote(Enum typeNote) {
          this.typeNote = typeNote;
     }
}
