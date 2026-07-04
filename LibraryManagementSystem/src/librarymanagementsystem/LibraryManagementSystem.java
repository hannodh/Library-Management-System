package librarymanagementsystem;

import java.util.Scanner;
public class LibraryManagementSystem {

    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Library library = new Library();

        int choice;

        do {

            System.out.println("\n===== Library Management System =====");
            System.out.println("1. Add Book");
            System.out.println("2. Show Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Choose: ");
            choice = input.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Book ID: ");
                    int id = input.nextInt();
                    input.nextLine();

                    System.out.print("Title: ");
                    String title = input.nextLine();

                    System.out.print("Author: ");
                    String author = input.nextLine();

                    Book book = new Book(id, title, author);
                    library.addBook(book);

                    break;

                case 2:

                    library.showBooks();

                    break;

                case 3:

                    System.out.print("Enter Book ID: ");
                    int searchId = input.nextInt();

                    Book found = library.searchBook(searchId);

                    if (found != null)
                        found.displayBook();
                    else
                        System.out.println("Book not found.");

                    break;

                case 4:

                    System.out.print("Enter Book ID: ");
                    int borrowId = input.nextInt();

                    Book borrowBook = library.searchBook(borrowId);

                    if (borrowBook != null)
                        borrowBook.borrowBook();
                    else
                        System.out.println("Book not found.");

                    break;

                case 5:

                    System.out.print("Enter Book ID: ");
                    int returnId = input.nextInt();

                    Book returnBook = library.searchBook(returnId);

                    if (returnBook != null)
                        returnBook.returnBook();
                    else
                        System.out.println("Book not found.");

                    break;

                case 6:

                    System.out.println("Goodbye!");

                    break;

                default:

                    System.out.println("Invalid choice.");

            }

        } while (choice != 6);

    }
}
