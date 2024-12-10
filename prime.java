public class prime {
    public static void main(String[] args) {
        int no,i,flag;

        flag = 0;
        no = Integer.parseInt(args[0]);

        for(i=2;i<no;i++){
            if(no%i == 0){
                flag = 1;
                break;
            }
        }

        if(flag == 0){
            System.out.println("It is a prime number");
        }
        else{
            System.out.println("It is not a prime number");
        }






    }
}
