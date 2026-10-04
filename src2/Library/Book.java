package Library;

public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        if (isBorrowed == borrowed) {
            isBorrowed = true;
        }
    }

    public void displayInfo() {
        System.out.print("Title: " + title);
        System.out.print("Author: " + author);
        System.out.print("ISBN: " + isbn);
    }
}
