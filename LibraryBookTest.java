
package librarybooktest;


public class LibraryBookTest {
    public static void main(String[] args) {
        LibraryBook book1 = new LibraryBook("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565");
        LibraryBook book2 = new LibraryBook("Another Book", "Different Author", "9780743273565");

        System.out.println("Book 1 details:");
        book1.displayDetails();

        System.out.println("\nBook 2 details:");
        book2.displayDetails();

        if (book1.hasSameISBN(book2)) {
            System.out.println("\nBoth books have the same ISBN.");
        } else {
            System.out.println("\nBooks have different ISBNs.");
        }
    }
}
