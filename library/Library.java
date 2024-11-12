package library;

import library.items.*;
import library.people.*;

//Imports
import java.util.ArrayList;
import java.util.List;


//Class
public class Library {


    //Lists
    private List<LibraryItem> items;
    private List<Author> authors;
    private List<Patron> patrons;


    //Constructor
    public Library() {
        items = new ArrayList<>();
        authors = new ArrayList<>();
        patrons = new ArrayList<>();
    }


    //Manage items
    public void addItem(LibraryItem item){
        items.add(item);
    }
    public void removeItem(LibraryItem item){
        items.remove(item);
    }
    public void borrowItem(Patron patron, String title){
        LibraryItem item = searchTitle(title);
        if(item != null && item.getCopies() > 0){
            patron.borrowItem(item);
            item.setCopies(item.getCopies() - 1);
            System.out.println("Item borrowed");
        }
        else{
            System.out.println("Item not available");
        }
    }
    public void returnItem(Patron patron, String title){
        LibraryItem item = searchTitle(title);
        if(item != null && patron.getBorrowedItems().contains(item)){
            patron.returnItem(item);
            item.setCopies(item.getCopies() + 1);
            System.out.println("Item returned");
        }
        else{
            System.out.println("Item not found");
        }
    }


    //Manage authors
    public void addAuthor(Author author){
        authors.add(author);
    }
    public void removeAuthor(Author author){
        authors.remove(author);
    }


    //Manage patrons
    public void addPatron(Patron patron){
        patrons.add(patron);
    }
    public void removePatron(Patron patron){
        patrons.remove(patron);
    }


    //Display lists
    public List<LibraryItem> getItems() {
        return items;
    }
    public List<Author> getAuthors() {
        return authors;
    }
    public List<Patron> getPatrons() {
        return patrons;
    }


    //Searches
    public Patron searchPatronByName(String name){
        for(Patron patron: patrons){
            if(patron.getName().equalsIgnoreCase(name)){
                return patron;
            }
        }

        return null;
    }
    public LibraryItem searchTitle(String title){
        for(LibraryItem item: items){
            if(item.getTitle().equalsIgnoreCase(title)){
                return item;
            }
        }

        return null;
    }
    public Author searchAuthor(String name){
        for(Author author: authors){
            if(author.getName().equalsIgnoreCase(name)){
                return author;
            }
        }

        return null;
    }
    public LibraryItem searchISBN(String isbn){
        for(LibraryItem item: items){
            if(item.getIsbn().equals(isbn)){
                return item;
            }
        }

        return null;
    }

    
}
