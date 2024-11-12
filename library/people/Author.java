package library.people;

import library.items.*;

//Imports
import java.util.List;
import java.util.ArrayList;


//Class
public class Author {
    

    //String details
    private String name;
    private String dateOfBirth;
    private List<LibraryItem> writtenItems;


    //Constructor
    public Author(String name, String dateOfBirth){
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.writtenItems = new ArrayList<>();
    }


    //Get functions
    public String getName(){
        return name;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public List<LibraryItem> getWrittenItems() {
        return writtenItems;
    }


    //Set functions
    public void setName(String name){
        this.name = name;
    }
    public void setDateOfBirth(String dateOfBirth){
        this.dateOfBirth = dateOfBirth;
    }


    //Edit written items list
    public void addWrittenItem(LibraryItem item){
        writtenItems.add(item);
    }
    public void removeWrittenItem(LibraryItem item){
        writtenItems.remove(item);
    }
    

    //Display info
    public void displayAuthor() {
        System.out.println("Author Name: " + getName());
        System.out.println("Date of Birth: " + getDateOfBirth());
        System.out.println("Written Items: " + getWrittenItems());
    }
    
    
}
