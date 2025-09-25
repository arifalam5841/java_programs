
class mythread implements Runnable{
    public void run(){
        System.out.println("The name is : " + Thread.currentThread().getName());
    }
}

public class threadprio {
    
    public static void main(String[] args) {
        
        mythread run = new mythread();

        Thread t1 = new Thread(run,"arif1");
        Thread t2 = new Thread(run,"arif2");
        Thread t3 = new Thread(run,"arif3");
        Thread t4 = new Thread(run,"arif4");
        Thread t5 = new Thread(run,"arif5");



        t5.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);

        // you can use numbers also intead of above code

// MAX - 10
// NORM - 5
// MIN - 1
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
