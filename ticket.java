import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.lang.reflect.Array;
import java.nio.channels.ScatteringByteChannel;
import java.time.DayOfWeek;

enum gener {
    ACTION, HORROR, THRILLAR, COMEDY
}

class moviesobj {
   final String name;
   final String[] cast;
   final String director;
    int availticket;
     gener moviegener;
   final int ticketprice;

    public moviesobj(String name, String[] cast, String director, int availticket, String moviegener, int ticketprice) {
        this.name = name;
        this.cast = cast;
        this.director = director;
        this.availticket = availticket;
        this.ticketprice = ticketprice;

        try {
            this.moviegener = gener.valueOf(moviegener.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid genre. Setting to default COMEDY.");
            this.moviegener = gener.COMEDY;
        }
    }

    public boolean sellingTicket() {
        if (availticket > 0) {
            availticket--;
            return true;
        }
        return false;
    }

     public String[] displaycast(){
            
        return cast;
    }
    
    public int displayTicket(){

        return ticketprice;
    }
}


class appendingdata{
    public void appendingcustomer(ticket ticketclass){
        try {
            // Open the file with try-with-resources to ensure it gets closed
            FileWriter file = new FileWriter("customerdata.txt");
            try (BufferedWriter writer = new BufferedWriter(file)) {
                // Iterate over the customer array and write to the file
                for (addingcustomer eachCustomer : ticketclass.customerarray) {

                    String eachlinne = "Name : " + eachCustomer.name  +  " , " + "Bank name : " + eachCustomer.bankname + " , " + "Wallet : " + eachCustomer.walletmoney ;
                    writer.write(eachlinne); // Assuming toString() provides a meaningful representation
                    writer.newLine(); // Add a new line after each customer

                    writer.write("All Last Movies : ");
                    writer.newLine(); 
                    for(lastmovieclass eachlast : eachCustomer.lastmoviearraydisplay()){
                        String lastmoviedata = "Name: " + eachlast.name + " | " + "Amount: " + eachlast.amount + " | " + "Date: " + eachlast.date ;
                        writer.write(lastmoviedata);
                        writer.newLine();
                    }
                    // writer.write(eachCustomer.displayName()); // Assuming toString() provides a meaningful representation
                    writer.newLine();
                    writer.write("");
                }
            }
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace();

            
        }

    } 

    public void appendmovie(movieProcess moviesarray){



        try {
            // Open the file with try-with-resources to ensure it gets closed
            FileWriter file = new FileWriter("moviesdata.txt");
            try (BufferedWriter writer = new BufferedWriter(file)) {
                // Iterate over the customer array and write to the file
              
        for(moviesobj eachmovie : moviesarray.movies){
            
            // String[] allcast = eachmovie.cast;

            // for(String[] eachcast : eachmovie.cast.toString()){

            // }

            String allcast = "";

            for( int i = 0; i < eachmovie.cast.length ; i++){


                allcast +=    eachmovie.cast[i].toString() + " , ";
            }

            String eachdata = "Name: " +  eachmovie.name + " , " + "Cast: " + "[ " + allcast + " ]"  +" , " + "Director: " + eachmovie.director + " , " + "Gener: " + eachmovie.moviegener + " , " + "Available ticket: " + eachmovie.availticket + " ," + "Ticket Price: " + eachmovie.ticketprice;


            writer.write(eachdata);
            writer.newLine();
            
        }
            }
        } catch (Exception e) {
            // Handle the exception
            e.printStackTrace();

            
        }

    }
}
class movieProcess {
    ArrayList<moviesobj> movies;

    public movieProcess() {
        movies = new ArrayList<>();
    }

    public void addingMovie(Scanner sc) {
        System.out.print("Enter Movie name: ");
        String name = sc.nextLine();
        System.out.print("Enter Cast names (comma separated): ");
        String[] cast = sc.nextLine().split(",");
        System.out.print("Enter Director name: ");
        String director = sc.nextLine();
        System.out.print("Enter Movie Genre: ");
        String genre = sc.nextLine();
        System.out.print("Enter Available Tickets: ");
        int availticket = sc.nextInt();
        System.out.println("Enter ticket price:");
        int ticketp = sc.nextInt();
        sc.nextLine(); // Consume newline

        movies.add(new moviesobj(name, cast, director, availticket, genre,ticketp));
        System.out.println("Movie added successfully!");

        // updating the movies file
    }

   

    public void AllMovies() {
        for (moviesobj movie : movies) {
            System.out.println("Movie Name: " + movie.name);
            System.out.println("Casts: " + Arrays.toString(movie.cast));
            System.out.println("Director: " + movie.director);
            System.out.println("Available Tickets: " + movie.availticket);
            System.out.println("Genre: " + movie.moviegener);
            System.out.println();
        }
    }

}


class payment{
    public static void payingmoney(){
    }
}

class customer {
    public void checkmovie(Scanner sc, movieProcess movieProcess) {
        System.out.print("Enter Movie name to check availability: ");
        String name = sc.nextLine();

        for (moviesobj movie : movieProcess.movies) {
            if (movie.name.equalsIgnoreCase(name)) {
                System.out.println("Movie is Available!");
                System.out.println("Movie Name: " + movie.name);
                System.out.println("Casts: " + Arrays.toString(movie.cast));
                System.out.println("Director: " + movie.director);
                System.out.println("Available Tickets: " + movie.availticket);
                return;
            }
        }
        System.out.println("Movie not found!");
    }

