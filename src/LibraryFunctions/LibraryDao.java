package LibraryFunctions;

import bookObj.Book;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryDao {
            private ArrayList<Book> books = new ArrayList<>(); //List to store book objects

    public void addBook(Scanner sc){
        //Implementation for adding a book
        System.out.println("Enter Book Title: ");
        String title = sc.next();
        System.out.println("Enter Book Author: ");
        String author = sc.next();
        System.out.println("Enter Book ISBN: ");
        String isbn = sc.next();
        System.out.println("Enter Book Genre: ");
        String genre = sc.next();
        Book newBook = new Book(title, author, isbn, genre);
        books.add(newBook);
        System.out.println("Book added successfully!");

    }

    public static void removeBook(){
        //Implementation for removing a book
    }

    public static void searchBook(){
        //Implementation for searching a book by title or ISBN
    }

    public static void listAllBooks(){
        //Implementation for listing all books
    }

    public static void updateBookDetails(){
        //Implementation for updating book details
    }
}
