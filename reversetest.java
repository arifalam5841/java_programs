public class reversetest{
    public static void main(String[] args) {
        int a,remender;

        a = Integer.parseInt(args[0]);

        while(a>0){
            remender = a%10;

            System.out.println(remender);
            
            a = a/10;
        }
    }
}