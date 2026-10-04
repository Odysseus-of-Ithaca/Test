package Library;

public class Test {
    public static void main(String[] args) {
        Book book1 = new Book("Java Basics", "J. Doe","978-123456");
        Book book2 = new Book("OOP in Practice", "A. Smith","978-789012");

        LibraryMember member = new LibraryMember("Alice","M101");

        member.borrowBook(book1);
        member.displayStatus();
        member.borrowBook(book2);
        member.returnBook();
        member.borrowBook(book2);
        member.displayStatus();
    }
}
