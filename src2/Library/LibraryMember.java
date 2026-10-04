package Library;

public class LibraryMember {
    private String name;
    private String memberID;
    private Book borrowedBook;

    public LibraryMember(String name, String memberID) {
        this.name = name;
        this.memberID = memberID;
        this.borrowedBook = null;
    }

    public String getName() {
        return name;
    }

    public String getMemberID() {
        return memberID;
    }

    public Book getBorrowedBook() {
        return borrowedBook;
    }

    public void borrowBook(Book book) {
        if (this.borrowedBook != null) {
            System.out.println("You already have a book. " + this.borrowedBook.getTitle());
            System.out.println();
        } else if (book.isBorrowed()) {
            System.out.println(book.getTitle() + " is currently unavailable.");
            System.out.println();
        } else {
            this.borrowedBook = book;
            book.setBorrowed(true);
            System.out.println(this.name + " borrowed " + book.getTitle());
            System.out.println();
        }
    }

    public void returnBook() {
        if (this.borrowedBook == null) {
            System.out.println("No Book to return.");
            System.out.println();
        } else {
            this.borrowedBook.setBorrowed(false);
            System.out.println(this.name + " returned " + this.borrowedBook.getTitle());
            this.borrowedBook = null;
            System.out.println();
        }
    }

    public void displayStatus() {
        System.out.println("Member: " + this.name + " (ID: " + this.memberID + ")" +
                "\n[Current Book:] Title: " + this.borrowedBook.getTitle() + " | Author: " + this.borrowedBook.getAuthor() +
                " | ISBN: " + this.borrowedBook.getIsbn());
        System.out.println();
    }
}
