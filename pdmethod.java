import java.util.*;

public class pdmethod {
    String check(int no){

        int no1,rev,sum = 0;

       

        no1 = no;


        while (no1>0) {

            rev = no1%10;
            sum = sum *10 + rev;
            no1 = no1/10;
            
        }

        if( sum == no){

            return "plandrome";
        }

        else{

            return "Not a plandrome";
        }

    }


    public static void main(String[] args) {
        pdmethod funcs = new pdmethod();

        System.out.println("Enter a number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String x = funcs.check(a);

        System.out.println(x);
    }
}
