import java.security.PublicKey;

class mythr extends Thread{

    String age;
    public mythr(String myname,String age){
        super(myname);
        this.age = age;

    }
    public void run(){

        System.out.println("This is a thread that use constructor");
        System.out.println(age);
    }
}

class myrunnable implements Runnable{
    @Override
    public void run(){
        for(int i  =0; i <= 5;i++){
            System.out.println(Thread.currentThread().getName() + "is running");
            try{
                Thread.sleep(1000);
                Thread.sleep(1000);
            }

            catch(InterruptedException e){
                System.out.println(Thread.currentThread().getName() + "was intrerruption");
            }
        }

        try{
            Thread.sleep(1000); // it stops for the given time period and then execute the next code

        }


        catch(InterruptedException e){
            System.out.println("There was error while ending the programme");
        }
        System.err.println("THe programe is over");



    }
}

public class threadconst {

    public static void main(String[] args) {
        mythr t1 = new mythr("Arif", "17");

        t1.start();
        System.out.println(t1.getId());
        System.out.println(t1.getName());

        String t1name= t1.getName();
        mythr t2 = new mythr("alam",  t1name);

        System.out.println(t2.getName());

        t2.start();



        myrunnable run = new myrunnable();

        Thread rt1 = new Thread(run,"Worker 01");
        Thread rt2 = new Thread(run, "Worker 2 ");

        rt1.start();
        rt2.start();


        }
}
