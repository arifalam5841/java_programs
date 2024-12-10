import java.util.*;


public class inputout {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int id;
            String nm;
            double sal;
            char gen;

            System.out.println("Enter the id");
            id = sc.nextInt();

            System.out.println("Enter the name");
            nm = sc.next();

            System.out.println("Enter the salary");
            sal = sc.nextDouble();
            sc.nextLine();

      System.out.println("Enter the gender");
      gen = sc.next().charAt(0);


      System.out.println("Id is " + id);
      System.out.println("Name is " + nm);
      System.out.println("Salary is " + sal);
      System.out.println("Gender is " + gen);

      sc.close();
        }
    }
