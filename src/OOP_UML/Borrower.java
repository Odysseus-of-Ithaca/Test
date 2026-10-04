package OOP_UML;

public class Borrower {
    private String ID;
    private String Name;
    private OOP_UML.Book book;

    public Borrower(String ID, String Name, OOP_UML.Book book) {
        this.ID = ID;
        this.Name = Name;
        this.book = null;
    }

    public String getID() {
        return ID;
    }

    public String getName() {
        return Name;
    }

    public OOP_UML.Book getBook() {
        return book;
    }

    public void setNme(String Name) {
        this.Name = Name;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
