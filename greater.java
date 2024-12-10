public class greater {
    public static void main(String[] args) {
        int num1,num2;

        num1 = Integer.parseInt(args[0]);
        num2 = Integer.parseInt(args[1]);

        if(num1>num2){
            System.out.println(num1 + "is greater than" + num2);
        }

        else if(num2>num1){
            System.out.println(num2 + " is greater than " + num1);
        }

        else{
            System.out.println("Both number is equal");
        }
    }
}
