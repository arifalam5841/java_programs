public class ifelse3 {
    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(args[0]);

        if(num%5 == 0 && num%10 == 0 && num%2 == 0){
            System.out.println("It is divisible");
        }

        else{
            System.out.println("It is not divisible by any number");
        }
    }
}
