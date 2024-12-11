import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.MoveAction;

enum Genre{
    ACTION , DRAMA, COMEDY, HORROR, THRILLER
}

 class Movie {
    private String title;
    private Genre genre;
    private String language;
    private int availabletickets;

    public Movie(String title, Genre genre, String language, int availabletickets){
        this.title = title;
        this.genre = genre;
        this.language = language;
        this.availabletickets = availabletickets;
    }


    public String getTitle(){
        return title;
    }

    public Genre getGenre(){
        return genre;
    }

    public String getLanguage(){
        return language;
    }

    public int getAvailabletickets(){
        return availabletickets;
    }

    public boolean bookTickets(){
        if(availabletickets > 0){
            availabletickets--;
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString(){
        return "Movie{title = '"+ title + "', genre="+ genre + ", language='" + language + "', availabletickets=" + availabletickets + "}";
    }
}

 class Theater{
    private Vector<Movie> movies;

    public Theater(){
        movies = new Vector<>();
    }

    public void addMovie(Movie movie){
        movies.add(movie);
    }


    public void displayMovies(){
        Enumeration<Movie> movieenum = movies.elements();

        while (movieenum.hasMoreElements()) {

            System.out.println(movieenum.nextElement());
            
        }
    }


    public void bookticket(String movieTitle){
        for(Movie movie : movies){
            if(movie.getTitle().equalsIgnoreCase(movieTitle)){
                if(movie.bookTickets()){
                    System.out.println("Ticket booked succesfully for : " + movieTitle);
                }
                else{
                    System.out.println("Sorry , no tickets are available for : " + movieTitle);
                }
                return;
            }
        }


        System.err.println("Movie not found: " + movieTitle);
    }
}


public class Movieticket{

    public static void main(String[] args) {
        Theater theater = new Theater();

        theater.addMovie(new Movie("Titanic", Genre.DRAMA, "English", 0));
        theater.addMovie(new Movie("Avengers", Genre.ACTION, "English", 5));
        theater.addMovie(new Movie("RRR", Genre.ACTION, "HINDI", 10));

        System.out.println("Available Movies:  ");

        theater.displayMovies();

        System.out.println("\n Booking Tickets: ");

        theater.bookticket("Avengers");
        theater.bookticket("ddlj");

        System.out.println("\n Updated Movie List: ");
        theater.displayMovies();

        boolean running = true;

        // while (running) {

        //     Scanner sc = new Scanner(System.in);

        //     int choice= sc.nextInt();
            
        //     System.out.println("1 for add movie");
        //     System.out.println("2 for check available movies");
        //     System.out.println("3 for Booking ticket");

        //     switch (choice) {
        //         case 1:

        //         String names = sc.next();

        //             break;      
        //             case 2:
        //             break;      
        //             case 3:
        //             break;     
        //              case 4:
                   
        //             break;
            
        //         default:
        //             break;
        //     }
            
        // }
    }
}