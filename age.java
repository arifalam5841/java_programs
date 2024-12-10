public class age {
    public static void main(String[] args) {
        int ages;

        ages = Integer.parseInt(args[0]);

        if(ages > 18){
            System.out.println("You can drive the car");
        }

        else{
            System.out.println("You can't drive the car");
        }
    }
}
