package com.konovalova.lesson17;

import java.util.Date;

public class Book{

    private String title;
    private Genre genreBook;
    private int idBook;

    public Book(){}

    public int getIndexBook() {
        return idBook;
    }
    public String getTitle(){
        return title;
    }
    public Genre getGenreBook(){
        return genreBook;
    }
    public void setIndexBook(int indexBook) {
        this.idBook = indexBook;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setGenreBook(Genre genreBook) {
        this.genreBook = genreBook;
    }
}
