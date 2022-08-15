package com.konovalova.lesson17;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = 0;
        String s ="";
        Library ourLibrary = new Library();

        while (!"5".equals(s)){
            System.out.println("Make choose action with library.\n1. Add book\n2. Edit book\n3. Print all books\n4. Delete book\n5. Exit program");
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
                    ourLibrary.editBook();
                    break;
                case 3:
                    ourLibrary.printLibrary();
                    break;
                case 4:
                    ourLibrary.deleteBook();
            }
        }
        System.out.println("Library work complete");
        scan.close();
    }

}
