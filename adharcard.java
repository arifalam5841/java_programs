import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;


enum catogry  {
    ADULT, CHILD , OLD
};


class detailadd{
    String name ;
    int age;
    String address;
    String mothername;
    String fathername;

    catogry gen;


    public detailadd(String name, int age ,String address,  String mothernane, String fathername){

        this.name = name;
        this.age = age;
        this.mothername = mothernane;
        this.fathername = fathername;
        this.address = address;
      
  
      
    }

    
    public String displayname(){
        return name;
    }
    public String displayaddress(){
        return address;
    }
    public String displaymother(){
        return mothername;
    }   public String diplayfather(){
        return fathername;
    }

    public int displayage(){
        return age;
    }

    @Override
    public String toString(){

        if(this.age <= 18){
            gen = catogry.CHILD;
        } else if(this.age > 18 && this.age <= 60){
            gen = catogry.ADULT;
        } else {
            gen = catogry.OLD;
        }
    
        return "Name: " +name + "Age: " + age + "Address: " + address + "Mothername: " + mothername + "Fathername: " + fathername + "Catego: " + gen;
    }
}
 class adharprocess {
    
    // Vector<detailadd> adharcards = new Vector<>();
    private Vector<detailadd> adharcards;
    public adharprocess(){
        adharcards = new Vector<>();
    }

    public void adding(Scanner sc){
        System.out.println("Enter name:");
        String name = sc.next();
        System.out.println("Enter age:");
        int age = sc.nextInt();
        System.out.println("Enter address:");
        String address = sc.next();
        System.out.println("Enter mother's name:");
        String mothername = sc.next();
        // sc.next();
        System.out.println("Enter father's name:");
        String fathername = sc.next();

        adharcards.add(new detailadd(name, age, address, mothername, fathername));
    }

    public void manualadd(detailadd details){

        adharcards.add(details);

    }

    public void displayalldata(){
        for(detailadd detail : adharcards){
            detailadd newdetail = detail;
            System.out.println(newdetail);
        }
    }


    public void searchname(Scanner sc){
        System.out.println("Enter your name");
        String searchname = sc.next();

        boolean status = false;

        for(detailadd detail : adharcards){
           if(detail.displayname().equalsIgnoreCase(searchname)){
            detailadd newdetail = detail;
            System.out.println("Your searched result");
            System.out.println(newdetail);

            status = true;
           }
           
        }

        if(status){

            System.out.println(
                "Search succes"
            );
        }
        else{
            System.out.println("User not found");
        }

    }
}

public class adharcard {

    public static void main(String[] args) {
     adharprocess obj = new adharprocess();
     Scanner sc = new Scanner(System.in);

    //  obj.adding(sc);

    obj.manualadd(new detailadd("Arif", 17, "navi mumbai", "sajda", "badre"));
    obj.manualadd(new detailadd("Rohan", 19, "navi mumbai", "kaki", "ram"));


    boolean runninng = true;

    while (runninng) {
        System.out.println("1 for applying for adharcard");
        System.out.println("2 for search your adharcard");
        System.out.println("3 for showing all user's adharcard");
        System.out.println("4 for terminating");

        int choice = sc.nextInt();
        

        switch (choice) {
            case 1:

            obj.adding(sc);

            System.out.println("You data save succesfully");
                
                break;

                case 2:
    obj.searchname(sc);
                
                break;

                case 3:
     obj.displayalldata();

     System.out.println("Datas displayed succesfully");
                
                break;

                case 4:


                runninng = false;
                
                break;
        
            default:

            System.out.println("please enter value between 1 to 4");
                break;
        }

    }


    }
}
