import java.util.Scanner;

class IncomingMessage extends Thread{
    @Override
    public void run(){
        try{
            String[] messages ={
                "Hello ! How are you!",
                "Did you complete the project ?",
                "What's your plan for the weekend?",
                "Goodbye!"
            }; 

while (true) {
 
    for(String message : messages){
        System.out.println("Friend :" +message);
        Thread.sleep(4000);
    }   
}
        }
            
            
             catch (InterruptedException e) {
                // TODO: handle exception

                System.out.println("Incoming message thread interrupted");

            }
    
}

}


class outgoingMessages extends Thread{
    private Scanner scanner;

    public outgoingMessages(){
        this.scanner = new Scanner(System.in);
    }


    @Override
    public void run(){
        try {
            while (true) {
                System.out.println("You: ");
                String message = scanner.nextLine();
                if(message.equalsIgnoreCase("exit")){
                    System.out.println("Chat ended.");
                    break;
            }

            Thread.sleep(500);
        }
        } catch (InterruptedException e) {
            // TODO: handle exception
            System.out.println("Outgoing message thred interrupted");
        }
        finally{
            scanner.close();
        }
    }
}

public class chating {
    public static void main(String[] args) {
        System.out.println("Chat started. Type 'exit' to end the chat.");
        
        IncomingMessage incoming = new IncomingMessage();
        outgoingMessages outgoing = new outgoingMessages();

        incoming.start();
        outgoing.start();
        try{
            incoming.join();
            outgoing.join();
        }

        catch(InterruptedException e){
            System.out.println("Main thead intrerrupted.");
        }

        System.out.println("Chat application terminated");
    }
}
