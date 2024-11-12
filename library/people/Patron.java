package library.people;
import library.items.*;
//Imports
import java.util.List;
import java.util.ArrayList;


//Class
public abstract class Patron {


    //String details
    private String name;
    private String address;
    private String phoneNumber;
    private List<LibraryItem> borrowedItems;


    //Constructor
    public Patron(String name, String address, String phoneNumber){
        this.name = name;
        this.address = address;
        this.phoneNumber= phoneNumber;
        this.borrowedItems = new ArrayList<>();
    }


    //Get
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }
    public List<LibraryItem> getBorrowedItems(){
        return borrowedItems;
    }
    public abstract String getPatronType();


    //Set
    public void setName(String name){
        this.name = name;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    //Handle borrowed items
    public void borrowItem(LibraryItem item){
        borrowedItems.add(item);
    }
    public void returnItem(LibraryItem item){
        borrowedItems.remove(item);
    }


    //Display info
    public void displayPatron() {
        System.out.println("Patron Name: " + getName());
        System.out.println("Address: " + getAddress());
        System.out.println("Borrowed Items: " + borrowedItems);
    }
    

}
