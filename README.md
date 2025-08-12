# LibraryBook (OOP in Java)

##  Overview
This Java program defines a `LibraryBook` class to model a book with title, author, and ISBN fields.  
It demonstrates Object-Oriented Programming concepts by including methods to display book details and check if two books have the same ISBN.

---

##  Features
- Class encapsulates book data and behaviors.
- Method to display book details.
- Method to compare ISBN numbers of two books.

---

##  Technologies Used
- **Java** (JDK 8 or higher)

---

##  Code

### LibraryBook.java
```java
public class LibraryBook {
    private String title;
    private String author;
    private String isbn;

    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    public boolean hasSameISBN(LibraryBook otherBook) {
        return this.isbn.equals(otherBook.isbn);
    }
}
