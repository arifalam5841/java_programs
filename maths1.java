public class maths1{
    public static void main(String[] args) {
        int a,b,c;
        String task;

        a = Integer.parseInt(args[0]);
        b = Integer.parseInt(args[1]);
        c = Integer.parseInt(args[2]);
        task = args[3];

        switch (task) {
            case "sum":
                 System.out.println("The sum of number : "+ (a+b+c));
                break;
        
                case "mul":
                System.out.println("The multiplication of number : "+ (a*b*c));
               break;

               case "avg":
               System.out.println("The sum of number : "+ (a+b+c)/3);
              break;
            default:
            System.out.println("Enter valid value");
                break;
        }
    }
}