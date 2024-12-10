
import java.util.Scanner;

public class tabel2 {
    public static void main(String[] args) {
        int no[][] = new int[3][5];

        Scanner sc = new Scanner(System.in);

        int i , j;
        for(i = 0; i < 3; i++){
            System.err.println("total marks");
           no[i][0] = sc.nextInt();

           System.out.println("Enter the marks of subject");
           no[i][1] =  sc.nextInt();
           no[i][2] =  sc.nextInt();
           no[i][3] =  sc.nextInt();
           
           no[i][4] =  no[i][1] + no[i][2] + no[i][3]; 
        }


        for(i = 0; i < 3; i++){
           System.err.println("Mark :" + no[i][0]);
           System.err.println("Sub 1 :" + no[i][1]);
           System.err.println("Sub 2 :" + no[i][2]);
           System.err.println("Sub 3 :" + no[i][3]);
           System.err.println("Total :" + no[i][4]);
        }
    }
}
