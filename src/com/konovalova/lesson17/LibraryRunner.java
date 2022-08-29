package com.konovalova.lesson17;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";
        Library ourLibrary = new Library();

        while (!"7".equals(s)){
            System.out.println("Make choose action with library.\n1. Add book\n2. Input books from XML\n3. Output books to XML\n4. Edit book\n5. Print all books\n6. Delete book\n7. Exit program");
            s = scan.next();

            try {
                x = Integer.parseInt(s);
            } catch (NumberFormatException e){
                System.out.println("Input error");
            }

            switch (x){
                case 1:
                    ourLibrary.addBook();
                    break;
                case 2:
                    ourLibrary.inputBooksFromXML();
                    break;
                case 3:
                    ourLibrary.outputBooksToXML();
                    break;
                case 4:
                    ourLibrary.editBook();
                    break;
                case 5:
                    ourLibrary.printLibrary();
                    break;
                case 6:
                    ourLibrary.deleteBook();
            }
        }
        System.out.println("Library work complete");
        scan.close();
    }
}
interface BookBuilder {
    Book create();
}
interface PrintInformation{
    void print(String strToPrint);
}