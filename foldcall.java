import java.util.Scanner;

import fold.*;

public class foldcall {
    public static void main(String[] args) {

        pack1 obj = new pack1();

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(obj.displaydata(a, b));
        sc.close();
    }
}
