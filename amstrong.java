public class amstrong {
    public static void main(String[] args) {
        int no,sum =0,no1,rev;

        no = Integer.parseInt(args[0]);
        no1 = no;

        while(no1>0){
            rev = no1%10;
            sum = sum + rev * rev * rev;

            no1 = no1/10;


        }

        if(sum == no){
            System.out.println("Amstrong");
        }

        else{
            System.out.println("NOt an amstrong");
        }
    }
}
