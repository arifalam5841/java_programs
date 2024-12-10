public class rpc {
    public static void main(String[] args) {
        int a,b;

        a =  Integer.parseInt(args[0]);
        b =  Integer.parseInt(args[1]);

        if(a == 1 && b == 2){
            System.out.println("Play A wins");
        }
      

       else if  ( a == 1 && b == 3){
            System.out.println("Play B wins");
        }

       
        else if ( a == 3 && b == 2){
            System.out.println("Play B wins");
        }

        else {
            System.out.println("enter valid value");
        }
    }
}
