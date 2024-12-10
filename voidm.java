
import java.util.*;
public class voidm {
    int pract(int a ,int b){
        int c = a+b;

        return c;

    };

    String check(int v){

        int r;
        r = v%2;
        if(r == 0){
            return "It is a even number";
        }
        else{
            return " It is not a even number ";
        }


        
    }

    public static void main(String[] args) {

        voidm func = new voidm();


        Scanner sc = new Scanner(System.in);

        System.err.println("Enter two numbers ");
        int a = sc.nextInt();

        int b = sc.nextInt();

        int x = func.pract(a, b);


        System.err.println("Your value is " +x);


        String result = func.check(x);

        System.err.println(result);





    

    }
}
