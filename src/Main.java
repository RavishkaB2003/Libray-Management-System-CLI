import LibraryFunctions.LibraryDao;
import bookObj.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LibraryDao library = new LibraryDao();
        Scanner sc = new Scanner(System.in);
        System.out.println("***************************************");
        System.out.println("Welcome to the Library Management System");
        System.out.println("***************************************");

        while (true) {
            System.out.println("Select an option");
            System.out.println("1. Add Book");
            System.out.println("2. Remove Book");
            System.out.println("3. Search Book by Title or ISBN");
            System.out.println("4. List All Books");
            System.out.println("5. Update Book Details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> library.addBook(sc);
                case 2 -> library.removeBook(sc);
                case 3 -> library.searchBook(sc);
                case 4 -> library.listAllBooks();
                case 5 -> library.updateBookDetails();
                case 6 -> {
                    System.out.println("Exiting the system. Goodbye!");
                    sc.close();
                    System.exit(0);
                }
                default -> {
                    System.out.println("Invalid choice. Please try again.");
                }
            }
        }
    }

    //Add book
    //Remove book
    //Search book by title or isbn
    //List all books
    //Update book details
}
