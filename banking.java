import java.util.Scanner;

class mains {
    String name;
    int acc_no;
    String acc_type;
    int balance;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name:");
        name = sc.nextLine();
        System.out.println("Enter the account number:");
        acc_no = sc.nextInt();
        sc.nextLine(); // Consume the newline
        System.out.println("Enter the account type:");
        acc_type = sc.nextLine();
        System.out.println("Enter the balance:");
        balance = sc.nextInt();
        
    }
}

class deposit extends mains {
    void depositing(int amount) {
        balance += amount;
        System.out.println("Amount deposited successfully");
        System.out.println("The balance is: " + balance);
    }
}

class withdraw extends mains {
    void withdrawing(int amount) {
        if (balance > 1000) {
            int filter = balance - 1000;
            if (filter >= amount ) {  // Updated to >=
                if (amount <= 10000 && amount >= 100) {  // Updated to >=
                    balance -= amount;
                    System.out.println("Amount withdrawn successfully");
                    System.out.println("The balance is: " + balance);
                } else {
                    System.out.println("Maximum withdrawal amount is 10000 and minimum is 100");
                }
            } else {
                System.out.println("Insufficient balance");
            }
        } else {
            System.out.println("Minimum balance is 1000");
        }
    }
}

public class banking {
    public static void main(String[] args) {
        mains account = new mains();  // Create a single instance of mains
        account.getdata();

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Deposit and 2 for Withdraw:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                deposit obj1 = new deposit();
                obj1.name = account.name;
                obj1.acc_no = account.acc_no;
                obj1.acc_type = account.acc_type;
                obj1.balance = account.balance;
                
                System.out.println("Enter the amount to be deposited:");
                int amt1 = sc.nextInt();
                obj1.depositing(amt1);
                break;

            case 2:
                withdraw obj2 = new withdraw();
                obj2.name = account.name;
                obj2.acc_no = account.acc_no;
                obj2.acc_type = account.acc_type;
                obj2.balance = account.balance;
                
                System.out.println("Enter the amount to be withdrawn:");
                int amt2 = sc.nextInt();
                obj2.withdrawing(amt2);
                break;

            default:
                System.out.println("Invalid choice");
                break;
        }

        sc.close();
        
    }
}
