package library.items;
public class Book extends LibraryItem{


    //String details
    private String format;


    //Constructor
    public Book(String id, String title, String author, String isbn, String publisher, int copies, String format){
        super(id, title, author, isbn, publisher, copies);
        this.format = format;
    }


    //Get
    public String getFormat(){
        return format;
    }
    public String getItemType(){
        return "Book: " + format;
    }
    

    //Set
    public void setFormat(String format){
        this.format = format;
    }


    //Display info
    public void displayItemDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Book ID: " + getId());
        System.out.println("Author: " + getAuthors());
        System.out.println("Publisher: " + getPublisher());
        System.out.println("ISBN: " + getIsbn());
        System.out.println("Format: " + getFormat());
        System.out.println("Amount in stock: " + getCopies());
    }
    

}
