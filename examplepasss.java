import java.time.LocalDate;
import java.util.Scanner;

class main1{
    String value;
    int lenghts;

    public main1(String s){
       value = s;
      lenghts = s.length();

    }

 

    public void checking_password(){
        String s = this.value;

        boolean Uppercase = false;
        boolean Lowercase = false; 
        boolean numcase = false;
        boolean symbolcase = false;

        for(int i = 0;i<s.length();i++){
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                Uppercase = true;
            }

            else if(c >= 'a' && c <= 'z'){
                Lowercase = true;
            }

            else if(c >= '0' && c <= '9'){
                numcase = true;
            }

            else{
                symbolcase = true;
            }
        
        }

        if(Uppercase){
            System.out.println("It has upper cases");
        }

        if(Lowercase){
            System.out.println("It has lower cases");
        }

        if(numcase){
            System.out.println("It has numbers");
        }
        
        if(symbolcase){
            System.out.println("It has symbols");
        }


        // return Uppercase;
        
       
    }


    @Override
    public String toString(){
        return value;
    }
}


public class examplepasss {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the password");
    String pass  = sc.next();

    main1 obj = new main1(pass);

    System.out.println("Your password is :" + obj);
    // System.out.println("Your password is :" );
    obj.checking_password();
    sc.close();

    
  }
}