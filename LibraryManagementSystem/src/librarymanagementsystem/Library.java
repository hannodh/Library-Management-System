package librarymanagementsystem;


import java.util.ArrayList;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully.");
    }

    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
            return;
        }

        for (Book book : books) {
            book.displayBook();
        }
    }

    public Book searchBook(int id) {

        for (Book book : books) {
            if (book.getId() == id) {
                return book;
            }
        }

        return null;
    }

}
