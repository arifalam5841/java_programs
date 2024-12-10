import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Scanner;

import javax.annotation.processing.FilerException;
import javax.swing.plaf.synth.SynthScrollBarUI;

abstract class employee{
    String name, work ;
    int salary;
    public employee(String name, String work, int salary){
        this.name = name;
        this.work = work;
        this.salary = salary;
    }

   public abstract  String toString();
}


class addingemployee extends employee{
    public addingemployee(String name, String work , int salary){
        super(name,work,salary);
    }




    @Override
    public String toString() {
       return "Name " + name  +" " + "proffesion " +  work + " " + "salary " + salary; 
    }
}


class arrayaddingempolyee{
    String name;
    String profn;
    int salary;
    public arrayaddingempolyee(String name, String profn  , int salary){
           this.name = name;
           this.profn = profn;
           this.salary = salary;
    }
}

public class rewritefile2 {
    
    static final String FILE_NAME = "employees.txt";


    static ArrayList<arrayaddingempolyee> employeedata = new ArrayList<>();


    

    public static void addingdata(Scanner scanner){

        System.out.println("Enter the details of the employee");
        System.out.println("Name :");
        String name = scanner.next();
        System.out.println("Proffesion:");
        String work = scanner.next();
        System.out.println("Salary:");
        int salary = scanner.nextInt();
        scanner.next();


        employeedata.add(new arrayaddingempolyee(name, work, salary));
    
        addingemployee newemolyee =new addingemployee(name, work, salary);

        savedata(newemolyee.toString());

    }

    public static void savedata(String datas){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME,true))){
            writer.write(datas);
            writer.newLine();
            

        }

        catch(IOException e){
            System.out.println("File not created");
        }
    }



    // public static int rewriting(String name, String replacedname){
        // Scanner scanner  = new Scanner(System.in);
      
    public static int rewriting(String name,String replacedname) {

        File file = new File("employees.txt");
        File tempfile = new File("employetemp.txt");



        // System.out.println("Enter the name of the empolyee you want replace");
        // String name = scanner.nextLine();
        // System.out.println("Enter the name of the name with which you want to replace the name");
        // String replacedname = scanner.nextLine();
        // int count =0;
        int count = 0;

        try(BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile))){

                String line;

                while ((line = reader.readLine()) != null) {

                    int linecount = line.split(name, -1).length -1;
                    count += linecount;

                    line = line.replace(name,replacedname);

                    writer.write(line);
                    writer.newLine();
                }
            }
           
            
       
        catch(FileNotFoundException e){
            System.out.println("Error: File not found" + e.getMessage());
        }
        catch(IOException e){
            System.out.println("Error: could not update" + e.getMessage());
         return -1;
        }

        
        if(count >1){
        // file.delete();
        // tempfile.renameTo(file);
        // System.out.println("Done");
         if(!file.delete() || !tempfile.renameTo(file)){
                System.out.println("Error : Could not update the original file.");
            }
        
        }
            else{
             tempfile.delete();
         }

        return count;
    }

    public static void updatingdata(Scanner scanner){

        System.out.println("Enter the name of the employee");
        String empname = scanner.next();
        System.out.println("What you want to update");
        System.out.println("1. For name");
        System.out.println("2. For Profession");
        System.out.println("3. For Salary");

        int choice = scanner.nextInt();
        scanner.next();

      if(choice == 1){     
        System.out.println("Please enter the new name");
        String updatedata = scanner.next();


        for(arrayaddingempolyee emp : employeedata){
            if (emp.name.equalsIgnoreCase(empname)) {
                emp.name = updatedata;
                System.out.println("Name updated");
            }
        }
      }

      else if(choice == 2)
{
    System.out.println("Please enter the new proffesion");
    String updatedata = scanner.next();

        for(arrayaddingempolyee emp : employeedata){
            if (emp.name.equalsIgnoreCase(empname)) {
                emp.profn = updatedata;
                System.out.println("Proffesion updated");
            }
        }
}

else if(choice == 3){
    System.out.println("Please enter the new salary");
    int updatedata = scanner.nextInt();

    for(arrayaddingempolyee emp : employeedata){
        if (emp.name.equalsIgnoreCase(empname)) {
            emp.salary = updatedata;
            System.out.println("salary updated");
        }
    }
}
       

        File file = new File("employees.txt");
        File tempfile = new File("employetemp.txt");


        try(BufferedReader reader = new BufferedReader(new FileReader(file));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempfile))){

                // String line;

                for(arrayaddingempolyee emp : employeedata){
                    String dataline = "Name " + emp.name + " " + "Proffesion " + " " + emp.profn + " " + "Salary " + " " + emp.salary;

                    writer.write(dataline);
                    writer.newLine();
                }


        }
        catch(FileNotFoundException e){
            System.out.println("File not foun:" + e.getMessage());
        }

        catch(IOException e){
            System.out.println("File could not update" + e.getMessage());
        }

        file.delete();
        tempfile.renameTo(file);
        System.out.println("Data updated succesfully");



}

// public static void gettingdata(){
//     // for(arrayaddingempolyee emp : employeedata){
//     //     System.out.println(emp.name);
//     // }

//     System.out.println(employeedata.get(1));

//     System.err.println("Hllo");
// }
            
    

    

    // public static void writingfile(){

    // }
    public static void main(String[] args) {
        


        boolean running = true;

        Scanner scanner = new Scanner(System.in);

      

        while (running) {
            System.out.println("1. For adding data");
            System.out.println("2. For rewriting data");
            System.out.println("3. For updating data");
            int mychoice = scanner.nextInt();
            switch (mychoice) {
                    case 1:
                    addingdata(scanner);

                    break; 
                    
                    case 2:

                    System.out.println("Enter the text you want replace");
                    String replacetext = scanner.nextLine();

                    System.out.println("Enter the name which you want to overwrite");
                    String overwritedata = scanner.nextLine();

                   rewriting(replacetext, overwritedata);
                    
                    break;

                    case 3:

                    updatingdata(scanner);
                    
                    break;
                
            
                default:
                System.out.println("please enter valid input");
                    break;
            }
        }
        



        // for(arrayaddingempolyee emp : employeedata){
        //        if(emp.name == "sham"){
        //         System.out.println(emp.salary);
        //        }
        // }

        // gettingdata();

        // System.out.println("working");
    }
}
