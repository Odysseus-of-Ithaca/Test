package OOP_UML;

public class Book {
    private String isbn;
    private String title;
    private short year;
    private boolean isAvailable;

    public Book(String isbn, String title) {
        this.isbn = isbn;
        this.title = title;
        this.isAvailable = true;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public short getYear() {
        return year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public void borrowedBook() {
        if (isAvailable) {
            System.out.println("Book is Available");
            return;
        }
        isAvailable = false;
    }

    public void returnedBook() {
        isAvailable = true;
    }
}
