import java.util.Scanner;

public class bankd {
    
    int account_number, amont_credit;
    String name,ifsc;
    int credit = 1000;
    int debit = 2000;
    

    
    bankd(){

      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your Account number " );

      account_number = sc.nextInt();
    
      System.out.println("Enter your Name " );
      name = sc.next();
    //   name = sc.nextLine();


      System.out.println("Enter your IFSC code " );

      ifsc = sc.next();

      System.out.println("Enter the ammout you want to take out : " );

      amont_credit = sc.nextInt();

      System.out.println("BANK DETAIL ");
        System.out.println("Name:" + name);
        System.out.println("Account number:" + account_number);
        System.out.println("IFSC:" + ifsc);
        System.out.println("Updated Balance");


      
         

    }

    void credits(){

        
        System.out.println("Credit:" +( credit + amont_credit));
        
    }
 void debits(){

        
        System.out.println("Debit:" + (debit - amont_credit));
        
    }


    public static void main(String[] args) {
        bankd bank = new bankd();

     bank.credits();
     bank.debits();


    }
}
