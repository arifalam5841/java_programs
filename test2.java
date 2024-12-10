public class test2 {
    public static void main(String[] args) {
        int age;

        age = Integer.parseInt(args[0]);
        if(age>18){
            System.out.println("You can drive the car");
        }

        else{
            System.out.println("You cant drive the car");
        }
    }
}
