import java.io.Serializable;
import java.nio.Buffer;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

import javax.imageio.stream.FileImageInputStream;
import javax.sound.midi.SysexMessage;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

abstract class mainclass{

    String name;
    String createdpassword;
   int id;
boolean passwordstatus;
    public mainclass(String name, String createdpassword, int id){

        this.name = name;
        this.createdpassword = createdpassword;
        this.id = id;

    }

    public void settingstatus(boolean setstatus){
        this.passwordstatus = setstatus;
    }

    public int passwordlength(){
        int len = createdpassword.length();
        return len;
    }

    public String displayname(){
        return name;
    }
    public String displaycreatedpassword(){
        return createdpassword;
    }
    public int displayid(){
        return id;
    }

}


class newuser{
    String name;
    String passwordfile;
    int id;

    public newuser(String name,String passwordfile, int id){
        this.name = name;
        this.passwordfile = passwordfile;
        this.id = id;
    }

    public String displayname(){
 return name;
    }    public String displaypasswordfile(){
 return passwordfile;
    }    public int displayid(){
 return id;
    }

}
class fileuser implements Serializable{
    String name;
    String password;
    int id;

    public fileuser(String name, String password , int id){
        this.name = name;
        this.password = password;
        this.id = id;
    }
}



class addingdata extends mainclass{
    public addingdata(String name, String createdpassword, int id){
        super(name,createdpassword,id);
    }

    public void checkingdata(){

        int len = passwordlength();

        String createdpass = displaycreatedpassword();
        if(len> 3){
         
            if(createdpass.matches(".*[A-Z].*")){
                if(createdpass.matches(".*[0-9].*")){
            settingstatus(true);
            System.out.println("password is good");
                 
                }

                else{
                    System.out.println("password must contains digits");
                    settingstatus(false);
                }
            }
            else{
                System.out.println("password must contain capital letters");
            }
        }

        else{
            System.out.println("The length of the password should be more than 3");
        }

    }
    
    public void finaladdingdata(authen objauthen){
        if(passwordstatus){
            long currentime = System.currentTimeMillis();
            System.out.println(currentime);

            String filename = Long.toString(currentime) + displayname()+ ".txt";
            System.out.println(filename);
            try {
                fileuser newusers = new fileuser(displayname(), displaycreatedpassword(), displayid());

               
                FileOutputStream fout = new FileOutputStream(filename);

                ObjectOutputStream out = new ObjectOutputStream(fout);

                out.writeObject(newusers);
                out.flush();
                out.close();
                System.out.println("File has been made !!");

                authen.userslist.add(new newuser(displayname(), filename, displayid()));



                FileWriter file = new FileWriter("allusers.txt",true);

                BufferedWriter bufferrwrite = new BufferedWriter(file);

                String detail = "Name : " + displayname() + " , " + "password-path : " + filename + " , " + "ID : " + displayid();
 
                bufferrwrite.write(detail + "\n");

                bufferrwrite.close();

            } catch (IOException e) {
             e.printStackTrace();
                // TODO: handle exception
            }
        }
        else{
            System.out.println("it is false");
        }
    }



}

public class authen {

static LinkedList<newuser> userslist = new LinkedList<>();
    

public static void searcuser(String name){

    ListIterator itr = userslist.listIterator();

    boolean findinguser = false;
    String founduserpass = null;

    while (itr.hasNext()) {

        newuser nextuser = (newuser)itr.next();

        if(nextuser.name.equalsIgnoreCase(name)){

            findinguser = true;

            founduserpass = nextuser.passwordfile;

        }
        
    }


    if(findinguser){

try {

    // String founpas = founduserpass;
    FileInputStream readingfile = new FileInputStream(founduserpass);

    ObjectInputStream finalreading = new ObjectInputStream(readingfile);

    fileuser founduser = (fileuser)finalreading.readObject();

    System.out.println("Your password is :");
    System.out.println(founduser.password);

    finalreading.close();
} catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace(); 
}

        System.out.println("user found");

    }

    else{
        System.out.println("user not found");
    }

}

public static void displayalldata(){
     ListIterator itr = userslist.listIterator();

        while (itr.hasNext()) {

            // System.out.println(itr.next());
            newuser nextcustomer = (newuser)itr.next();
            // System.out.println(nextcustomer.name + " " + nextcustomer.product + " " + nextcustomer.price);
            System.out.println(nextcustomer.name + nextcustomer.id + " " + nextcustomer.passwordfile);
        }
}
    public static void main(String[] args) {
        authen mainauthen = new authen();
        Scanner sc = new Scanner(System.in);


        boolean runstatus = true;

        while (runstatus) {

           System.out.println("1. For adding user");
           System.out.println("2. For searching user");
           System.out.println("3. For terminating the process");
           int choice = sc.nextInt();

           switch (choice) {
            case 1:
                
            System.out.println("Enter name: ");
            String name = sc.next();
            System.out.println("Enter Id: ");
            int id = sc.nextInt();
            System.out.println("Create a Password: ");
            String createdpass = sc.next();

            addingdata obj = new addingdata(name, createdpass, id);
            
obj.checkingdata();
obj.finaladdingdata(mainauthen);
            // System.out.println("User added successfully !!!");

                break;
            case 2:

            System.out.println("Enter the name of the user : ");
String seachuser = sc.next();
searcuser(seachuser);
                
                break;   
                  case 3:

                  runstatus = false;
                
                break;
           
            default:
            System.out.println("Please enter valid command.");
                break;
           }
         
            
        }

      


// userslist.add(new newuser("arifalammmm", "arifa.txt", 5));
// userslist.add(new newuser("arifalammmm", "arifa.txt", 5));
// userslist.add(new newuser("arifalammmm", "arifa.txt", 5));
// displayalldata();

addingdata obj = new addingdata("rohanddd", "arifaddD55dlammm", 745);
            
obj.checkingdata();
obj.finaladdingdata(mainauthen);
sc.close();
    }
}




