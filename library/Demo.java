package library;

import library.items.*;
import library.people.*;

public class Demo {

    public static void main(String[] args) {
        Library library = new Library();
    

        Book Item1 = new Book("ID1", "Item1", "Author1", "ISBN1", "Publisher1", 1, "digital");
        Book Item2 = new Book("ID2", "Item2", "Author2", "ISBN2", "Publisher2", 2, "audio");

        Periodical Item3 = new Periodical("ID3", "Item3", "Author1", "ISBN3", "Publisher3", 3,"digital");
        Periodical Item4 = new Periodical("ID4", "Item4", "Author2", "ISBN4", "Publisher4", 4, "physical");

        Author Author1 = new Author("Author1","1994-01-01");
        Author Author2 = new Author("Author2","1994-02-02");

        Student Patron1 = new Student("Patron1", "1st Street", "709-123-4567");
        Employee Patron2 = new Employee("Patron2", "2nd Street", "709-890-1234");

        System.out.println();
        System.out.println();
        library.addItem(Item1);
        library.addItem(Item2);
        library.addItem(Item3);
        library.addItem(Item4);
        library.addAuthor(Author1);
        library.addAuthor(Author2);
        library.addPatron(Patron1);
        library.addPatron(Patron2);
        Item1.displayItemDetails();
        System.out.println();
        System.out.println();
        Item2.displayItemDetails();
        System.out.println();
        System.out.println();
        Item3.displayItemDetails();
        System.out.println();
        System.out.println();
        Item4.displayItemDetails();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Patron1.displayPatron();
        System.out.println();
        System.out.println();
        Patron2.displayPatron();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        Author1.addWrittenItem(Item1);
        Author1.addWrittenItem(Item3);
        Author2.addWrittenItem(Item2);
        Author2.addWrittenItem(Item4);
        Author1.displayAuthor();
        System.out.println();
        System.out.println();
        Author2.displayAuthor();
        Author1.removeWrittenItem(Item1);
        System.out.println();
        System.out.println();
        Author1.displayAuthor();
        System.out.println();
        System.out.println();
        library.borrowItem(Patron1, "Item1");
        System.out.println();
        System.out.println();
        library.borrowItem(Patron2, "Item1");
        System.out.println();
        System.out.println();
        library.returnItem(Patron1, "Item1");
        System.out.println();
        System.out.println();
        library.borrowItem(Patron2, "Item1");
        System.out.println();
        System.out.println();
        library.borrowItem(Patron2, "Item1");

    }
    
}
