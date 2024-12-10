import java.util.Scanner;

interface payments {





    
    void payment(double amount);
 
}

class credit_card implements payments{
    @Override
    public void payment(double amount){
        System.err.println("Payment of " + amount+ "is done by credit card");
        // credit_card -= amount;
    }
}

class debit_card implements payments {
    @Override
    public void payment(double amount){
        System.err.println("Payment of " + amount + "is done by debit card");
    }
}



class upi implements payments {

    @Override
    public void payment(double amount){
        // this.amount = amount;
        System.out.println("Payment of " + amount +"is done by upi");
    }
}

public class mains {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your choice");
        System.out.println("1. UPI");
        System.out.println("2. Credit Card");
        System.out.println("3. Debit Card");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the amount");
                double amount = sc.nextDouble();
                new upi().payment(amount);
                break;

                case 2:
                System.out.println("Enter the amount");
                double amounts = sc.nextDouble();
                new credit_card().payment(amounts);
                break;
        
                
                case 3:
                System.out.println("Enter the amount");
                double amount3 = sc.nextDouble();
                new debit_card().payment(amount3);
                break;
                
        
            default:
            System.out.println("Invalid choice");
                break;
        }

 
    }
}



// interface Payment {
//     void pay(double amount);
// }

// class CreditCardPayment implements Payment {
//     @Override
//     public void pay(double amount) {
//         System.out.println("Paid " + amount + " using Credit Card.");
//     }
// }

// class UPIPayment implements Payment {
//     @Override
//     public void pay(double amount) {
//         System.out.println("Paid " + amount + " using UPI.");
//     }
// }

// public class PaymentSystem {
//     public static void main(String[] args) {
//         Payment payment1 = new CreditCardPayment();
//         Payment payment2 = new UPIPayment();

//         payment1.pay(1500.50);
//         payment2.pay(750.75);
//     }
// }
