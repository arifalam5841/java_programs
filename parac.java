import java.util.Scanner;

public class parac {
 int x,y;

    parac(int a, int b){
        
        x = a;
        y = b;

    }

    void addition(){
        System.out.println(x+y);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int m , n;

        m = sc.nextInt();
        n = sc.nextInt();

        parac p = new parac(m, n);
        p.addition();
    }
}