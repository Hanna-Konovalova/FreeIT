package com.konovalova.lesson17;

import javax.xml.stream.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class  Library {

    private List<Book> library = new ArrayList<>();
    PrintInformation printer = strToPrint->System.out.println(strToPrint);
    public Library() {
    }
    public void addBook() {

        Scanner in = new Scanner(System.in);
        Scanner ini = new Scanner(System.in);
        printer.print("Print book id:");
        int idBook = in.nextInt();
        //Проверка книги по существующему id
        if(!bookByIdExist(idBook)){

            printer.print("Choose book genre (DETECTIVE(0),\n" +
                    "    HORROR(1),\n" +
                    "    FICTION(2),\n" +
                    "    NOVEL(3);)");
            int idGenre = in.nextInt();
            printer.print("Print book title:");
            String title = ini.nextLine();
            BookBuilder bookBuilder = Book::new;
            Book book = bookBuilder.create();
            book.setTitle(title);
            book.setIndexBook(idBook);
            book.setGenreBook(Genre.getGenreByIndex(idGenre));
            library.add(book);}
        else {
            printer.print("Such book already exist");
        }
    }
    public void printLibrary() {

        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";

        Comparator<Book> countryModelsComparator = Comparator.comparing(Book::getTitle);

        printer.print("Print library by.\n1. Title (ascending)\n2. Title (descending)\n3. New ones first");
        s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                printer.print("Input error");
            }

            switch (x){
                case 1:
                    Collections.sort(library, countryModelsComparator);
                    for (int id = 0; id < library.size(); id++) {
                        printer.print(library.get(id).getIndexBook() + ", " + library.get(id).getGenreBook() + ", " + library.get(id).getTitle());
                    }
                    break;
                case 2:
                    Collections.sort(library, countryModelsComparator);
                    for (int id = library.size()-1; id >= 0; id--) {
                        printer.print(library.get(id).getIndexBook() + ", " + library.get(id).getGenreBook() + ", " + library.get(id).getTitle());
                    }
                    break;
                case 3:
                    for (int id = library.size()-1; id >= 0; id--) {
                        printer.print(library.get(id).getIndexBook() + ", " + library.get(id).getGenreBook() + ", " + library.get(id).getTitle());
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
        printer.print("Print book id:");
        int idBook = in.nextInt();
        Book ourBook = getBookById(idBook);
        if(ourBook!=null){
            printer.print("Print new book id:");
            int newIdBook = in.nextInt();
            printer.print("Choose new book genre (DETECTIVE(0),\n" +
                    "    HORROR(1),\n" +
                    "    FICTION(2),\n" +
                    "    NOVEL(3);)");
            int newIdGenre = in.nextInt();
            Scanner ini = new Scanner(System.in);
            printer.print("Print new book title:");
            String newTitle = ini.nextLine();

            ourBook.setIndexBook(newIdBook);
            ourBook.setGenreBook(Genre.getGenreByIndex(newIdGenre));
            ourBook.setTitle(newTitle);
        }else {
            printer.print("Book not found");
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
        printer.print("Print book id:");
        int idBook = in.nextInt();
        Book ourBook = getBookById(idBook);
        if(ourBook!=null){
            library.remove(ourBook);
        }else {
            printer.print("Book not found");
        }
    }
    public void inputBooksFromXML() {

        Scanner scan = new Scanner(System.in);
        printer.print("Input XML file name:");
        String XMLFileName = scan.next();

        boolean isTitle = false;
        boolean isGenre = false;
        boolean isIdBook = false;
        String stringTitle = "";
        String stringGenre = "";
        String stringIdBook = "";

        XMLStreamReader xmlr = null;
        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            xmlr = xmlInputFactory.createXMLStreamReader(new FileInputStream(XMLFileName + ".xml"));

            while (xmlr.hasNext()) {
                xmlr.next();
                if (xmlr.isStartElement()) {
                    isTitle = xmlr.getLocalName().equalsIgnoreCase("Title");
                    isGenre = xmlr.getLocalName().equalsIgnoreCase("Genre");
                    isIdBook = xmlr.getLocalName().equalsIgnoreCase("IdBook");
                }
                else if (xmlr.hasText() && xmlr.getText().trim().length() > 0) {

                    if(isTitle){stringTitle = xmlr.getText();}
                    if(isGenre){stringGenre = xmlr.getText();}
                    if(isIdBook){stringIdBook = xmlr.getText();}

                }
                else if (xmlr.isEndElement()) {
                    if(xmlr.getLocalName().equalsIgnoreCase("Book")&!stringTitle.equals("")&!stringGenre.equals("")&!stringIdBook.equals("")) {
                        int idBook = Integer.valueOf(stringIdBook);
                        if (!bookByIdExist(idBook)) {
                            Book book = new Book();
                            book.setTitle(stringTitle);
                            book.setIndexBook(idBook);
                            book.setGenreBook(Genre.valueOf(stringGenre));
                            library.add(book);
                        } else {
                            printer.print("Such book already exist");}
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException ex) {
            ex.printStackTrace();
        } finally {
            if(Objects.nonNull(xmlr)) {
                try {
                    xmlr.close();
                } catch (XMLStreamException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    public void outputBooksToXML() {

        XMLStreamWriter writer = null;

        try {
            Scanner scan = new Scanner(System.in);
            printer.print("Input XML file name for save:");
            String XMLFileSaveName = scan.next();

            XMLOutputFactory output = XMLOutputFactory.newInstance();
            writer = output.createXMLStreamWriter(new FileWriter(XMLFileSaveName + ".xml"));

            writer.writeStartDocument("1.0");
            writer.writeStartElement("books");
            // Делаем цикл для книг
            for (int id = 0; id < library.size(); id++) {

                writer.writeStartElement("Book");
                // Title
                writer.writeStartElement("Title");
                writer.writeCharacters(library.get(id).getTitle());
                writer.writeEndElement();
                // Genre
                writer.writeStartElement("Genre");
                writer.writeCharacters(String.valueOf(library.get(id).getGenreBook()));
                writer.writeEndElement();
                // idBook
                writer.writeStartElement("idBook");
                writer.writeCharacters(String.valueOf(library.get(id).getIndexBook()));
                writer.writeEndElement();

                writer.writeEndElement();
            }
            writer.writeEndElement();
            writer.writeEndDocument();
            writer.flush();

            printer.print("File 'books.xml' is created");
        } catch (XMLStreamException | IOException ex) {
            ex.printStackTrace();
            printer.print("File 'books.xml' is not created");
        } finally {
            if(Objects.nonNull(writer)) {
                try {
                    writer.close();
                } catch (XMLStreamException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
