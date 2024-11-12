USER DOCUMENTATION

What is this Program?

This program is a simple library management system build using the Java programming language. 
This program can be used to manage information related to inventories of books and periodicals, authors, and patrons of students and employees. 
A borrow-return system is also a key feature like any real library.


How this Project was Built:

This program was built using the latest version of Java Development Kit and Visual Studio code. No other dependencies are required.
In order to maintain code consistency, each java file was written using camel case and had the same indentation. 
Comments were written to indicate the start of new processes. 
Code with similar functions were all grouped together whenever possible, such as all the get and set functions being in their own labeled sections for instance. 


How to retrieve and run the program:

Step 1
On the repository page click the button that says "Code"

Step 2
In the dropdown menu either clone the repository or download files as zip

Step 3
In the program of your choice, run the Demo.java file


Class features:

Library
-Add/remove item
-Borrow/return item
-Add/remove author
-Add/remove patron
-Search item, author, or patron

LibraryItem
-Store item info
-Maintain number of copies of items
-Retrieve different item types
-Edit item information

Book
-Include format
-Lists type as book

Periodical
-Include format
-Lists type as periodical

Author
-Store author info
-Edit author info
-List written items

Patron
-Store patron info
-Edit patron info
-List borrowed items
-Return items

Employee
-Stores patron type
-Lists type as employee

Student
-Stores patron type
-Lists type as student


Source Code Directory Structure:

Java-Sprint-1/
├── library/
│   ├── Demo.java
│   ├── Library.java
│   ├── items/
│   │   ├── Book.java
│   │   ├── LibraryItem.java
│   │   ├── Periodical.java
│   └── people/
│       ├── Author.java
│       ├── Employee.java
│       │── Patron.java
|       └── Student.java
├── Documentation.md
├── Walkthrough.mp4


Class Relationship Diagram:

LibraryItem
│   ├── Book
│   └── Periodical
├── Author
│── Patron
│   ├── Employee
|   └── Student

Explanation:

-All the above entities reference the LibraryItem class
-Book and Periodical are subclasses of LibraryItem
-Author listed as having written LibraryItem
-Patron may borrow or return LibraryItem
-Patron type may be Employee or Student
