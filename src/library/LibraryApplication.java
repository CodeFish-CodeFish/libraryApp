package library;

import java.util.Scanner;

public class LibraryApplication {
    private static SimpleLibrarySystem library = new SimpleLibrarySystem();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        boolean quit = false;
        while (!quit) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Book");
            System.out.println("2. Register Member");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Remove Book");
            System.out.println("6. List All Books");
            System.out.println("7. List All Members");
            System.out.println("8. Show Who Borrowed Which Book");
            System.out.println("9. Quit");

            int action = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (action) {
                case 1: addBook(); break;
                case 2: registerMember(); break;
                case 3: borrowBook(); break;
                case 4: returnBook(); break;
                case 5: removeBook(); break;
                case 6: library.listAllBooks(); break;
                case 7: library.listAllMembers(); break;
                case 8: library.showBorrowedBooks(); break;
                case 9: System.out.println("Exiting..."); quit = true; break;
                default: System.out.println("Invalid option, please choose again.");
            }
        }
    }

    private static void addBook() {
        System.out.println("Enter book title:");
        String title = scanner.nextLine();
        System.out.println("Enter author name:");
        String author = scanner.nextLine();
        library.addBook(new Book(title, author));
        System.out.println("Book added successfully.");
    }

    private static void registerMember() {
        System.out.println("Enter member name:");
        String name = scanner.nextLine();
        System.out.println("Enter member ID:");
        String memberId = scanner.nextLine();
        library.registerMember(new LibraryMember(name, memberId));
        System.out.println("Member registered successfully.");
    }

    private static void borrowBook() {
        System.out.println("Enter member ID:");
        String memberId = scanner.nextLine();
        System.out.println("Enter book title:");
        String bookTitle = scanner.nextLine();
        if (library.borrowBook(bookTitle, memberId)) {
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Failed to borrow book.");
        }
    }

    private static void returnBook() {
        System.out.println("Enter member ID:");
        String memberId = scanner.nextLine();
        System.out.println("Enter book title:");
        String bookTitle = scanner.nextLine();
        if (library.returnBook(bookTitle, memberId)) {
            System.out.println("Book returned successfully.");
        } else {
            System.out.println("Failed to return book.");
        }
    }

    private static void removeBook() {
        System.out.println("Enter book title to remove:");
        String bookTitle = scanner.nextLine();
        if (library.removeBook(bookTitle)) {
            System.out.println("Book removed successfully.");
        } else {
            System.out.println("Failed to remove book.");
        }
    }
}