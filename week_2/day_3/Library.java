import java.util.*;

public class Library {

    List<Book> books = new ArrayList<>();
    Map<String, Book> bookMap = new HashMap<>();

    // add book
    public void addBook(Book book) {
        books.add(book);
        bookMap.put(book.isbn, book);
    }

    // remove book
    public void removeBook(String isbn) throws LibraryException {
        Book book = bookMap.get(isbn);
        if (book == null) throw new LibraryException("Book not found");

        books.remove(book);
        bookMap.remove(isbn);
    }

    // borrow book
    public void borrowBook(String isbn) throws LibraryException {
        Book book = bookMap.get(isbn);
        if (book == null) throw new LibraryException("Book not found");
        if (book.isBorrowed) throw new LibraryException("Already borrowed");

        book.isBorrowed = true;
    }

    // return book
    public void returnBook(String isbn) throws LibraryException {
        Book book = bookMap.get(isbn);
        if (book == null) throw new LibraryException("Book not found");
        if (!book.isBorrowed) throw new LibraryException("Book was not borrowed");

        book.isBorrowed = false;
    }

    // search by title
    public void searchByTitle(String title) {
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title)) {
                System.out.println(b);
            }
        }
    }

    // sort by author
    public void sortByAuthor() {
        books.sort((a, b) -> a.author.compareTo(b.author));
    }

    public void displayBooks() {
        for (Book b : books) {
            System.out.println(b + (b.isBorrowed ? " [BORROWED]" : ""));
        }
    }
}