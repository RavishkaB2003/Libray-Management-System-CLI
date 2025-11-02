package LibraryFunctions;

import bookObj.Book;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;
import java.util.Scanner;

public class LibraryDao {
            private ArrayList<Book> books = new ArrayList<>(); //List to store book objects

    public void addBook(Scanner sc){
        //Implementation for adding a book
        System.out.println("Enter Book Title: ");
        String title = sc.nextLine();
        System.out.println("Enter Book Author: ");
        String author = sc.nextLine();
        System.out.println("Enter Book ISBN: ");
        String isbn = sc.nextLine();
        System.out.println("Enter Book Genre: ");
        String genre = sc.nextLine();
        Book newBook = new Book(title, author, isbn, genre);
        books.add(newBook);
        System.out.println("Book added successfully!");

    }

    public void removeBook(Scanner sc){
        System.out.println("Enter ISBN of the book to remove:");
        String isbntoremove =sc.nextLine();
        Iterator<Book> bookIterator = books.iterator(); //Using iterator to avoid ConcurrentModificationException
        while(bookIterator.hasNext()){
            Book book = bookIterator.next();
            if(book.getIsbn().equals(isbntoremove)){
                bookIterator.remove();
                System.out.println("Book removed successfully!");
                return;
            }
        }
        System.out.println("Book with given ISBN not found.");
        //Implementation for removing a book
    }

    public void searchBook(Scanner sc){
        System.out.println("Enter Title or ISBN of the book to search:");
        String query = sc.nextLine();
        for(Book book: books){
            if(Objects.equals(book.getIsbn(), query) || Objects.equals(book.getTitle(), query)){ //Used Objects.equals since methods are String and not boolean
                System.out.println("Book Found: " + book.getTitle() + " by " + book.getAuthor() + ", ISBN: " + book.getIsbn() + ", Genre: " + book.getGenre());
                return;
            }

        }
        System.out.println("Book not found.");

        //Implementation for searching a book by title or ISBN
    }

    public void listAllBooks(){
        System.out.println("Listing all books in the library:");
        for(Book book: books){
            System.out.println("---------------------------");
            System.out.println("Title:" + book.getTitle());
            System.out.println("Author:" + book.getAuthor());
            System.out.println("Isbn:" + book.getIsbn());
            System.out.println("Genre:" + book.getGenre());
            System.out.println("---------------------------");
        }
        //Implementation for listing all books
    }

    public void updateBookDetails(Scanner sc){
        System.out.print("Select the book to update by entering its ISBN:");
        String isbntoupdate = sc.nextLine();
        for(Book book: books){
            if(book.getIsbn().equals(isbntoupdate)){
                System.out.println("Select details to update:");
                System.out.println("1. Title");
                System.out.println("2. Author");
                System.out.println("3. Genre");
                int choice = sc.nextInt();
                sc.nextLine(); // Consume newline
                switch (choice) {
                    case 1 : {
                        System.out.print("Enter new Title: ");
                        String newTitle = sc.nextLine();
                        book.setTitle(newTitle);
                        System.out.println("Title updated successfully!");
                        return;
                    }
                    case 2 : {
                        System.out.print("Enter new Author: ");
                        String newAuthor = sc.nextLine();
                        book.setAuthor(newAuthor);
                        System.out.println("Author updated successfully!");
                        return;
                    }
                    case 3 : {
                        System.out.print("Enter new Genre: ");
                        String newGenre = sc.nextLine();
                        book.setGenre(newGenre);
                        System.out.println("Genre updated successfully!");
                        return;
                    }

                    default : {
                        System.out.println("Invalid choice.");
                        return;
                    }
                }

            }
            System.out.println("Book with given ISBN not found.");
        }
        //Implementation for updating book details
    }
}
