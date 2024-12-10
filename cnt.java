import java.util.*;


public class cnt {

    int id;
    String name; double salary;

    cnt(){
        Scanner sc = new Scanner(System.in);

        System.err.println("Enter you id:");

        id = sc.nextInt();

        System.err.println("Enter your name");
         
        name = sc.next();

        System.out.println("Enter your salary");

        salary = sc.nextDouble();



    }


    void display(){

        double da ,hra,gross,incentive;
        da = salary *5 / 100;

        hra = salary * 10 /100;

        incentive = 200;
        gross = da + hra + incentive+ salary;

        System.out.println(gross);

    }

    public static void main(String[] args) {
        cnt e = new cnt();
        e.display();
    }
}
