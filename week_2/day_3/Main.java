public class Main {

    public static void main(String[] args) {

        Library lib = new Library();

        lib.addBook(new Book("Clean Code", "Robert Martin", "1"));
        lib.addBook(new Book("Java Basics", "John Doe", "2"));

        lib.displayBooks();

        try {
            lib.borrowBook("1");
            lib.borrowBook("1"); // error
        } catch (LibraryException e) {
            System.out.println(e.getMessage());
        }

        lib.displayBooks();

        lib.sortByAuthor();
        System.out.println("Sorted:");
        lib.displayBooks();

        System.out.println("Search:");
        lib.searchByTitle("Clean Code");
    }
}