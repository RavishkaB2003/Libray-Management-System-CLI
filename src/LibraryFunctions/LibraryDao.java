package LibraryFunctions;

import bookObj.Book;

import java.util.ArrayList;
import java.util.Objects;
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

    public void removeBook(Scanner sc){
        System.out.println("Enter ISBN of the book to remove:");
        String isbntoremove =sc.nextLine();
        for(Book book: books){
            if(book.getIsbn().equals(isbntoremove)){
                books.remove(book);
                System.out.println("Book removed successfully!");
                return;
            }
            System.out.println("Book with given ISBN not found.");
        }
        //Implementation for removing a book
    }

    public void searchBook(Scanner sc){
        System.out.println("Enter Title or ISBN of the book to search:");
        String query = sc.nextLine();
        for(Book book: books){
            if(Objects.equals(book.getIsbn(), query) || Objects.equals(book.getTitle(), query)){ //Used Objects.equals since methods are String and not boolean
                System.out.println("Book Found: " + book.getTitle() + " by " + book.getAuthor());
                return;
            }
            System.out.println("Book not found.");
        }

        //Implementation for searching a book by title or ISBN
    }

    public void listAllBooks(){
        //Implementation for listing all books
    }

    public void updateBookDetails(){
        //Implementation for updating book details
    }
}
