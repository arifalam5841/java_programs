import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

// Abstract class representing a person in the library system
abstract class Person {
    String name;

    public Person(String name) {
        this.name = name;
    }

    public abstract void displayDetails();
}

// Class representing a library user
class User extends Person {
    private ArrayList<String> borrowedBooks = new ArrayList<>();

    public User(String name) {
        super(name);
    }

    

    public void borrowBook(String bookName) {
        borrowedBooks.add(bookName);
        System.out.println(name + " borrowed the book: " + bookName);
    }

    public void returnBook(String bookName) {
        if (borrowedBooks.remove(bookName)) {
            System.out.println(name + " returned the book: " + bookName);
        } else {
            System.out.println(name + " does not have the book: " + bookName);
        }
    }

    public ArrayList<String> getBorrowedBooks() {
        return borrowedBooks;
    }

     @Override
    public void displayDetails() {
        System.out.println("User Name: " + name);
        System.out.println("Borrowed Books: " + borrowedBooks);
    }
}

// Class representing a library book
class Book {
    String title;
    boolean isBorrowed;
    // String author;


    public Book(String title) {
        this.title = title;
        this.isBorrowed = false;
        // this.author  = author;
    }
}

// Main class: Library Management System
public class LibraryManagementSystem {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<String, User> users = new HashMap<>();

    // Add a new book to the library
    public void addBook(String bookTitle) {
        books.add(new Book(bookTitle));
        System.out.println("Book added: " + bookTitle);
    }

    // Register a new user
    public void addUser(String userName) {
        users.put(userName, new User(userName));
        System.out.println("User added: " + userName);
    }

    // Borrow a book
    public void borrowBook(String userName, String bookTitle) {
        try {
            User user = users.get(userName);
            if (user == null) throw new Exception("User not found");

            Book book = findBook(bookTitle);
            if (book == null) throw new Exception("Book not found");

            if (book.isBorrowed) {
                System.out.println("The book '" + bookTitle + "' is already borrowed.");
            } else {
                book.isBorrowed = true;
                user.borrowBook(bookTitle);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Return a book
    public void returnBook(String userName, String bookTitle) {
        try {
            User user = users.get(userName);
            if (user == null) throw new Exception("User not found");

            Book book = findBook(bookTitle);
            if (book == null) throw new Exception("Book not found");

            if (!book.isBorrowed) {
                System.out.println("The book '" + bookTitle + "' was not borrowed.");
            } else {
                book.isBorrowed = false;
                user.returnBook(bookTitle);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // Display library details
    public void displayLibrary() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(book.title + (book.isBorrowed ? " (Borrowed)" : " (Available)"));
        }

        System.out.println("\nUsers:");
        for (User user : users.values()) {
            user.displayDetails();
        }
    }

    // Helper method to find a book
    private Book findBook(String bookTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }
        return null;
    }

    // Main program
    public static void main(String[] args) {
        LibraryManagementSystem library = new LibraryManagementSystem();
        Scanner scanner = new Scanner(System.in);

        // Sample Data
        library.addBook("Java Programming");
        library.addBook("Data Structures");
        library.addUser("Alice");
        library.addUser("Bob");

        while (true) {
            System.out.println("\nLibrary Management System");
            System.out.println("1. Add Book");
            System.out.println("2. Add User");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Display Library");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    library.addBook(bookTitle);
                }
                case 2 -> {
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    library.addUser(userName);
                }
                case 3 -> {
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    library.borrowBook(userName, bookTitle);
                }
                case 4 -> {
                    System.out.print("Enter user name: ");
                    String userName = scanner.nextLine();
                    System.out.print("Enter book title: ");
                    String bookTitle = scanner.nextLine();
                    library.returnBook(userName, bookTitle);
                }
                case 5 -> library.displayLibrary();
                case 6 -> {
                    System.out.println("Exiting... Goodbye!");
                    scanner.close();
                    System.exit(0);
                }
                default -> System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
