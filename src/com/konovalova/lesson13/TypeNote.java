package com.konovalova.lesson13;

public enum TypeNote {
    PHONECALL(0),
    BIRTHDAY(1),
    MEETING(2),
    TODO(3);

    private int indexType;

      TypeNote(int indexType) {
        this.indexType = indexType;
    }

    public static TypeNote getTypeNoteByIndex(int indexType) {
        return TypeNote.values()[indexType];
    }
}