    public void bookTicket(Scanner sc, movieProcess movieProcess, ticket objTicket) {
        System.out.print("Enter Movie name to book ticket: ");
        String moviename = sc.nextLine();

        for (moviesobj movie : movieProcess.movies) {
            if (movie.name.equalsIgnoreCase(moviename)) {
System.out.println("Movie is available:  " + moviename + " " + "!!");

System.out.println("-------------------TRANSACTION-----------------");

System.out.println("TICKET PRICE : " + movie.displayTicket());
System.out.println("Please enter your name:");
String username = sc.nextLine();
System.out.println("Please enter amount: ");
int paidprice = sc.nextInt();




// for(addingcustomer eachcustomer)
for(addingcustomer eachcustomer : objTicket.customerarray){

    if(eachcustomer.name.equalsIgnoreCase(username)){


        if(paidprice == movie.displayTicket()){
            // System.out.println(eachcustomer.displayName());
            // System.out.println(eachcustomer.displayBankname());

            // transaction
            if (movie.sellingTicket()) {
                System.out.println("Congrats " + eachcustomer.displayName());

                System.out.println("Ticket Booked Successfully for " + movie.name);
                LocalDate date = LocalDate.now();
                LocalTime time = LocalTime.now();
                System.out.println("Date: " + date + " | Time: " + time);
                eachcustomer.addinglastmovie(movie.name, date.toString(), paidprice);
                eachcustomer.walletmoneydiduction(paidprice);


            } else {
                System.out.println("Tickets Sold Out!");
            }
            return;
        }
      



    }
}
                

                // updating the teather file by adding the customer name and the movie that is booked
            }
        }
        System.out.println("Movie not found!");
    }
}

class lastmovieclass{
    String name;
    String date;
    int amount;

    public lastmovieclass(String name, String date, int amount){
        this.name = name;
        this.date = date;
        this.amount = amount;
    }


}


 

class addingcustomer{
    String name;
    String bankname;
    int walletmoney;
    ArrayList<lastmovieclass> lastMoviesarray = new ArrayList<>();
    
    // {"name": "movie name", "Date" : "8/5/24","amount" : 500}

    public addingcustomer(String name, String bankname, int walletmoney){

        this.name = name;
        this.bankname = bankname;
        this.walletmoney = walletmoney;
        lastMoviesarray.add(new lastmovieclass("null", "null", 0));

     }

     public String displayName(){
      return name;
     }

     public String displayBankname(){

        return bankname;
     }

     public int displayWalletmoney(){
        return walletmoney;
     } 

     public void diplayLastmovie(){
        for(lastmovieclass eachlastmovie : lastMoviesarray){
            System.out.println("Name: " + eachlastmovie.name + " | "+ "Date: " + eachlastmovie.date + " | "+ "Amount: " + eachlastmovie.amount);
        }
     }

     public ArrayList<lastmovieclass> lastmoviearraydisplay(){

        return lastMoviesarray;
     }

     public void walletmoneydiduction(int amountgave){
       walletmoney = walletmoney - amountgave;

       System.out.println("Balance amout: " + walletmoney );
     }



    public void addinglastmovie(String name , String date, int amount){
        lastMoviesarray.add(new lastmovieclass(name, date, amount));
    }
     
    }

public class ticket {


   static ArrayList<addingcustomer> customerarray = new ArrayList<>();


    public static void displayallcustomer(){
         int i = 0;
         System.out.println("---------------------------------ALL CUSTOMERS --------------------------------");
        for(addingcustomer eachcustomer : customerarray){
            i++ ;
            System.out.println(i+ ".");

        System.out.println("Name:" + eachcustomer.displayName() + ", Bank Name: " + eachcustomer.displayBankname() + " ,Wallet Money: " + eachcustomer.displayWalletmoney());
        System.out.println("Last movie data: ");
        eachcustomer.diplayLastmovie();


         System.out.println("------------------------------------------------------------------------------------------------");

        }
    }

    public static void addingcustomerarray(Scanner sc, ticket tickclass){

        System.out.println("Add Customer----------------------");
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter bank name:");
        String bankName = sc.nextLine();
        System.out.println("Enter wallet money:");
        int walletMoney = sc.nextInt();
        sc.nextLine(); // Consume newline

        customerarray.add(new addingcustomer(name, bankName, walletMoney));



        System.out.println("Customer added succesfully!!");
        

        // new appendingdata.appendingcustomer(ticket);

        appendingdata objappen = new appendingdata();

        objappen.appendingcustomer(tickclass);
        
    }
    public static void addmovie(Scanner sc, movieProcess movieProcess) {
        movieProcess.addingMovie(sc);

        appendingdata objappen = new appendingdata();

        objappen.appendmovie(movieProcess);
    }

    public static void displayallmovie(movieProcess movieProcess) {
        movieProcess.AllMovies();
    }

    public static void checkmovie(Scanner sc, movieProcess movieProcess) {
        new customer().checkmovie(sc, movieProcess);
    }

    public static void buyticket(Scanner sc, movieProcess movieProcess, ticket objticket) {
        new customer().bookTicket(sc, movieProcess, objticket);

        appendingdata objappen = new appendingdata();

        objappen.appendingcustomer(objticket);
        objappen.appendmovie(movieProcess);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        movieProcess movieProcess = new movieProcess();
        // movieProcess movieProcess = new movieProcess();
        ticket objticket = new ticket();



        while (true) {
            System.out.println("1. Add Movie");
            System.out.println("2. Display All Movies");
            System.out.println("3. Check Movie Availability");
            System.out.println("4. Buy Ticket");
            System.out.println("5. add customer");
            System.out.println("6. display customers");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1 -> addmovie(sc, movieProcess);
                case 2 -> displayallmovie(movieProcess);
                case 3 -> checkmovie(sc, movieProcess);
                case 4 -> buyticket(sc, movieProcess,objticket);
                case 5 -> addingcustomerarray(sc, objticket);
                case 6 -> displayallcustomer();
                case 7-> {
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;
                }
                default -> System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
