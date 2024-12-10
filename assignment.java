public class assignment {
    public static void main(String[] args) {

        int no , no1,rev,sum;
        sum = 0;
        no = Integer.parseInt(args[0]);
        no1 = no;
        
        while(no1>0){
            rev = no1%10;
            sum = sum * 10 + rev;

            no1 = no1/10;


        }

        if(sum == no){
            System.out.println("paladrom");
        }

        else{
            System.out.println("NOt an palandrom");
        }
    }
}
