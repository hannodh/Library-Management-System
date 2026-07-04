package librarymanagementsystem;

public class Book {
    private int id;
    private String title;
    private String author;
    private boolean borrowed;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.borrowed = borrowed;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }
    
    public boolean isBorrowed(){
        return borrowed;
    }
    
    public void borrowBook() {
        if (!borrowed) {
            borrowed = true;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is already borrowed.");
        }
    }

    public void returnBook() {
        if (borrowed) {
            borrowed = false;
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Book was not borrowed.");
        }
    }

    public void displayBook() {
        System.out.println("---------------------------");
        System.out.println("ID: " + id);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Borrowed: " + borrowed);
    }

}