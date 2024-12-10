import java.util.Scanner;

class first {

    String name ;
    int id ;

    void getdetails(String name, int id){
       this.name = name;
       this.id = id;
    }
}

class second extends first {
    int m1,m2,m3;

    void getmarks(int m1, int m2, int m3){
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
}

class result extends second{
    int  cal(){
        return m1+m2+m3;
    };

    void display(){

        System.out.println("Your name is :" + name);
        System.out.println("Your id is :" + id);
        System.out.println("Mark  1:" + m1);
        System.out.println("Mark 2:"+ m2);
        System.out.println("Mark 3:"+ m3);

    }

}

class grade extends result{
    void grades(){
        if(cal() >= 250){
            System.out.println("Grade : A");

        }
        else if(cal() >= 200){
            System.out.println("Grade : B");
        }
        else {
            System.out.println("Grade : Fail");
        }
    }
}

public class multinher {

    public static void main(String[] args) {
        
        grade r = new grade();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = sc.nextLine();
        System.out.println("Enter your id :");
        int id = sc.nextInt();
       
        System.out.println("Enter your marks :");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();

        r.getdetails(name, id);
        r.getmarks(m1, m2, m3);
        r.cal();
        r.display();
        r.grades();
        
        sc.close();
    }
}