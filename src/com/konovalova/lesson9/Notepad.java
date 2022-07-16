package com.konovalova.lesson9;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.util.HashMap;

public class Notepad {

    public Record[] notepad;
    public Notepad(){}
    public void addRecord(int id){
        notepad = new Record[id];
        Scanner in = new Scanner(System.in);
        for(id=0;id<notepad.length;id++){
         System.out.println("Print Your text for note" + (id+1) + ":");
         String ourNote = in.nextLine();
         Record rec = new Record(new Date(),ourNote);
         notepad[id] = rec;}
    }
    public void printNotepad() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        for (int id = 0; id < notepad.length; id++) {
            System.out.println(id+1 + ", " + formatter.format(notepad[id].noteDate) + ", " + notepad[id].textRecord);
        }
    }
    public void printFreqDictionary(int id){

        String[] separatedWords = notepad[id].textRecord.split(" ");
        HashMap<String, Integer> separatedWordsCounter = new HashMap<>();
        for (String word : separatedWords)
        {
            if (!separatedWordsCounter.containsKey(word)){
                separatedWordsCounter.put(word, 0);
            }
            separatedWordsCounter.put(word, separatedWordsCounter.get(word) + 1);
        }
        for (String word : separatedWordsCounter.keySet()){
            System.out.println(word + " - meets in sentence - " + separatedWordsCounter.get(word) + " times");
        }
    }
    public void printNotesForWords(String searchWord) {

        for (int id = 0; id < notepad.length; id++) {

            if (notepad[id].textRecord.contains(searchWord)) {
                System.out.println("Search word '" + searchWord + "' found in note '" + notepad[id].textRecord + "'.");
            }
        }
    }
}
