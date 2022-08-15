package com.konovalova.lesson17;

import java.util.*;

public class Library {

    private List<Book> library = new ArrayList<>();
    public Library() {
    }
    public void addBook() {

        Scanner in = new Scanner(System.in);
        Scanner ini = new Scanner(System.in);
        System.out.println("Print book id:");
        int idBook = in.nextInt();
        //Проверка книги по существующему id
        if(!bookByIdExist(idBook)){

            System.out.println("Choose book genre (DETECTIVE(0),\n" +
                    "    HORROR(1),\n" +
                    "    FICTION(2),\n" +
                    "    NOVEL(3);)");
            int idGenre = in.nextInt();
            System.out.println("Print book title:");
            String title = ini.nextLine();
            Book book = new Book();
            book.setTitle(title);
            book.setIndexBook(idBook);
            book.setGenreBook(Genre.getGenreByIndex(idGenre));
            library.add(book);}
        else {
            System.out.println("Such book already exist");
        }

    }
    public void printLibrary() {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";
        Comparator<Book> countryModelsComparator = Comparator.comparing(Book::getTitle);

        System.out.println("Print library by.\n1. Title (ascending)\n2. Title (descending)\n3. New ones first");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Input error");
            }

            switch (x){
                case 1:
                    Collections.sort(library, countryModelsComparator);
                    for (int id = 0; id < library.size(); id++) {
                        System.out.println(library.get(id).getIndexBook() + ", " + library.get(id).getGenreBook() + ", " + library.get(id).getTitle());
                    }
                    break;
                case 2:
                    Collections.sort(library, countryModelsComparator);
                    for (int id = library.size()-1; id >= 0; id--) {
                        System.out.println(library.get(id).getIndexBook() + ", " + library.get(id).getGenreBook() + ", " + library.get(id).getTitle());
                    }
                    break;
                case 3:
                    for (int id = library.size()-1; id >= 0; id--) {
                        System.out.println(library.get(id).getIndexBook() + ", " + library.get(id).getGenreBook() + ", " + library.get(id).getTitle());
                    }
            }
    }
    private boolean bookByIdExist(int idBook){
        boolean bookExist = false;
        for (int id = 0; id < library.size(); id++) {
            if(library.get(id).getIndexBook()==idBook){
                bookExist = true;
                break;
            };
        }
        return bookExist;
    }
    public void editBook(){
        Scanner in = new Scanner(System.in);
        System.out.println("Print book id:");
        int idBook = in.nextInt();
        Book ourBook = getBookById(idBook);
        if(ourBook!=null){
            System.out.println("Print new book id:");
            int newIdBook = in.nextInt();
            System.out.println("Choose new book genre (DETECTIVE(0),\n" +
                    "    HORROR(1),\n" +
                    "    FICTION(2),\n" +
                    "    NOVEL(3);)");
            int newIdGenre = in.nextInt();
            Scanner ini = new Scanner(System.in);
            System.out.println("Print new book title:");
            String newTitle = ini.nextLine();

            ourBook.setIndexBook(newIdBook);
            ourBook.setGenreBook(Genre.getGenreByIndex(newIdGenre));
            ourBook.setTitle(newTitle);

        }else {
            System.out.println("Book not found");
        }
    }
    private Book getBookById(int idBook){
        for (int id = 0; id < library.size(); id++) {
            Book ourBook = library.get(id);
            if(ourBook.getIndexBook()==idBook){
                return ourBook;
            };
        }
        return null;
    }
    public void deleteBook(){
        Scanner in = new Scanner(System.in);
        System.out.println("Print book id:");
        int idBook = in.nextInt();
        Book ourBook = getBookById(idBook);
        if(ourBook!=null){
            library.remove(ourBook);
        }else {
            System.out.println("Book not found");
        }

    }
}
