import java.io.ObjectInputFilter.Status;
import java.util.ArrayList;
import java.util.Scanner;

abstract class first {
    String bookname;
    // String author;
    int status;
    public first (String bookname ){
        this.bookname = bookname;
        // this.author = author;
    }

    abstract void displaydata();
}


class Book extends first {
    String author ;
    public Book(String bookname,String author){
        super(bookname);
        this.author = author;

    }

    @Override
    void displaydata(){
        System.out.println("Book name:" + bookname);
        System.out.println("Author name: " + author);

    }
}




public class simplelib {
 int status = 0;
    void saveddata(){

        ArrayList<Book> book = new ArrayList<>();
       
    
            Scanner sc = new Scanner(System.in);
        
            System.out.println("Enter the name of book you want to add");
            String bookname = sc.next();
            System.out.println("Enter the name of the book author");
        
            String authorname = sc.next();
        
           book.add(new Book(bookname,authorname));
           


           for (Book books : book){
               books.displaydata();
               System.out.println();
           }

        //    new Book("","").displaydata();
           sc.close();
  



           status = 1;
     
      
    }

    void loop_func(){
        if(status == 1){
            saveddata();
            loop_func();
        }
        else{
            // status = 0;
            System.out.println("It is not one");
        }
    }
    

    public static void main(String[] args) {
     
        ArrayList<Book> book = new ArrayList<>();


        simplelib obj = new simplelib();
        obj.saveddata();
        obj.loop_func();
    


    }
}