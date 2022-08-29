package com.konovalova.lesson17;

public enum Genre {

    DETECTIVE(0),
    HORROR(1),
    FICTION(2),
    NOVEL(3);

    private int indexType;

    Genre(int indexType) {
        this.indexType = indexType;
    }

    public static Genre getGenreByIndex(int indexType) {
        return Genre.values()[indexType];
    }
}
