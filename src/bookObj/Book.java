package bookObj;

//Class representing a book in a library system
public class Book {

    //Attributes of the book
    private String title;
    private String author;
    private String isbn;
    private String Genre;


    //Constructor to initialize a book object
    public Book(String btitle, String bauthor, String bisbn, String bGenre){
        this.title = btitle;
        this.author = bauthor;
        this.isbn = bisbn;
        this.Genre = bGenre;
    }

    //Getters for book attibutes
    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getIsbn(){
        return isbn;
    }
    
    public String getGenre(){
        return Genre;
    }
    
    //Setters for book attributes
    public void setTitle(String booktitle){
        this.title = booktitle;
    }
    
    public void setAuthor(String bookauthor){
        this.author = bookauthor;
    }
    
    public void setIsbn(String bookisbn){
        this.isbn = bookisbn;
    }
    
    public void setGenre(String bookGenre){
        this.Genre = bookGenre;
    }
    
    
    
}
