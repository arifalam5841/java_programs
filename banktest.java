import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class first {

    String name ;
    int blance;
    int accout_number;
    String account_type;
    String message;

    int index = 0;
    ArrayList<List<String>> nestedList = new ArrayList<>();
    

   void mains(String name, int blance, int accout_number, String account_type){
        this.name = name;
        this.blance = blance;
        this.accout_number = accout_number;
        this.account_type = account_type;

    
   
    }


    
}


 class deposit_class extends first{
    void depositing(int amount) {
        blance += amount;
        System.out.println("Amount deposited successfully");
        System.out.println("The balance is: " + blance);

    ArrayList<String> nestedList1 = new ArrayList<>();
    
    nestedList1.add(name);
    nestedList1.add( "" +blance );
    nestedList1.add( "" +accout_number );
    nestedList1.add( account_type );
    // nestedList1.add(name);
        // List<String> list1 = List.of(name,String.valueOf(blance,)String.valueOf(accout_number), account_type); // to make collections in array 
       
    
        nestedList.add(nestedList1);


         System.out.println(nestedList.get(index));
         index++;

    }
}


class withdraw_class extends first{
    void withdraw(int amount){
         if(blance >= 1000){

             int filter = blance - 1000;
             
             if(amount >= filter){
                  if(amount <= 1000 && amount >=100){
                    blance = blance - amount;
                    message = "Compeleted !!";
                    System.out.println(message);
                  }
             }

             else{
                message = "Insufficient balance";
                System.out.println(message);
             }


         }

         else{
            message = "Balance must be more than 1000";
            System.out.println(message);
         }
    }
}



public class banktest{
    public static void main(String[] args) {

        // first obj = new first();
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter name :");
        String name = sc.nextLine();
        System.out.println("Enter balance :");
        int balance = sc.nextInt();
        System.out.println("Enter account number :");
        int acc_no = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.println("Enter account type :");
        String acc_type = sc.nextLine();

        // obj.mains(name, balance, acc_no, acc_type);

        System.out.println("Enter 1 for deposit and 2 for widraw");
       
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                
               int amt = sc.nextInt();
               deposit_class obj2 = new deposit_class();
               obj2.mains(name, balance, acc_no, acc_type);
               obj2.depositing(amt);
                break; 
                
                case 2:
                int amts= sc.nextInt();

                withdraw_class obj3= new withdraw_class();
                obj3.mains(name, balance, acc_no, acc_type);

                obj3.withdraw(amts);
                break;
        
            default:
            System.out.println("invalid input");
                break;
        }

    }
}