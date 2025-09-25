import java.util.ArrayList;
import java.util.Scanner;



class thread1 extends Thread{
    @Override
    public void run(){
    System.out.println("Arif alam");
    
    }
    

    public void addingage(threads1 obj, String name){
        threads1.Studendata.add(name);
        System.out.println("age name added");
    }
}
class thread2 extends Thread{
    @Override
    public void run(){

            System.out.println("Yo!");
        
    }

    public void addingname(threads1 obj, String age){
        threads1.Studendata.add(age);
        System.out.println("age age added");
    }



}




// RUNNNABLE

class runnablethreat1 implements Runnable{

    public void run(){
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        System.out.println("This is my thread 1 with not a threat");
        func2();
    }

    public void func2(){
        System.out.println("This is form runnable thread 1");
    }

}
class runnablethreat2 implements Runnable{

    public void run(){
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
        System.out.println("This is my thread 2");
    }

}



public class threads1{

   static ArrayList<String> Studendata = new ArrayList<>();

    public static void displayalldata(){
        for(String eachstudent: Studendata){
            System.out.println(eachstudent);
        }
    }


    public static void main(String[] args) {
        thread1 t1 = new thread1();
        thread2 t2 =  new thread2();

Scanner sc = new Scanner(System.in);
String name = sc.next();
String age= sc.next();
threads1 mainobj = new threads1();


        t1.start();
        t2.start();
t1.addingage(mainobj, name);
t2.addingname(mainobj, age); 

sc.close();

        // t2.addingname();

        displayalldata();



        // RUNNNABLE -------------------------

        runnablethreat1 bullet1 = new runnablethreat1();
        Thread gun1 = new Thread(bullet1);
        runnablethreat2 bullet2 = new runnablethreat2();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();
        
    }
}
