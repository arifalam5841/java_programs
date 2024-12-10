public class reverse{
    public static void main(String[] args) {
        int no,remender;

        no = Integer.parseInt(args[0]);

        while(no>0){
            remender = no%10;
            System.out.print(remender);
            no = no/10;
        }
    }
}
