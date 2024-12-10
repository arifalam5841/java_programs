
import java.util.Scanner;

public class jagged {
    public static void main(String[] args) {
        int jaggedarr[][] = {
            {8,9,5},
            {5,8},
            {1,5,7,9},
            {7,8,},

     } ;

        String array2[][] = {
            {"ar", "adsd"},
            {"arya"}
        };

        System.err.println(jaggedarr[0][1]);

        jaggedarr[0][1] = 5;

        Scanner sc = new Scanner(System.in);

int iv, iv2,iv3;
int i, j;


         iv = sc.nextInt();
        iv2 = sc.nextInt();
         iv3 = sc.nextInt();

        jaggedarr[iv][iv2] = iv3; 

       
        System.out.println("Updated array");

        for(i = 0; i< jaggedarr.length; i++){
            System.err.println();
            for(j = 0; j < jaggedarr[i].length;j++)
            {

                System.err.println(jaggedarr[i][j]);
            }
        }



System.out.println("Do you want to do more update ?");

        String cond = sc.next();
          
          if ( cond == "yes"){
            
           iv = sc.nextInt();
            iv2 = sc.nextInt();
           iv3 = sc.nextInt();
           jaggedarr[iv][iv2] = iv3; 

        
           System.err.println("New update");
             for(i = 0; i< jaggedarr.length; i++){
               System.err.println();
              for(j = 0; j < jaggedarr[i].length;j++)
                {

                System.err.println(jaggedarr[i][j]);
                }
         }

        }

        else{
            System.err.println("Okayy");
        }
    }
}
