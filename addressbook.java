import java.io.*;
import java.util.*;


abstract class contact {
    String name;
    int phone;
    String email;

    public contact (String name, int phone , String email){
       this.name = name;
       this.phone = phone;
       this.email = email;
    }

    public abstract String toString();
}


class personalcontact extends contact{

    String birthday;
    public personalcontact(String name, int phone, String email, String birthday){
     super(name, phone,email);
    this.birthday = birthday;
    }


    @Override
    public String toString(){
        return "Personalconcant" + " "+ name + " " +phone + " " + email  + " " + birthday;
     }

}


class businesscontact extends contact{
    String company;
    public businesscontact(String name, int phone, String email, String company){
        super(name, phone, email);
        this.company = company;
    }

    @Override
    public String toString(){
        return "Business Contact :" +" " + name + " " + phone + " " +email + " " + company;
    }
}



public class addressbook {
    static final String FILE_NAME  = "contact.txt";


    public static void addcontact(Scanner scanner){
            
        System.out.println("Add a Contact:");
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter phone: ");
        int phone = scanner.nextInt();
      
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        scanner.nextLine();
        System.out.println("1 for personal contact and 2 for business contacts");
        int type = scanner.nextInt();

        scanner.nextLine();// it will consume a newline

        String extraifo = "";

        if(type == 1){
            System.out.println("Enter birthday (YYYY-MM-DD)");
            extraifo = scanner.nextLine();

      personalcontact contact = new personalcontact(name, phone, email, extraifo);
            savetofile(contact.toString());
        }

        else{
            System.out.println("Invalid contact type.");
            return;
        }
        System.out.println("Contact added succesfully !");
    }


    private static void savetofile(String contact){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME,true))){
            writer.write(contact);
            writer.newLine();
        }

        catch(IOException e){
            System.out.println("Error saving contact :" + e.getMessage()  );


        }
    }


    public static void viewcontacts(){
        System.out.println("\nView All Contacts:");
        try(BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))){
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

        }

        catch(FileNotFoundException e){
            System.out.println("No contacts found. File does not exist.");
        }

        catch(IOException e){
            System.out.println("Error reading contacts:" + e.getMessage());
        }
    }


    public static void searchcontact(Scanner scanner){
        System.out.println("Enter the name to search :");
        String searchName = scanner.nextLine();

        boolean found = false;
        try(BufferedReader reader  = new BufferedReader(new FileReader(FILE_NAME))){
            // String line = reader.readLine();
            String line;
            while ((line = reader.readLine()) != null) {
            // while (line != null) {
                if(line.toLowerCase().contains(searchName.toLowerCase())){
                    System.out.println("Found " + line);
                    found = true;
                }
            }

            if(!found){
                System.out.println("No contact found with the name :"+ searchName) ;
            }
        }

        catch(FileNotFoundException e){
            System.out.println("NO contacts fond. file does not exist");
        }
        catch(IOException e){
            System.out.println("Error searching contacts" + e.getMessage());
        }
    }

    
   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean running = true;

        // the while is used to repeat the function again and again after a work is done while the "running" is true
        // in the switch case there is case of "5" if the user write that the "running" variable becomes false and the function ends and will not repeat
        

        while (running) {

            System.out.println("Address Book Menu:");
            System.out.println("1. Add Contact");
            System.out.println("2. View Contacts");
            System.out.println("3. Search Contact");
            System.out.println("4. Delete Contact");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            sc.nextLine();

            switch (choice) {
                case 1:
                    addcontact(sc);
                
                    break;


                    case 2:
                    viewcontacts();
                    
                    break;

                    case 3:
                    searchcontact(sc);
                    break;

                    
                    case 5:
                    running = false;
                    break;
            
                default:
                System.out.println("Invalid input ");
                    break;
            }
        }


        
        sc.close();    

    

    
}
}

