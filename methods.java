import java.util.*;;

public class methods {

    int addition () {
        int a,b,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");

        a = sc.nextInt();
        b = sc.nextInt();

        c = a+b;
        sc.close();
        return c;

    }

    public static void main(String[] args) {
    methods p = new methods(); 

    // when we store the function in a variable the return value of the function is stored in the variable
    int x = p.addition();

    System.out.println("You answer is : " + x);


    }



     
}