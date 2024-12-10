import java.util.*;

public class stcfunc {

    static int x;
    static void static_func1(int a, int b){
        x = a+b;

        System.err.println(x);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter two number:");
        int y = sc.nextInt();
        int z = sc.nextInt();

        static_func1(y,z);
    }
}
