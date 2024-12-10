import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

abstract class person{
    String name ;
    public  person(String name){
     this.name = name;
    }

    abstract void displaydata();
}


class Borrowreturn extends person{


   private ArrayList<String> borrowlist = new ArrayList<>();

      public Borrowreturn(String name){
        super(name);
      }

      public void borrow(String bookname){

        borrowlist.add(bookname);
        System.out.println("You have borrowed" + bookname+ "for 1 week");
      }

      public void returnbook(String bookname){
        if(borrowlist.remove(bookname)){
            System.out.println("You have returned"+ bookname);
        }

        else{
            System.out.println("there is no book such that to return");
        }
      }





    @Override
    void displaydata() {
        System.err.println("Hello" + name);
        
    }
}


class Book {
    String title;
    boolean isborrowed;
    String author;

    public Book(String title, String author ){
      this.title = title;
      this.isborrowed = false;
      this.author = author;
    }

    // @Override
    public void displaybook(){
        System.out.println(title);
        System.out.println(author);

    }
}

public class libraryex {
    private ArrayList<Book> books = new ArrayList<>();
    private HashMap<String, Borrowreturn> users = new HashMap<>();

    public void bookadd(String booktitle, String author){
        // new Book(booktitle, author);
        books.add(new Book(booktitle, author));
        System.out.println("Book" + booktitle + "has successfully added");

        for(Book bookss : books){
            // System.out.println(bookss.author);
            if(bookss.author == "someone"){
                System.out.println("Books whose athor is someone");
                System.out.println(bookss.title);
            }
        }

        


    }

    public void useradd(String name){
        users.put(name, new Borrowreturn(name));
        System.out.println("User added:" + name);
    }

    public void borrowing_book(String username,String bookt){
      try{

        Borrowreturn user = users.get(username);
        if(user == null) throw new Exception("User not found");


        Book booki = findBook(bookt);
        if(booki == null) throw new Exception("Book not found");
        

        if(booki.isborrowed){
            System.out.println("The book is already borrowed");
        }

        else {
            booki.isborrowed = true;
            user.borrow(bookt);
        }

}
catch(Exception e){
    System.out.println(e);

}
       
    }


    public void returningbook(String username, String bookt){
        try{

            Borrowreturn user = users.get(username);
            if(user == null) throw new Exception("User not found");
    
    
            Book booki = findBook(bookt);
            if(booki == null) throw new Exception("Book not found");
            
    
            if(!booki.isborrowed){
                System.out.println("The book is not borrowed");
            }
    
            else {
                booki.isborrowed = false;
                user.returnbook(bookt);
            }
    
    }
    catch(Exception e){
        System.out.println(e);
    
    }

    }

    private Book findBook(String bookTitle) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(bookTitle)) {
                return book;
            }
        }
        return null;
    }


    public static void main(String[] args) {
        libraryex obj = new libraryex();
        Scanner sc = new Scanner(System.in);

        obj.bookadd("java", "arif");
        obj.bookadd("python", "someone");
        obj.bookadd("c++", "other");

        obj.useradd("arif");
        obj.useradd("alam");
        obj.useradd("alice");
        obj.useradd("max");

        obj.borrowing_book("arif", "java");
        obj.borrowing_book("arif", "math");
        obj.borrowing_book("max", "hindi");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
            System.out.println("Enter the book and the author you want to add");
            String booktt = sc.next();
            String authorr = sc.next();
            obj.bookadd(booktt, authorr);
                
                break;   
                case 2:
                
                System.out.println("Enter your name to be added in the library list");
                String namee = sc.next();
                obj.useradd(namee);
                break; 
                  case 3: 
                System.out.println("Enter the book you want to borrow with correct name");
                String bookname =  sc.next();
                String username = sc.next();
                obj.borrowing_book(username, bookname);
                break;  

                 case 4:
                System.out.println("Enter the book you want to return with correct name");
                String booknamee = sc.next();
                String usernamee = sc.next();
                obj.returningbook(usernamee, booknamee);
                break;
        
            default:
            System.out.println("Invalid input");
                break;
        }

        
    }
}

