import java.security.PublicKey;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.List;

abstract class Person {
String name;
public Person(String name){
    this.name = name;
}

public abstract void displayDetails();
}


class  User extends Person{
    private ArrayList<String> borrowedbook = new ArrayList<>();
    public User(String name){
        super(name);
    }

    public void borrowbook(String bookname){
        borrowedbook.add(bookname);
        System.out.println(name + " borrowed the book: " + bookname);
    }

    public void returnbook(String bookname){
        if(borrowedbook.remove(bookname)){
            System.out.println(name + "Returned the book:" + bookname);

        }
        else{
            System.out.println(name + "does not have the book:" + bookname);
        }
    }

   public ArrayList<String> getborrowedbook(){ // here ArrayList<String> is the return type of th method so that it will print he borrowed book arraylist 
    return borrowedbook;
   }


   @Override
   public void displayDetails(){
    System.out.println("User Name:" + name);
    System.out.println("Borrowed Books:" + borrowedbook);
   }
 
}

class Book {
    String title;
    boolean isborrowed;

    public Book (String title){
        this.title = title;
        this.isborrowed = false;
    }
}

public class librarytut {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<String, User> users = new HashMap<>();

    public void addbook(String title){
        books.add(new Book(title));
        System.out.println("Book added:"+ title);
    }

    public void adduser(String username){
        users.put(username, new User(username));
        System.out.println("User added:" + username);
    }

    public void borrowbook(String username, String booktitle){
         try{
            User user = users.get(username);
            if(user == null) throw new Exception("User not found");

            Book book = findbook(booktitle);
            if(book == null) throw new Exception("Book not found");

            if(book.isborrowed){
                System.out.println("The book '" + booktitle + "' is already borrowed.");
            }
            else{
                book.isborrowed = true;
                user.borrowbook(booktitle);
            }
         }
         catch(Exception e){
            System.out.println("Error:" + e.getMessage());
         }
    }

    public void returnbook(String username, String booktitle){
        try{
            User user = users.get(username);
            if(user == null) throw new Exception("User not found");

            Book book = findbook(booktitle);
            if(book == null) throw new Exception("Book not found");
             
            if(book.isborrowed){
                book.isborrowed = false;
                user.returnbook(booktitle);
            }
            else{
               
                System.out.println("The book '" + booktitle + "' was not borrowed.");

            }
        }
        catch(Exception e){
            System.out.println("Error:" + e.getMessage());
        }
    }

    public void displayLibrary(){
        System.err.println("\nLibrary Details");
       for(Book book : books){
        System.out.println(book.title + (book.isborrowed ? "(Borrowed)": "(Available)"));


       }
       System.out.println("\nUsers:");

       for(User user : users.values()){
        user.displayDetails();
       }
    }
    

    public Book findbook(String booktitle){
       for (Book book : books){
        if(book.title.equalsIgnoreCase(booktitle)){
            return book;
        }
       }
       return null;
    }
    

    public static void main(String[] args) {
        librarytut library  = new librarytut();
        Scanner sc = new Scanner(System.in);

        library.addbook("java");
        library.addbook("python");
        library.addbook("maths");
        library.addbook("science");

        library.adduser("Alice");
        library.adduser("Bob");
        library.adduser("charlie");

        library.borrowbook("Alice", "java");
        library.borrowbook("Bob", "python");
        library.borrowbook("charlie", "maths");

        

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
           System.out.println("Enter the book title you want to add");
           String booktitle = sc.next();
           library.addbook(booktitle);
                 library.displayLibrary();
                
                break;
                case 2:



                System.out.println("Enter the username you want to  add");
                String username = sc.next();
                library.adduser(username);
                library.displayLibrary();

                 
                
                break;
                case 3:

                System.out.println("Enter the username and book title you want to borrow");
                String usernames = sc.next();
                String booktitles = sc.next();
                library.borrowbook(usernames, booktitles);
                library.displayLibrary();



                 
                
                break;
                case 4:

                 System.out.println("Enter the username and book title you want to return ");
                 String usernamess = sc.next();
                 String booktitless = sc.next();
                 library.returnbook(usernamess, booktitless);
                 library.displayLibrary();

                
                break;
                case 5:

                 
                System.out.println("Library Details");
                library.displayLibrary();
                break;
        
            default:

            System.out.println("Invalid choice");
                break;
        }
        sc.close();

    }
}