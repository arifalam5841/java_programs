
import java.util.Scanner;

public class arrays {
   public static void main(String[] args) {

       int no[] = new int[5], i;

       Scanner sc = new  Scanner(System.in);

       for(i=0;i<5;i++){
        System.out.println("enter no:");
        no[i] = sc.nextInt();
       }

       for(i = 0; i<no.length;i++){
        System.out.println(no[i]);

       }

   } 
}
