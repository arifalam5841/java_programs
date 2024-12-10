import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthStyle;

abstract class person{
    String name;
    public person(String name){
        this.name = name;
    }

   public abstract  String toString();
}

class student extends person{
    int hindi,math,science,sst,marathi;

   
    
    public student(String name, int hindi, int math, int science, int sst, int marathi){
        super(name);
        this.hindi = hindi;
        this.math = math;
        this.science = science;
        this.marathi = marathi;
        this.sst = sst;
    }
 
   

 

     String grade(){

        int total = hindi + math + science + sst + marathi;
        int avg = total/5;

        if(avg <= 30  ){
            return "D";
        }
        else if(avg <= 60){
            return "C";
        }

        else if(avg <= 80){
            return "B";
        }
        
        else {
            return "A";
        }

        
        
    }

    @Override
   public String toString(){

        return "Name: " +name+ " hindi "+ hindi +  " math " + math + " science " + science + " sst " + sst + " marathi " + marathi + " Grade " + grade() ;

    }
}

class arrayadding{
    String name,grade;
    int hindi,math,science,sst,marathi;
    
    public arrayadding(String name, int hindi, int math, int science, int sst, int marathi,String grade){
        this.name  = name;
        this.hindi = hindi;
        this.math = math;
        this.science = science;
        this.marathi = marathi;
        this.sst = sst;
        this.grade = grade;
    }
    
}





public class schoolgrade{



    
    static final String FILE_NAME = "students.txt";

    static ArrayList<arrayadding> studentarray = new ArrayList<>();

     public static void addingstudent(Scanner scanner){
        



        
       System.out.println("Add details of new student:");
       System.out.println("Name:");
        String name = scanner.next();
        System.out.println("Enter marks");
        System.out.println("Hindi");
        int hindi = scanner.nextInt();
        System.out.println("Science"); 
        int science = scanner.nextInt();
        System.out.println("Math");
        int math = scanner.nextInt();
        System.out.println("SST");
        int sst = scanner.nextInt();
        System.out.println("Marathi");
        int marathi = scanner.nextInt();

        
        student studendata = new student(name, hindi, math, science, sst, marathi);

        studentarray.add(new arrayadding(name, hindi, math, science, sst, marathi,studendata.grade()));


      
        

        savedata( studendata.toString());

    }

    public static void savedata(String datas){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME, true))){
            writer.write(datas);
            writer.newLine();
        }

        catch(IOException e){
            System.out.println("Error saving data:" +e.getMessage());
        }
    }


    public static void gettingdata(Scanner scanner){

        
       System.out.println("Enter the name of the studet:");
       String name = scanner.next();

      
      boolean found = false;
       try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
        String line;


        while((line = reader.readLine()) != null){
            if(line.toLowerCase().contains(name.toLowerCase())){

                System.out.println("Your data is");
                System.out.println(line);

                found = true;
                 
                
            }
        }

        if(!found){
            System.out.println("There is no student with name" + name);
        }

       }
       catch(FileNotFoundException e){
        System.out.println("File not found.");

       }
       catch(IOException e){
        System.out.println("Student not found" + e.getMessage());
       }
    }


    //  public arrayadding gettingeachdata(Scanner scanner) {
    public static void findbook(Scanner scanner) {

        System.out.println("Enter the name of the student");
        String name = scanner.next();
        System.out.println("Enter the sub :");
        String sub = scanner.nextLine();
        scanner.next();
        
        for(arrayadding element :studentarray){
            if(element.name.toLowerCase().contains(name.toLowerCase())){
                System.out.println("Name :" + name);
                
                if(sub.equalsIgnoreCase("hindi")){

                    System.out.println("marks in " + sub +":" +element.hindi);
                }
                else if(sub.equalsIgnoreCase("math")){
                    System.out.println("marks in " + sub +":" +element.math);  
                } else if(sub.equalsIgnoreCase("marathi")){
                    System.out.println("marks in " + sub +":" +element.marathi);  
                }
                else if(sub.equalsIgnoreCase("science")){
                    System.out.println("marks in " + sub +":" +element.science);  
                }

                else if(sub.equalsIgnoreCase("sst")){
                    System.out.println("marks in " + sub +":" +element.sst);  
                } 
                
                
            }

            else{
                System.out.println("No student of such name");
            }
        }


     }
    
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     
     boolean running = true;

     while (running) {
        System.out.println("Enter 1 for addding data and 2 for getting all data");
        System.out.println("Enter 3 for getting each data and 4 for terminating the process");
     int choice = sc.nextInt();

        System.out.println("Enter 3 for stoping");
     switch (choice) {
        case 1:
        addingstudent(sc);

            
            break;
        case 2:
        gettingdata(sc);

            
            break;
            case 3:
        findbook(sc);
        // System.out.println("hello");

            
            break;

            case 4:
            running = false;
            break;
     
        default:
        System.err.println("Invalid");
            break;
     }

    }


    

            }
}