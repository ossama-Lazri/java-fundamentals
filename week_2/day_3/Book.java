public class Book {

    String title;
    String author;
    String isbn;
    boolean isBorrowed;

    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isBorrowed = false;
    }

    @Override
    public String toString() {
        return title + " - " + author + " (" + isbn + ")";
    }
}