import java.util.Scanner;

public class password {
    String pass;
    String pass_status;
    String message;
    password(String pass){
        this.pass = pass;
    }

    void len(){
        int len = pass.length();
        if(len>= 10){
            pass_status = "valid";
            
            if(pass.matches(".*[A-Z].*")){
                pass_status  = "valid";
                if(pass.matches(".*[0-9].*")){
                    pass_status = "valid";

                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter your name");
                    String name = sc.nextLine();
                    System.out.println("Enter your email");
                    String email = sc.nextLine();
                    sc.close();
                }
                else{
                    pass_status = "invalid";
                    message = "Password must contain at least one digit";
                }
            }
            else{
                pass_status = "invalid";
                message = "Password must contain at least one uppercase letter";
            }
        }
        else{
            pass_status = "invalid";
            message = "Password length is less than 10 letters";
            // Scanner sc = new Scanner(System.in);

            // System.out.println("Enter the password again");
            // String pass2 = sc.nextLine();
            // if(pass.equals(pass2)){
            //     pass_status = "valid";
            // }
            // else{
            //     pass_status = "invalid";
            // }
            // sc.close();
        }
    }

    int status_check(){
        if(pass_status.equals("valid")){
            return 1;
        }
        else{
            return 0;
           

        }
    }


    void loop_func(){
        if(status_check() == 1){
            System.out.println("Your profile updated successfully");
        }
        else{
            System.out.println("Your profile is not updated");
            System.out.println("Please enter the password again");
            System.out.println(message);
            Scanner sc = new Scanner(System.in);
            String pass2 = sc.nextLine();
            password obj2 = new password(pass2);
            obj2.len();
            obj2.status_check();
            obj2.loop_func();
            sc.close();
        }
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String passs = sc.nextLine();
        password obj = new password(passs);
        obj.len();
        obj.status_check();
        obj.loop_func();


       
        sc.close();
    }
}
