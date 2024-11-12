package library.items;
//Class
public abstract class LibraryItem {
    

    //String details
    private String id;
    private String title;
    private String author;
    private String isbn;
    private String publisher;
    private int copies;


    //Constructor
    public LibraryItem(String id, String title, String author, String isbn, String publisher, int copies) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.copies = copies;
    }


    //Get
    public String getId() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthors() {
        return author;
    }
    public String getIsbn() {
        return isbn;
    }
    public String getPublisher() {
        return publisher;
    }
    public int getCopies(){
        return copies;
    }
    public abstract String getItemType();


    //Set
    public void setId(String id) {
        this.id = id;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setCopies(int copies){
        this.copies = copies;
    }


}
