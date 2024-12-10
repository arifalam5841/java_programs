import fold.innerfol.*;
import java.util.Scanner;
public class foldpak {
    public static void main(String[] args) {
        inner obj = new inner();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        obj.cal(a, b);
        System.out.println("The answer is");
        obj.display();
        sc.close();
    }
}
