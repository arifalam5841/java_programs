import java.util.Scanner;




public class Factorial {

 int num;
Factorial(){
    Scanner sc = new Scanner(System.in);

   num = sc.nextInt();
   sc.close();
}

void display(){
    int fact = 1;
    for (int i = 1; i <= num; i++) {
        fact *= i;
    }
    System.out.println("Factorial of " + num + " is " + fact);

}
    public static void main(String[] args) {
           
        Factorial func = new Factorial();

        func.display();
          
        }
    }
