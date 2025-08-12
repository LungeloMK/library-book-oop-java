
package librarybooktest;


public class LibraryBook {
    private String title;
    private String author;
    private String isbn;

    // Constructor
    public LibraryBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    // Method to display book details
    public void displayDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + isbn);
    }

    // Method to check if two books have the same ISBN
    public boolean hasSameISBN(LibraryBook otherBook) {
        return this.isbn.equals(otherBook.isbn);
    }
}
