import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

abstract class studentdata{
   
    String name ;
    public studentdata(String name){
        
       this.name = name;

    }

    

    void displayingdata(){};
} 


class users{
    String std, cast, fathernamee, mothername, lastschool;
    int paidfee;
    String name;
    public users(String name,String std, String cast ,String fathername,String mothername, String lastschool, int paidfee){

          this.name = name;
          this.std = std;
          this.cast = cast;
          this.fathernamee = fathername;
          this.mothername = mothername;
           this.lastschool = lastschool;
           this.paidfee = paidfee;


    }
}



class schoolmanage {
   
     
ArrayList<users> studentdata = new ArrayList<>();

public void pushdata(String name,String std, String cast ,String fathername,String mothername, String lastschool, int paidfee){
    studentdata.add(new users(name, std, cast, fathername, mothername, lastschool, paidfee));
    System.out.println("Student is added succesfully");
}


// public ArrayList<users> displayusers(){
//     return studentdata;
 
// }
public String displayusers(){
    for (users user : studentdata) {
        // if (user.name.equalsIgnoreCase(username)) {
           System.out.println(user.name);
           System.out.println(user.paidfee);
        //    System.out.println(user.paidfee);

        // }
    }
    return null;
 
}


public void payingfee(String username,int amout){




  

    try {
        users gotuser = findBook(username);

        if(gotuser == null) throw new Exception("User not found");
        else{
            int abouttobepaid = 70000 - gotuser.paidfee;
            if(amout <= abouttobepaid){
                gotuser.paidfee += amout;
              System.out.println("Fees paid successfully");
            }
            else{
                System.out.println("Your due amout is" + abouttobepaid);
                System.out.println("The amount you paid is too much");
            }
           
        }

    } catch (Exception e) {
        System.out.println("Error :");
        System.out.println(e);
        System.out.println("User not found");
        
    }
   



}


public void displayfee(String username){
    try {
        users gotuser = findBook(username);

        if(gotuser == null) throw new Exception("User not found");
        else{
            System.out.println("Student name: " + gotuser.name);
          System.out.println("Fees: " + gotuser.paidfee);
        }

    } catch (Exception e) {
        System.out.println("Error :");
        System.out.println(e);
        
    }
}

private users findBook(String username) {
    for (users user : studentdata) {
        if (user.name.equalsIgnoreCase(username)) {
            return user;

        }
    }
    return null;
}



}



public class school { 

 

    public static void main(String[] args) {
        schoolmanage obj = new schoolmanage();


        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
     

        obj.pushdata("arif", "11", "muslim", "Badre alam", "Sajda tabassum", "Elite", 70000);
        obj.pushdata("alam", "11", "hindi", "Badre alam", "Sajda tabassum", "Elite", 5000);

        switch (choice) {
            case 1:
            System.out.println("Please enter the details for admission");
            System.out.println("Name:");
            String name = sc.next();
            System.out.println("Class:");
            String std = sc.next();
            System.out.println("Cast:");
            String cast = sc.next();
            System.out.println("Father's Name:");
            String fathername = sc.next();
            System.out.println("Mother's Name:");
            String mothername = sc.next();
            System.out.println("Last School:");
            String lastschool = sc.next();
            System.out.println("Fee paying on the time of admissions:");
            int paidfee = sc.nextInt();
            sc.next();
            obj.pushdata(name,std,cast,fathername,mothername,lastschool,paidfee);
            // System.out.println();
            obj.displayusers();
                break;

                case 2:

                System.out.println("Please enter name of the student");
                String feename = sc.next();
                System.out.println("Enter the amout to be paid");
                int feepay = sc.nextInt();
                obj.payingfee(feename, feepay);
              
                obj.displayusers();
                break;

                case 3:

                System.out.println("Enter the name of the student whose fee you want to see");
                String seename = sc.next();
                obj.displayfee(seename);
                obj.displayusers();
                break;
        
            default:
            System.out.println("Please enter valid input");
                break;
        }


        sc.close();


    }
}


